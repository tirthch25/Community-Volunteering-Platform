package com.Volunteering_platform.Communityplatform.service;

import com.Volunteering_platform.Communityplatform.model.user.User;
import com.Volunteering_platform.Communityplatform.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {

        return userRepository.save(user);
    }

    @Override
    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
        userRepository.save(user);
    }
//    MySQLDialect
    @Override
    public User update(User user) {

        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {

        userRepository.delete(user);
    }

    @Override
    public User findbyId(int id) {

        return userRepository.findById(id).orElseThrow();
    }
}
