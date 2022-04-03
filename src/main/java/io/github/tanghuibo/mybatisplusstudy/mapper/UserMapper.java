package io.github.tanghuibo.mybatisplusstudy.mapper;

import io.github.tanghuibo.mybatisplusstudy.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tanghuibo
 * @since 2022-04-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取第一个
     * @return
     */
    User getFirst();

}
