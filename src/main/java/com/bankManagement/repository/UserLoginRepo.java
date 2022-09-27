package com.bankManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankManagement.model.User;

@Repository
public interface UserLoginRepo extends JpaRepository<User, Integer> {

}
