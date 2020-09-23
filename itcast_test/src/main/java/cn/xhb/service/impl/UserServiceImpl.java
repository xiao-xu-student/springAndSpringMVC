package cn.xhb.service.impl;

import cn.xhb.dao.RoleDao;
import cn.xhb.dao.UserDao;
import cn.xhb.domain.Role;
import cn.xhb.domain.User;
import cn.xhb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;


    public List<User> list() {
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            Long id = user.getId();
          List<Role> roles= roleDao.findRoleById(id);
          user.setRoles(roles);
        }
        return userList;
    }

    public void save(User user, Long[] roleIds) {
        //第一步 向sys_user表中存储数据
        Long userId = userDao.save(user);
        //第二步 向sys_user_role 关系表中存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);
    }

    public void del(Long userId) {

        userDao.delUserRoleRle(userId);
        userDao.del(userId);

    }
}
