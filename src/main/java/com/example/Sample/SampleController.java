package com.example.Sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController

public class SampleController {
    //listing the all employee details
    List<Employee> list = new ArrayList();


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

    //Deleting specific record using id
    @DeleteMapping("/del/{id}")

    public void delete(@PathVariable String id) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId()==id) {
                list.remove(employee);

            }

        }

    }
    //updating entire record

    @PutMapping("/{id}")
    public void put(@PathVariable String id, @RequestBody Employee employee1) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId().equals(id)) {
                list.remove(employee);
                list.add(employee1);
            }


        }
    }
    // updating specific fields of a record
    @PatchMapping("/patch")
    public void patch(@PathVariable String name, @RequestBody Employee employee) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee1 = iterator.next();
            if (employee1.getName().equals(name)) {
                employee1.setName(employee.getName());
                list.add(employee);
            }

            }



        }
    }



