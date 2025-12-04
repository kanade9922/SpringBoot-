package com.Marvellous.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    @Autowired
    HDD hobj;

    @Autowired
    Microprocessor mobj;

    @GetMapping("Display")
    public  String LaptopInformation()
    {
        return hobj.HDDInformation() + " | " +mobj.MicroProcessorInformation();
    }
}
