package com.niit.service;

import com.niit.domain.Admin;
import com.niit.exception.AdminNotFoundException;


public interface AdminService {

    public Admin findBynameAndPassword(String name, String password)throws AdminNotFoundException;
}
