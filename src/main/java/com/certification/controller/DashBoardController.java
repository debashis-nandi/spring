/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DN9
 */
@Controller
public class DashBoardController {

    /**
     *
     * @param m
     * @param request
     * @return
     */
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String GetDashBoard(ModelMap m, HttpServletRequest request) {
        if( request.getSession().getAttribute("isLogin") == null)
              return "redirect:login";
        m.addAttribute("dashBoardMessage", "Welcome to dash board!");
        return "dashboard";
    }
}
