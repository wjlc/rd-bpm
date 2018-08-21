package org.activiti.custom.impl;

import org.activiti.custom.AiaRoleDao;
import org.activiti.custom.CustomRoleManager;
import org.activiti.custom.entity.AiaRole;

import java.util.List;

public class CustomRoleManagerImpl implements CustomRoleManager {

    private AiaRoleDao dao;

    public void setDao(AiaRoleDao dao) {
        this.dao = dao;
    }

    @Override
    public AiaRole get(Long id) {
        return null;
    }

    @Override
    public List<AiaRole> findByUserId(Long userId) {
        return dao.findByUserId(userId);
    }

    @Override
    public AiaRole save(AiaRole role) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
