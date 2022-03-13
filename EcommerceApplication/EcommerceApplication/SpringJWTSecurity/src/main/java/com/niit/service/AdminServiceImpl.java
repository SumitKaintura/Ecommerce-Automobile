package com.niit.service;

import com.niit.domain.Admin;
import com.niit.exception.AdminNotFoundException;
import com.niit.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin findBynameAndPassword(String name, String password) throws AdminNotFoundException {
        Admin admin=adminRepository.findBynameAndPassword(name, password);
        if(admin==null) {
            throw new AdminNotFoundException();
        }
        return admin;
    }

}
