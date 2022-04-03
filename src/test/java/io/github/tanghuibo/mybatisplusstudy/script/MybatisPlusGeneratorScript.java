package io.github.tanghuibo.mybatisplusstudy.script;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

/**
 * @author tanghuibo
 * @date 2022/4/4上午1:05
 */
class MybatisPlusGeneratorScript {


    @Test
    void test() throws IOException {
        generateCode(MybatisPlusGeneratorScript.class);
    }

    public void generateCode(Class<?> clazz) throws IOException {
        try (InputStream inputStream = clazz.getResourceAsStream("/mybatis-plus-generator.properties")) {
            generateCode(inputStream);
        }
    }

    public void generateCode(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        generateCode(properties);
    }

    public void generateCode(Properties properties) {
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String author = properties.getProperty("author");
        String aPackage = properties.getProperty("package");
        String xmlPath = properties.getProperty("xmlPath", "mapper");
        String mainFilePath = firstNotEmpty(properties.getProperty("mainPath"), new File("src" + File.separator + "main").getAbsolutePath());
        boolean fileOverride = properties.getProperty("fileOverride", "false").equals("true");
        String[] tables = properties.getProperty("tables").split(",");

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author(author) // 设置作者
                            .outputDir(mainFilePath + File.separator + "java"); // 指定输出目录
                    if(fileOverride) {
                        builder.fileOverride();
                    }
                })
                .packageConfig(builder -> {
                    builder.parent(aPackage) // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, mainFilePath + File.separator + "resources" + File.separator + xmlPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    for (String table : tables) {
                        builder.addInclude(table); // 设置需要生成的表名
                    }
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .templateConfig(builder -> builder.disable(TemplateType.CONTROLLER))
                .strategyConfig(builder -> builder.mapperBuilder()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .enableMapperAnnotation())
                .execute();
    }

    private String firstNotEmpty(String... strs) {

        for (String str : strs) {
            if(str != null && !"".equals(str.trim())) {
                return str;
            }
        }
        return "";
    }
}
