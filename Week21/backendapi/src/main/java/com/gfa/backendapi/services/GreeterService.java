package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Greeter;


public interface GreeterService{

    Greeter greet(String name, String title);

}
