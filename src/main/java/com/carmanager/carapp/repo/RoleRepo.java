package com.carmanager.carapp.repo;

import com.carmanager.carapp.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepo extends JpaRepository<Role,Long> {
//    @Query("SELECT r FROM Role r WHERE r.rolename = ?1")
    Role findByName(String name);
}
