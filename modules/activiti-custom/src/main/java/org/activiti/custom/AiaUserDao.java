package org.activiti.custom;

import org.activiti.custom.entity.AiaUser;

public interface AiaUserDao {

    AiaUser save(AiaUser aiaUser);

    void delete(Long id);

    AiaUser get(Long id);

    AiaUser findByLoginName(String loginName);
}
