package com.raju.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raju.authentication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	
	User findByEmail (String email);
}
