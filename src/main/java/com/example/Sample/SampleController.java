package com.example.Sample;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    List list = new ArrayList<Employee>();

    @PostMapping("/add")
    public void add(@RequestBody Employee employee) {
        list.add(employee);
    }

    @GetMapping("/get")
    public List<Employee> get() {
        return list;
    }

    @DeleteMapping("/del")
    public List<Employee> employeeList() {
        list.remove(employeeList())

                
}