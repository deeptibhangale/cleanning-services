package com.MyJpa.CleanningServices.cleanningservices.controller;

import com.MyJpa.CleanningServices.cleanningservices.model.ClientDetails;
import com.MyJpa.CleanningServices.cleanningservices.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/clients")
    public List<ClientDetails> getAllClients(){
        return clientService.getClientDetailList();
    }
}