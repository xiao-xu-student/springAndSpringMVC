package cn.xhb.service;

import cn.xhb.domain.User;

import java.util.List;


public interface UserService {
    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);
}
