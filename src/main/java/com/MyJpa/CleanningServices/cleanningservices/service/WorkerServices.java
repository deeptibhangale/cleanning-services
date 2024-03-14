package com.MyJpa.CleanningServices.cleanningservices.service;

import com.MyJpa.CleanningServices.cleanningservices.model.Workers;
import com.MyJpa.CleanningServices.cleanningservices.repository.WorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WorkerServices {
    @Autowired
    private WorkerRepo workerRepo;
    public void setWorker(Workers workers){
       // List<Workers> workers = new ArrayList<Workers>();
       // workers.add(new Workers(1,"deepti","supervisor"));
        //workers.add(new Workers(2,"deewan","house-cleanner"));
        //workers.add(new Workers(3,"dhanvi","part-time-helper"));

        workerRepo.save(workers);
    }
    public Optional <Workers> getWorkerOfId(int id){
        Optional<Workers> workers = workerRepo.findById(id);
        return workers;
    }
    public List<Workers> getWorkers(){
        return workerRepo.findAll();
    }
}
