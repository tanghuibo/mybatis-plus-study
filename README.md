# mybatis-plus 学习

## 代码自动生成

脚本: MybatisPlusGeneratorScript.java，运行 test 方法即可生成代码

配置: mybatis-plus-generator.properties

|名称|说明|示例|
|---|---|---|
|url|数据库url|jdbc:mysql://localhost:3306/mybatis_plus_study_01|
|username|数据库用户名|root|
|password|数据库密码|******|
|author|作者(用于生成java doc)|tanghuibo|
|package|包名|io.github.tanghuibo|
|xmlPath|xml存放位置，默认 mapper|mapper|
|fileOverride|是否覆盖已有文件 true or false|false|
|tables|表名称，多个以 , 隔开|table1,table2|
|mainPath|工程地址，默认为当前工程|d:\\workspace|