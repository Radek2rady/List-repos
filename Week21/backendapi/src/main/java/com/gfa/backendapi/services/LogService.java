package com.gfa.backendapi.services;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gfa.backendapi.models.DTO.LogDTO;
import com.gfa.backendapi.models.Log;
import com.gfa.backendapi.repositories.LogRepo;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class LogService {

    @Autowired
    private LogRepo logRepo;

    public LogService(LogRepo logRepo) {
        this.logRepo = logRepo;
    }

    public void SafeNewLog(String endpoint) {
        Log log = new Log();
        log.setEndpoint(endpoint);
        this.logRepo.save(log);
    }

    public List<Log> findAll() {
        ArrayList<Log> logs = new ArrayList<>();
        logRepo.findAll().forEach(logs::add);
        return logs;
    }

    public Map writingDTO(Integer page, Integer count) {
        List<Log> logs = logRepo.findAllByData(PageRequest.of(page, count, Sort.by("createdAt"))).stream().collect(Collectors.toList());
        Map<String, String> mapLogs = new HashMap<>();
        Map<String, String> mapLogsWithSize = new HashMap<>();
        Gson json = new Gson();
        for (Log log : logs) {
            mapLogs.put("id", log.getId().toString());
            mapLogs.put("endpoint", log.getEndpoint());
            if (log.getData() != null) {
                mapLogs.put("data", log.getData());
            } else {
                mapLogs.put("data", "");
            }
        }
        mapLogsWithSize.put("entries", mapLogs.toString());
        mapLogsWithSize.put("entry_count", String.valueOf(logs.size()));
        return mapLogsWithSize;
    }

//    public List lastLogs(Integer page, Integer count) {
//        return logRepo.findAllByData(PageRequest.of(page, count, Sort.by("createdAt"))).stream().collect(Collectors.toList());
//    }
}
