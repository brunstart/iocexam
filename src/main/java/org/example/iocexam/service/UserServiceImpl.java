package org.example.iocexam.service;

import org.example.iocexam.domain.User;
import org.example.iocexam.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {}

    @Autowired
    // UserDao 타입이 하나면 그냥 타입 맞는거 찾아서 연결, 두개면 연결 못함, repository 하나가 userDao로 ID를 설정하면 연결해줌
    // @Qualifier("")로 주입을 받는 쪽에서 ID 지정을 할 수도 있음
    public UserServiceImpl(@Qualifier("userDaoImpl")UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void joinUser(User user) {
        userDao.addUser(user);
    }
}
