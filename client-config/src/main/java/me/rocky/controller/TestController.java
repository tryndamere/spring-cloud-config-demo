package me.rocky.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rocky on 16/5/27.
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${client-message}")
    private String message;

    @RequestMapping("/msg")
    public String getMessage() {
        return this.message;
    }
}
