package com.aron.vpythontech.service.systemUser;

import com.aron.vpythontech.dao.systemUser.SystemUserDao;
import com.aron.vpythontech.entity.systemUser.SystemUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SystemUserService
 * @Description TODO
 * @Author aron
 * @Date 2020/9/21 10:20
 **/
@Service
public class SystemUserService {

    protected final static Logger logger = LoggerFactory.getLogger(SystemUserService.class);

    @Autowired
    private SystemUserDao dao;

    public SystemUser getSystemUserByName(SystemUser systemUser){
        return dao.getSystemUserByName(systemUser);
    }

}
