package com.Volunteering_platform.Communityplatform.repository.user;

import com.Volunteering_platform.Communityplatform.model.user.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {
    Optional<Volunteer> findByEmail(String email);
}
