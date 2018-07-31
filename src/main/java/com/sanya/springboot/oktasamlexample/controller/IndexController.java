/**
 * 
 */
package com.sanya.springboot.oktasamlexample.controller;

/**
 * @author sanya_s
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}