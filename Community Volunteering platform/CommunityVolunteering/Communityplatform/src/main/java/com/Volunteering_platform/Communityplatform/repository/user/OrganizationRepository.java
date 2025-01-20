package com.Volunteering_platform.Communityplatform.repository.user;

import com.Volunteering_platform.Communityplatform.model.user.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    Optional<Organization> findByEmail(String email);
}
