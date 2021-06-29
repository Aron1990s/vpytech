package com.aron.vpythontech.dao.systemUser;

import com.aron.vpythontech.dao.baseMapper.BaseMapper;
import com.aron.vpythontech.entity.systemUser.SystemUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SystemUserDao extends BaseMapper<SystemUser> {
    SystemUser getSystemUserByName(SystemUser systemUser);
}
