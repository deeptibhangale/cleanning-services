package com.MyJpa.CleanningServices.cleanningservices.controller;

import com.MyJpa.CleanningServices.cleanningservices.model.ClientDetails;
import com.MyJpa.CleanningServices.cleanningservices.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class ClientController {
    @Autowired

    private ClientService clientService;
    @GetMapping("/clients")
    public List<ClientDetails> getAllClients(){
        return clientService.getClientDetailList();
    }
    @PostMapping("/clients")
    public void setNewClient(@RequestBody List <ClientDetails> cd){
        clientService.saveAllClients(cd);
    }
   @GetMapping("/client-by-id/{id}")
   public Optional<ClientDetails> getSpecificClient(@PathVariable int id){
        return clientService.getClientById(id);

    }
@DeleteMapping("/delete-by-id/{id}")
public ResponseEntity<String> deleteSpecificClient(@PathVariable int id){
        clientService.deleteByid(id);
        return new ResponseEntity<>("client details deleted"
                ,HttpStatus.OK
                );
}
}