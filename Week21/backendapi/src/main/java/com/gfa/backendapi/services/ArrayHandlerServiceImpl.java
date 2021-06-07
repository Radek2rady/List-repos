package com.gfa.backendapi.services;

import org.springframework.stereotype.Service;

@Service
public class ArrayHandlerServiceImpl implements ArrayHandlerService {

    @Override
    public Integer sum(Integer[] numbers) {
        Integer result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    @Override
    public Integer multiply(Integer[] numbers) {
        Integer result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        return result;
    }

    @Override
    public Integer[] doubling(Integer[] numbers) {
        Integer[] result = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }
        return result;
    }
}
