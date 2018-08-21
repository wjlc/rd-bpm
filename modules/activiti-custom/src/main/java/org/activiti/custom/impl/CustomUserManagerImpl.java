package org.activiti.custom.impl;


import org.activiti.custom.AiaUserDao;
import org.activiti.custom.CustomUserManager;
import org.activiti.custom.entity.AiaUser;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.User;

public class CustomUserManagerImpl implements CustomUserManager {

    private AiaUserDao dao;
    private IdentityService identityService;

    public void setDao(AiaUserDao dao) {
        this.dao = dao;
    }

    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }

    @Override
    public AiaUser get(Long id) {
        return dao.get(id);
    }

    @Override
    public AiaUser findByLoginName(String loginName) {
        return dao.findByLoginName(loginName);
    }

    @Override
    public AiaUser save(AiaUser user) {
        dao.save(user);
        User activitiUser = null;
        if (user.getId() == null) {
            activitiUser = identityService.newUser(user.getId().toString());
        } else {
            activitiUser = identityService.createUserQuery()
                    .userId(user.getId().toString()).singleResult();
            /** 省略代码 -> 复制user的属性到activitiUser */
            identityService.saveUser(activitiUser);
        }
        return user;
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
