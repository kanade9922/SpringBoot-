package com.Marvellous.Marvellous_Portal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck
{
    @GetMapping("Check")
    public String CheckStatus()
    {
        return "Marvellous Portal is Live";
    }
}
