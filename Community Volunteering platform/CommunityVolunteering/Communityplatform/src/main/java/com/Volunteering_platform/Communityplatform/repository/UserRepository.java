package com.Volunteering_platform.Communityplatform.repository;

import com.Volunteering_platform.Communityplatform.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
