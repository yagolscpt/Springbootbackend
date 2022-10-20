package com.example.demo.repositories;

import org.springframework.stereotype.Repository;
import com.example.demo.models.State;

import org.springframework.data.repository.CrudRepository;
//CRUD
@Repository
public interface StateRepository extends CrudRepository<State, Long> {
    
}
