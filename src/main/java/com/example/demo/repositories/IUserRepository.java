package com.example.demo.repositories;

import com.example.demo.models.CUser;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<CUser, Integer> {


}
