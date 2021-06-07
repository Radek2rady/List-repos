package com.gfa.backendapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Doubling {
    //    @JsonIgnore
    // @JsonProperty("neco")
    private Integer received;
    private Integer result;

    public Doubling(Integer received, Integer result) {
        this.received = received;
        this.result = result;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
