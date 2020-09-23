package cn.xhb.service.impl;

import cn.xhb.dao.RoleDao;
import cn.xhb.domain.Role;
import cn.xhb.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    public List<Role> list() {
        List<Role> roleList=roleDao.findAll();
        return roleList;
    }

    public void save(Role role) {
        roleDao.save(role);
    }

    public void del(Long roleId) {
        roleDao.del(roleId);
    }
}
