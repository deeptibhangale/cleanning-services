package com.MyJpa.CleanningServices.cleanningservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String cantactNum;
    private String email;
    private List<Workers> assigned_workers;

}
