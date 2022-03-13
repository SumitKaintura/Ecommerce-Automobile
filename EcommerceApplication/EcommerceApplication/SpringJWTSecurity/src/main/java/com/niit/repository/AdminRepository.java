package com.niit.repository;

import com.niit.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,String> {
    public Admin findBynameAndPassword(String name, String password);
}
