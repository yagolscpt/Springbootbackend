package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Joke;
import com.example.demo.models.State;
import com.example.demo.repositories.JokeRepository;
import com.example.demo.repositories.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {
    @Autowired
    StateRepository stateRepository;

    public State saveJoke(State state){
        // INSERT INTO joke (text) VALUES('XXXXXX')
        State newState = stateRepository.save(state);
        return newState;
    }

    public ArrayList<State> getAllStates(){
        // SELECT * FROM joke
        ArrayList<State> states = (ArrayList<State>) stateRepository.findAll();
        return states;
    }

    public State getLastStates(){
        // SELECT * FROM joke
        ArrayList<State> states = (ArrayList<State>) stateRepository.findAll();
        return states.get(states.size()-1);
    }
    public State getFirstStates(){
        // SELECT * FROM joke
        ArrayList<State> states = (ArrayList<State>) stateRepository.findAll();
        return states.get(0);
        
    }
}
