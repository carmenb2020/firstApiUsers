package com.example.demo.services;

import com.example.demo.models.CUser;
import com.example.demo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CUserService {
    @Autowired
    IUserRepository iuserRepository;

    public String saveUser(CUser cUser) {
        try{
            iuserRepository.save(cUser);
            return "Added";
        }catch(Exception error) {
            return error.getMessage();
        }
    }
    public CUser getUser(int Id){
        return iuserRepository.findById(Id).orElse(null);
    }

    public ArrayList<CUser> getUsers(){
        return (ArrayList<CUser>) iuserRepository.findAll();
    }

    public String deleteUserById(int id){
        try{
            iuserRepository.deleteById(id);
            return "Deleted Id " + id;
        }
        catch(Exception error){
            return error.getMessage();
        }
    }

    public String updateUser(CUser updateUser) {
        try {
            if (iuserRepository.existsById(updateUser.getId())) {
                iuserRepository.save(updateUser);
                return ("Updated: " + updateUser.getId());
            } else {
                return ("ID " + +updateUser.getId() + " doesn´t exists :");
            }
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
}
