package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Greeter;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements GreeterService {
    @Override
    public Greeter greet(String name, String title) {
        return new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
    }
}
