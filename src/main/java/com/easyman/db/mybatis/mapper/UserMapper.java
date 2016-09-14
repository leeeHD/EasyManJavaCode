package com.easyman.db.mybatis.mapper;

import com.easyman.entity.User;

import java.util.List;

/**
 * Created by eldorado on 16-9-14.
 */
public interface  UserMapper {
    long insert(User user);

    long delete(long id);

    long update(User uer);

    User findUser(long id);

    List<User> findAllUsers();
}
