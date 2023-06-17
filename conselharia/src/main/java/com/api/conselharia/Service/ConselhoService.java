package com.api.conselharia.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.conselharia.Model.Response;
import com.api.conselharia.Repository.ConselhoRepository;

@Service
public class ConselhoService {
    
    private ConselhoRepository conselhoRep;
    private ConselhariaApi conselhariaApi;

    @Autowired
    public ConselhoService (ConselhoRepository conselhoRep, ConselhariaApi conselhariaApi){
        this.conselhoRep = conselhoRep;
        this.conselhariaApi = conselhariaApi;
    }

}
