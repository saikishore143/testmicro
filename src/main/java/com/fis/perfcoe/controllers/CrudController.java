package com.fis.perfcoe.controllers;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;

import com.fis.perfcoe.models.CrudDTO;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CrudController {
   
    private static final String template = "Hello, %s!";

   @PostMapping("/greeting")
    public CrudDTO greeting(@Valid @RequestBody String name) {
        //System.out.println("==== in greeting ====");
	   CrudDTO crudDTO =new CrudDTO();
	   crudDTO.setName(name);
	   crudDTO.setSurname("xyz");
       return crudDTO;
    }
}