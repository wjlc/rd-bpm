package org.activiti.custom;



import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.AbstractManager;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityManager;

import java.util.List;
import java.util.Map;

//public class CustomUserEntityManager extends UserEntityManager {
//
//    // 这个Bean就是公司提供的统一身份访问接口，可以覆盖UserEntityManager的任何方法用公司内部的统一接口提供服务
//    private CustomUserManager customUserManager;
//
//    @Override
//    public Boolean checkPassword(String userId, String password) {
////        CustomUser customUser = customUserManager.get(new Long(userId));
////        return CustomUser.getPassword().equals(password);
//        return null;
//    }
//
//    public void setCustomUserManager(CustomUserManager customUserManager) {
//        this.customUserManager = customUserManager;
//    }
//}


public class CustomUserEntityManager extends AbstractManager implements UserEntityManager {

    private CustomConfigurator customConfigurator;

    public CustomUserEntityManager(ProcessEngineConfigurationImpl processEngineConfiguration, CustomConfigurator customConfigurator) {
        super(processEngineConfiguration);
        this.customConfigurator = customConfigurator;
    }

    @Override
    public User createNewUser(String userId) {
        return null;
    }

    @Override
    public void updateUser(User updatedUser) {

    }

    @Override
    public List<User> findUserByQueryCriteria(UserQueryImpl query, Page page) {
        return null;
    }

    @Override
    public long findUserCountByQueryCriteria(UserQueryImpl query) {
        return 0;
    }

    @Override
    public List<Group> findGroupsByUser(String userId) {
        return null;
    }

    @Override
    public UserQuery createNewUserQuery() {
        return null;
    }

    @Override
    public Boolean checkPassword(String userId, String password) {
        return null;
    }

    @Override
    public List<User> findUsersByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return null;
    }

    @Override
    public long findUserCountByNativeQuery(Map<String, Object> parameterMap) {
        return 0;
    }

    @Override
    public boolean isNewUser(User user) {
        return false;
    }

    @Override
    public Picture getUserPicture(String userId) {
        return null;
    }

    @Override
    public void setUserPicture(String userId, Picture picture) {

    }

    @Override
    public void deletePicture(User user) {

    }

    @Override
    public UserEntity create() {
        return null;
    }

    @Override
    public UserEntity findById(String entityId) {
        return null;
    }

    @Override
    public void insert(UserEntity entity) {

    }

    @Override
    public void insert(UserEntity entity, boolean fireCreateEvent) {

    }

    @Override
    public UserEntity update(UserEntity entity) {
        return null;
    }

    @Override
    public UserEntity update(UserEntity entity, boolean fireUpdateEvent) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void delete(UserEntity entity) {

    }

    @Override
    public void delete(UserEntity entity, boolean fireDeleteEvent) {

    }
}
