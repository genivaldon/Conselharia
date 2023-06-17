package com.api.conselharia.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("slip")
    private Slip slip;

    public Response() {
    }

    public Response (Slip slip){
        this.slip = slip;
    }

    public Slip getSlip() {
        return slip;
    }

    public void setSlip(Slip slip) {
        this.slip = slip;
    }

    @Override
    public String toString() {
        return "Response{" +
                "slip=" + slip +
                '}';
    }
}
