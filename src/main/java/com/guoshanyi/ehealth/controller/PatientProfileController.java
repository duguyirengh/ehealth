package com.guoshanyi.ehealth.controller;
  
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;

import com.guoshanyi.ehealth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





/*
 * 用户注册功能
 */

@Controller
public class PatientProfileController {  
   // @Resource
    @Autowired
    private UserService userService;

    @RequestMapping("/patientProfilePrepare")  
    public String toPatientProfile(HttpServletRequest request,Model model){ 
    	//LoginUser user = SessionUtil.getLoginUser();
        return "patientProfile";  
    }  

    
}  