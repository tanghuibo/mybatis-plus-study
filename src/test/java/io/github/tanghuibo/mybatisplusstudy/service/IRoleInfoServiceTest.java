package io.github.tanghuibo.mybatisplusstudy.service;

import io.github.tanghuibo.mybatisplusstudy.entity.RoleInfo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;


/**
 * @author tanghuibo
 * @date 2022/4/5上午2:21
 */
@SpringBootTest
class IRoleInfoServiceTest {

    Logger log = LoggerFactory.getLogger(IRoleInfoServiceTest.class);

    @Resource
    IRoleInfoService roleInfoService;

    @Test
    void getLst() {
        List<RoleInfo> list = roleInfoService.list();
        log.info("result: {}", list);
    }

}