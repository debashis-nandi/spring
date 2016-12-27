/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification.domain;

/**
 *
 * @author DN9
 */
public class Login {
    
    private String userid;
    private String password;

   /* public Login() {
        super();
    }
 
    // 3-arg parameterized-constructor
    public Login(String userid, String password) {
        super();
        this.userid = userid;
        this.password = password;
     
    }*/
    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
