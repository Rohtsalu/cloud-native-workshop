package com.gitlab.rohtsalu.app.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Gunnar Rohtsalu, Finestmedia, gunnar.rohtsalu@finestmedia.ee
 */
@RestController
public class LogoutResource {

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {

        session.invalidate();
        return "Logout done!";
    }
}
