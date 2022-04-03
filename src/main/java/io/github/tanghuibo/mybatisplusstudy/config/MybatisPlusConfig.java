package io.github.tanghuibo.mybatisplusstudy.config;

import io.github.tanghuibo.mybatisplusstudy.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuibo
 * @date 2022/4/4上午3:42
 */
@MapperScan(basePackageClasses = UserMapper.class)
@Configuration
public class MybatisPlusConfig {
}
