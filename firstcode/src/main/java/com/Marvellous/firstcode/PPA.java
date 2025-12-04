package com.Marvellous.firstcode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PPA
{
    @GetMapping("Start")
    public String Display()
    {
        return "Jay Ganesh...";
    }

    @GetMapping("Stop")
    public  String Demo()
    {
        return "Thank you for using Marvellous App";
    }

}
