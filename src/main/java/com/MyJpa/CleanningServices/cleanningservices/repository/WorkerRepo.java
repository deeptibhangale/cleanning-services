package com.MyJpa.CleanningServices.cleanningservices.repository;

import com.MyJpa.CleanningServices.cleanningservices.model.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Workers,Integer> {
}
