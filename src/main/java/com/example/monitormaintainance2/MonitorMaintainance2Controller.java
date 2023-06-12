package com.example.monitormaintainance2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorMaintainance2Controller {
    public String defaultMessage="Message";
    public String message = defaultMessage;

    @RequestMapping("/")
    public String defaultwebseite(){
        return message;
    }

}
