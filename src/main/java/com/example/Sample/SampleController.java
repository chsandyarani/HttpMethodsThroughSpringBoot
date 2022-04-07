package com.example.Sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {
    //listing the all employee details
    List list = new ArrayList<Employee>();


    //posting employee details
    @PostMapping("/post")
    public void add(@RequestBody Employee employee) {
        list.add(employee);
    }
    //retrieves employee detail
    @GetMapping("/get")
    public List<Employee> get() {

        return list;
    }
    //Deleting specific record
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id")  Employee id) {
        {
            list.clear();
        }
    }



//    @DeleteMapping("/del/{id}")
//  public ResponseEntity<Employee> deleteEmployee(@PathVariable int id) {
//  ` return new ResponseEntity("Employee Deleted", HttpStatus.OK);
//
//    }
//
//
//   @DeleteMapping("/del/{id}")
//       public void delete(@PathVariable("id") int id)
//   {
//
//   }
//   @PutMapping("/put/{id}")
//    public void put()
//}
}