package io.github.tanghuibo.mybatisplusstudy.service;

import io.github.tanghuibo.mybatisplusstudy.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tanghuibo
 * @date 2022/4/4上午3:44
 */
@SpringBootTest
class IUserServiceTest {

    Logger log = LoggerFactory.getLogger(IUserService.class);

    @Resource
    IUserService userService;

    @Test
    void getLst() {
        List<User> list = userService.list();
        log.info("result: {}", list);
    }

}