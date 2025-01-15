package com.Volunteering_platform.Communityplatform.repository.user;

import com.Volunteering_platform.Communityplatform.model.user.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {
    Volunteer findByEmail(String email);
}
