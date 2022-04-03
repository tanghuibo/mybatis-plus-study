package io.github.tanghuibo.mybatisplusstudy.service.impl;

import io.github.tanghuibo.mybatisplusstudy.entity.User;
import io.github.tanghuibo.mybatisplusstudy.mapper.UserMapper;
import io.github.tanghuibo.mybatisplusstudy.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tanghuibo
 * @since 2022-04-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
