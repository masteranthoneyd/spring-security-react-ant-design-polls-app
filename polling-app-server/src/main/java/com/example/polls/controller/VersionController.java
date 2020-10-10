package com.example.polls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@RestController
@RequestMapping("/api/version")
public class VersionController {

    @GetMapping
    public String version() {
        return "V1";
    }
}
