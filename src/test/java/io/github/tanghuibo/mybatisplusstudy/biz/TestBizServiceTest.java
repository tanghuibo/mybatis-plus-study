package io.github.tanghuibo.mybatisplusstudy.biz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tanghuibo
 * @date 2022/4/5上午2:38
 */
@SpringBootTest
class TestBizServiceTest {

    @Resource
    TestBizService testBizService;

    @Test
    void addData() {
        testBizService.addData(true);
    }
}