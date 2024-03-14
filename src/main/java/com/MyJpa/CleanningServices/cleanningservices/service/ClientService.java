package com.MyJpa.CleanningServices.cleanningservices.service;

import com.MyJpa.CleanningServices.cleanningservices.model.ClientDetails;
import com.MyJpa.CleanningServices.cleanningservices.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    public void saveAllClients(ClientDetails clientDetails){
        clientRepo.save(clientDetails);

    }
    public List<ClientDetails> getClientDetailList(){
        List<ClientDetails> cd = clientRepo.findAll();
        return cd;
    }

}
