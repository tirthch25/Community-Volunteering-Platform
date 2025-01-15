package com.Volunteering_platform.Communityplatform.repository.user;

import com.Volunteering_platform.Communityplatform.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

    void deleteByEmail(String email);
}
