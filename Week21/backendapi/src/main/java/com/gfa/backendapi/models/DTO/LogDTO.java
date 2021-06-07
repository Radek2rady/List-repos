package com.gfa.backendapi.models.DTO;

public class LogDTO {

    private Long id;
    private String endpoint;
    private String data;


    public LogDTO() {
    }

    public LogDTO(String endpoint, String data) {
        this.endpoint = endpoint;
        this.data = data;
    }

    public LogDTO(Long id, String endpoint, String data) {
        this.id = id;
        this.endpoint = endpoint;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
