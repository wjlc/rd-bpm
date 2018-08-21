package org.activiti.custom;

import org.activiti.custom.entity.AiaUser;

public interface CustomUserManager {
    // 根据ID查询用户
    AiaUser get(Long id);

    // 根据登录名查询用户
    AiaUser findByLoginName(String loginName);

    // 保存用户
    AiaUser save(AiaUser aiaUser);

    // 删除用户
    void delete(Long id);
}
