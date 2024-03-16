package com.MyJpa.CleanningServices.cleanningservices.service;

import com.MyJpa.CleanningServices.cleanningservices.model.ClientDetails;
import com.MyJpa.CleanningServices.cleanningservices.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    public void saveAllClients(List<ClientDetails> clientDetails){
        clientRepo.saveAll(clientDetails);

    }
    public List<ClientDetails> getClientDetailList(){
        List<ClientDetails> cd = clientRepo.findAll();
        return cd;
    }
    public Optional<ClientDetails> getClientById(int id){
        Optional<ClientDetails>optionalClientDetails= Optional.of(clientRepo.findById(id).get());
        if(optionalClientDetails.isPresent()){
            return optionalClientDetails;
        }

        else{
            throw new NoSuchElementException("Detail of client Not fond");

            }
    }
    public void deleteByid(int id){
        Optional<ClientDetails>optionalClientDetails= Optional.of(clientRepo.findById(id).get());
        if(optionalClientDetails.isPresent()){
            clientRepo.deleteById(id);
        }else
        {
            throw new NoSuchElementException("client detail is not present");
        }

    }

}
