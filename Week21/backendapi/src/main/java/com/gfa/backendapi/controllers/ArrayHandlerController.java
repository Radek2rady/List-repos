package com.gfa.backendapi.controllers;

import com.gfa.backendapi.models.ArrayHandler;
import com.gfa.backendapi.models.ArrayHandlerResult;
import com.gfa.backendapi.models.ArrayHandlerResultArray;
import com.gfa.backendapi.models.ErrorDoubling;
import com.gfa.backendapi.services.ArrayHandlerService;
import com.gfa.backendapi.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ArrayHandlerController {

    @Autowired
    private ArrayHandlerService arrayHandlerService;

    @Autowired
    private LogService logService;

    @PostMapping("/arrays")
    public ResponseEntity<?> handler(@RequestBody ArrayHandler arrayHandler) {
        if (arrayHandler.getWhat().equals("sum")) {
            var result = arrayHandlerService.sum(arrayHandler.getNumbers());
            logService.SafeNewLog("/arrays");
            return new ResponseEntity<>(new ArrayHandlerResult(result), HttpStatus.OK);
        } else if (arrayHandler.getWhat().equals("multiply")) {
            var result = arrayHandlerService.multiply(arrayHandler.getNumbers());
            logService.SafeNewLog("/arrays");
            return new ResponseEntity<>(new ArrayHandlerResult(result), HttpStatus.OK);
        } else if (arrayHandler.getWhat().equals("double")) {
            var result = arrayHandlerService.doubling(arrayHandler.getNumbers());
            logService.SafeNewLog("/arrays");
            return new ResponseEntity<>(new ArrayHandlerResultArray(result), HttpStatus.OK);
        } else
            logService.SafeNewLog("/arrays");
            return new ResponseEntity<>(new ErrorDoubling("Please provide what to do with the numbers!"), HttpStatus.OK);
    }
}
