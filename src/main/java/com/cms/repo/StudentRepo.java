package com.cms.repo;

import com.cms.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Long> {
}
