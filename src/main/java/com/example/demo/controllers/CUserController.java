package com.example.demo.controllers;

import com.example.demo.models.CUser;
import com.example.demo.repositories.IUserRepository;
import com.example.demo.services.CUserService;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.ArrayList;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "http://localhost")
public class CUserController {
    @Autowired
    private CUserService cUserService;

    @GetMapping(path="/list")
    public ArrayList<CUser> getUsers(){
        return cUserService.getUsers();
    }

    @GetMapping(path = "/list/{id}")
    public CUser getUserById(@PathVariable int id){
        return cUserService.getUser(id);
    }


    @PostMapping(path = "/add")
    public String addUser(@RequestBody CUser cUser) {
        return (cUserService.saveUser(cUser));
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteUserById(@PathVariable int id){
        return cUserService.deleteUserById(id);
    }

    @PutMapping(path = "/update/{id}")
    public String updateUser (@PathVariable int id, @RequestBody CUser cUser) {
        cUser.setId(id);
        return (cUserService.updateUser(cUser));
    }

}
