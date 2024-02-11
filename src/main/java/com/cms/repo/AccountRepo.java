package com.cms.repo;

import com.cms.entities.AccountEntity;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Long> {

}
