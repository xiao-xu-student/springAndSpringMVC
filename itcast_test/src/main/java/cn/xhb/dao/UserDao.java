package cn.xhb.dao;

import cn.xhb.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long userId, Long[] roleIds);

    void delUserRoleRle(Long userId);

    void del(Long userId);
}
