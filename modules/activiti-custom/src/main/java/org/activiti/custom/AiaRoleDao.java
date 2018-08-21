package org.activiti.custom;

import org.activiti.custom.entity.AiaRole;

import java.util.List;

public interface AiaRoleDao {

    // 根据ID查询角色
    AiaRole get(Long id);

    // 根据用户ID查询拥有的角色
    List<AiaRole> findByUserId(Long userId);

    // 保存角色
    AiaRole save(AiaRole role);

    // 删除角色
    void delete(Long id);

}
