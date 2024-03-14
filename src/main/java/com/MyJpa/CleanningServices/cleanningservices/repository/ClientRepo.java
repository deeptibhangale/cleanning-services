package com.MyJpa.CleanningServices.cleanningservices.repository;

import com.MyJpa.CleanningServices.cleanningservices.model.ClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<ClientDetails,Integer> {
}
