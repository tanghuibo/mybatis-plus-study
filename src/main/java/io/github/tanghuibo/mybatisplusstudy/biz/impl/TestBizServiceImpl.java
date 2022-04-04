package io.github.tanghuibo.mybatisplusstudy.biz.impl;

import io.github.tanghuibo.mybatisplusstudy.biz.TestBizService;
import io.github.tanghuibo.mybatisplusstudy.entity.RoleInfo;
import io.github.tanghuibo.mybatisplusstudy.entity.User;
import io.github.tanghuibo.mybatisplusstudy.service.IRoleInfoService;
import io.github.tanghuibo.mybatisplusstudy.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author tanghuibo
 * @date 2022/4/5上午2:39
 */
@Service
public class TestBizServiceImpl implements TestBizService {

    @Resource
    IUserService userService;

    @Resource
    IRoleInfoService roleInfoService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addData(boolean throwError) {
        User user = new User();
        user.setName("test");
        user.setAge(1);
        user.setEmail("test@qq.com");
        userService.save(user);

        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setCode("testCode");
        roleInfoService.save(roleInfo);

        if (throwError) {
            throw new RuntimeException("thb-test");
        }
    }
}
