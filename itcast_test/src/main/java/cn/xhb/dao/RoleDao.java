package cn.xhb.dao;

import cn.xhb.domain.Role;
import java.util.List;


public interface RoleDao {

    List<Role> findAll();

    List<Role> findRoleById(Long id);

    void save(Role role);

    void del(Long roleId);
}
