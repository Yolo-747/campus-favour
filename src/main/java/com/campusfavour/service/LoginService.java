package com.campusfavour.service;

import com.campusfavour.entity.User;

public interface LoginService {
    User getUserByName(String name);
}
