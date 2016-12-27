/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification.controller;

import com.certification.domain.Login;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DN9
 */
@Controller
public class HomeController {
   
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String GetLogin(ModelMap m) {
        m.addAttribute("errorMessage", "");
        m.addAttribute("login", new Login());
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    
    public String PostLogin(@ModelAttribute Login login, ModelMap m, HttpServletRequest request) {
        
        if ("debashis".equals(login.getUserid()) && "password".equals(login.getPassword())) {
            request.getSession().setAttribute("isLogin", "true");
            return "redirect:dashboard";
        } else {
     
            
            m.addAttribute("errorMessage", "Invalid userid and password.");
            return "login";
        }
        
    }
}
