package com.carmanager.carapp.repo;

import com.carmanager.carapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Long> {

//    @Query("SELECT s FROM User s WHERE s.username = ?1")
    User findUserByUsername(String username);
}
