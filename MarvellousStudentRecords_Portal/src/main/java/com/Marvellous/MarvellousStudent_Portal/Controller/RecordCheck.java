package com.Marvellous.MarvellousStudent_Portal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordCheck
{
    @GetMapping("Record")
    public  String RecordStatus()
    {
        return  "Welcome to Marvellous Student API";
    }
}

