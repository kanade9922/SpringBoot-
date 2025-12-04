package com.Marvellous.MarvellousStudent_Portal.Controller;

import com.Marvellous.MarvellousStudent_Portal.Entity.StudentEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentEntryController
{
     private Map <Long, StudentEntry> studententries = new HashMap<>();

     @GetMapping
    public List<StudentEntry> getAll()
     {
         return new ArrayList<>(studententries.values());
     }

     @GetMapping("/Rollno/{myollno}")
    public StudentEntry getStudentEntryByRollno(@PathVariable Long myrollno)
     {
         return studententries.get(myrollno);
     }

     @PostMapping
    public  String createEntry(@RequestBody StudentEntry myentry)
     {
         studententries.put(myentry.getRollno(), myentry);
         return "Data inserted successfully..";
     }

     @DeleteMapping("/Rollno/{myollno}")
    public StudentEntry deleteEntryByRollno(@PathVariable Long myrollno)
     {
         return studententries.remove(myrollno);
     }

     @PutMapping("/Rollno/{myrollno}")
         public StudentEntry updateEntryByRollno(@PathVariable long myrollno, @RequestBody StudentEntry myentry)
         {
             return studententries.put(myentry.getRollno(),myentry);
         }
}
