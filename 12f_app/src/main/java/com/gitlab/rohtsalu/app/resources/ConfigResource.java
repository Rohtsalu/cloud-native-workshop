package com.gitlab.rohtsalu.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gunnar Rohtsalu, Finestmedia, gunnar.rohtsalu@finestmedia.ee
 */
@RestController
@RequestMapping(value = "/config", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConfigResource {

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/get-env", method = RequestMethod.GET)
    public String getEnv(@RequestParam String env) {
        return "Env" + " " + environment.getProperty(env);
    }


}
