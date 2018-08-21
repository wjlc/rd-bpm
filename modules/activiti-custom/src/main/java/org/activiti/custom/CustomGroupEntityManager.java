package org.activiti.custom;

import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.activiti.engine.impl.GroupQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.AbstractManager;
import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.activiti.engine.impl.persistence.entity.GroupEntityManager;

import java.util.List;
import java.util.Map;

//public class CustomGroupEntityManager extends AbstractManager implements GroupEntityManager {
//
//    // 这个Bean就是公司提供的统一身份访问接口，可以覆盖UserEntityManager的任何方法用公司内部的统一接口提供服务
//    private CustomRoleManager customRoleManager;
//
//    @Override
//    public Boolean checkPassword(String userId, String password) {
////        CustomUser customUser = customUserManager.get(new Long(userId));
////        return CustomUser.getPassword().equals(password);
//        return null;
//    }
//
//
//    public void setCustomRoleManager(CustomRoleManager customRoleManager) {
//        this.customRoleManager = customRoleManager;
//    }
//}


public class CustomGroupEntityManager extends AbstractManager implements GroupEntityManager {

    private CustomConfigurator customConfigurator;

    public CustomGroupEntityManager(ProcessEngineConfigurationImpl processEngineConfiguration, CustomConfigurator customConfigurator) {
        super(processEngineConfiguration);
        this.customConfigurator = customConfigurator;
    }

    @Override
    public Group createNewGroup(String groupId) {
        return null;
    }

    @Override
    public GroupQuery createNewGroupQuery() {
        return null;
    }

    @Override
    public List<Group> findGroupByQueryCriteria(GroupQueryImpl query, Page page) {
        return null;
    }

    @Override
    public long findGroupCountByQueryCriteria(GroupQueryImpl query) {
        return 0;
    }

    @Override
    public List<Group> findGroupsByUser(String userId) {
        return null;
    }

    @Override
    public List<Group> findGroupsByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return null;
    }

    @Override
    public long findGroupCountByNativeQuery(Map<String, Object> parameterMap) {
        return 0;
    }

    @Override
    public boolean isNewGroup(Group group) {
        return false;
    }

    @Override
    public GroupEntity create() {
        return null;
    }

    @Override
    public GroupEntity findById(String entityId) {
        return null;
    }

    @Override
    public void insert(GroupEntity entity) {

    }

    @Override
    public void insert(GroupEntity entity, boolean fireCreateEvent) {

    }

    @Override
    public GroupEntity update(GroupEntity entity) {
        return null;
    }

    @Override
    public GroupEntity update(GroupEntity entity, boolean fireUpdateEvent) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void delete(GroupEntity entity) {

    }

    @Override
    public void delete(GroupEntity entity, boolean fireDeleteEvent) {

    }
}
