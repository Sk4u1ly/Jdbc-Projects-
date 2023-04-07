package com.StudentaApp.model;

import java.sql.ResultSet;

public interface DaoService {
public void connectionDB();
public boolean verifyCredentials(String userid,String passwd);
public void saveReg(String name, String city, String email, String mobile);
public ResultSet ListRegistration();
public void deleteByEmail(String email);

public void updateReg(String email, String mobile);


}



// we achive abstration here in model layer my project where we writen two abstract method 
// i could planning what method required here for impliments of projects 
