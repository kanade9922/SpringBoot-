package com.Marvellous.Marvellous_Portal.Controller;

import com.Marvellous.Marvellous_Portal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map <Long, BatchEntry> batchentries = new HashMap<>();

    // select * from batches;
    @GetMapping
    public List<BatchEntry> getAll()
    {
        return new ArrayList<>(batchentries.values());
    }

    // select * from batches where id = 3
    @GetMapping("/id/{myid}")
    public BatchEntry getBatchEntryById(@PathVariable Long myid)
    {
        return batchentries.get(myid);
    }

    // insert into batches values(1,'PPA',27000);
    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(),myentry);
        return "Data Inserted successfully";
    }


    // delete from batches where id = 2;
    @DeleteMapping("/id/{myid}")
    public BatchEntry deleteEntryById(@PathVariable Long myid)
    {
        return batchentries.remove(myid);
    }

    // update batches set fees = 29000 where id = 2;
    @PutMapping("/id/{myid}")
    public BatchEntry updateEntryById(@PathVariable long myid , @RequestBody BatchEntry myentry)
    {

       return batchentries.put(myentry.getId(), myentry);

    }
}
