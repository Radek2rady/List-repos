package com.gfa.backendapi.services;

import org.springframework.stereotype.Service;


public interface ArrayHandlerService {
    Integer sum(Integer[] numbers);
    Integer multiply(Integer[] numbers);
    Integer[] doubling(Integer[] numbers);
}
