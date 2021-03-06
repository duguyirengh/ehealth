package com.guoshanyi.ehealth.service;

import com.guoshanyi.ehealth.model.User;

public interface UserService {  
    public User getUserById(int userId);
    public boolean deleteUnfinishedUser();
    public boolean registerUserOne(User user);
    public boolean updateUser(User user);
    public int findUser(String tel);
    public boolean registerUserTwo(User user);
}  