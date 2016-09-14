package com.easyman.db.mybatis.service;

import com.easyman.db.mybatis.mapper.UserMapper;
import com.easyman.entity.User;
import com.easyman.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by eldorado on 16-9-14.
 */
public class UserService {

    public long insert(User user) {
        SqlSessionFactory factory = MyBatisUtil.getFactory();
        SqlSession session = factory.openSession();
        try{
            UserMapper mapper = session.getMapper(UserMapper.class);
            return mapper.insert(user);
        } finally {
            session.close();
        }
    }

    public void delete(int id) {

    }

    public void update(User user){

    }

    public User findUser(int id){
        SqlSessionFactory factory = MyBatisUtil.getFactory();
        SqlSession session = factory.openSession();
        try{
            UserMapper mapper = session.getMapper(UserMapper.class);
            return mapper.findUser(id);
        } finally {
            session.close();
        }
    }

    public List<User> findAllUsers(){
        return null;
    }
}
