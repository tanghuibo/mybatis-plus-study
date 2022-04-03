package io.github.tanghuibo.mybatisplusstudy.mapper;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author tanghuibo
 * @date 2022/4/4上午3:56
 */
@SpringBootTest
class UserMapperTest {
    Logger log = LoggerFactory.getLogger(UserMapperTest.class);
    @Resource
    UserMapper userMapper;

    @Test
    void getFirstTest() {
        log.info("result: {}", userMapper.getFirst());
    }

}