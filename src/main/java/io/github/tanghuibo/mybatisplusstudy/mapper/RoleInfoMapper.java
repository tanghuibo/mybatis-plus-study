package io.github.tanghuibo.mybatisplusstudy.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import io.github.tanghuibo.mybatisplusstudy.entity.RoleInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tanghuibo
 * @since 2022-04-05
 */
@Mapper
@DS("db2")
public interface RoleInfoMapper extends BaseMapper<RoleInfo> {

}
