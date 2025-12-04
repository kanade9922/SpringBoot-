package com.Marvellous.Marvellous_Portal.Controller;

import com.Marvellous.Marvellous_Portal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map <Long, BatchEntry> batchentries = new HashMap<>();
    @GetMapping
    public String getAll()
    {
        return "Inside Get HTTP GET verb";
    }

    @PostMapping
    public String createEntry()
    {
        
    }

    @DeleteMapping
    public String deleteEntryById()
    {
        return "Inside Get HTTP DELETE verb";
    }

    @PutMapping
    public String updateEntryById()
    {
        return "Inside Get HTTP PUT verb";
    }



}
