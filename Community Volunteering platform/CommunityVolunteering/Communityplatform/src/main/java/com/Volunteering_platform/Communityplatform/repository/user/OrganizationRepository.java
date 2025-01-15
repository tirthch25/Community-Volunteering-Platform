package com.Volunteering_platform.Communityplatform.repository.user;

import com.Volunteering_platform.Communityplatform.model.user.Organization;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    Organization findByEmail(String email);
}
