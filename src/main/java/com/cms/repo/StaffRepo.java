package com.cms.repo;

import com.cms.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<StaffEntity, Long> {
}
