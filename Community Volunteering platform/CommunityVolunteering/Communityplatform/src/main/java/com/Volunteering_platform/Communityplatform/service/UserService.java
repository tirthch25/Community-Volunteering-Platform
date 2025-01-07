package com.Volunteering_platform.Communityplatform.service;

import com.Volunteering_platform.Communityplatform.model.user.User;


public interface UserService {
    // Create a user
    User create(User user);

    // Change password
    void changePassword(User user, String newPasword);

    // Update user
    User update(User user);

    // Delete user
    void delete(User user);

    User findbyId(int id);
}
