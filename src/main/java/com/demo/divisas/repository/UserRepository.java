package com.demo.divisas.repository;

import com.demo.divisas.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

  UserEntity findByUserName(String userName);
}
