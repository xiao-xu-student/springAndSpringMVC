package cn.xhb.service;
import cn.xhb.domain.Role;
import java.util.List;


public interface RoleService {
    public List<Role> list();

    void save(Role role);


    void del(Long roleId);
}
