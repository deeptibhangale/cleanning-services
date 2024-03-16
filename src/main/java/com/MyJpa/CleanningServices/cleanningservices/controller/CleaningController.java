package com.MyJpa.CleanningServices.cleanningservices.controller;

import com.MyJpa.CleanningServices.cleanningservices.model.Workers;
import com.MyJpa.CleanningServices.cleanningservices.service.WorkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class CleaningController {
    @Autowired
    private WorkerServices workerServices;
    @GetMapping("/workers")
    public List<Workers> getAllWorkers(){

        return workerServices.getWorkers();
    }
    @GetMapping("/workers/{id}")
    public Optional<Workers>getSpecificWorker(@PathVariable int id){
        return workerServices.getWorkerOfId(id);

    }
    @PostMapping("/workers")
    public void saveAllWorkers(@RequestBody Workers workers){
        workerServices.setWorker(workers);

    }
}