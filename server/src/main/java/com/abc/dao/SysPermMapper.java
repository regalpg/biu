package com.abc.dao;

import com.abc.entity.SysPerm;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysPermMapper extends BaseMapper<SysPerm> {

    List<SysPerm> getPermsByUserId(@Param("userId") String userId);

    List<SysPerm> getPermValsByRoleId(@Param("roleId") String roleId);

    void batchInsertIgnore(@Param("perms") List<SysPerm> perms);

}