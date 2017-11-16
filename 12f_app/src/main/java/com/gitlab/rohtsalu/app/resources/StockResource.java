package com.gitlab.rohtsalu.app.resources;

import com.gitlab.rohtsalu.app.domain.model.StockItem;
import com.gitlab.rohtsalu.app.respository.StockItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Gunnar Rohtsalu, Finestmedia, gunnar.rohtsalu@finestmedia.ee
 */
@RestController
@RequestMapping(value = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
public class StockResource {

    @RequestMapping(value = "/pong", method = RequestMethod.GET)
    public String ping() {
        return "Ping";
    }

}
