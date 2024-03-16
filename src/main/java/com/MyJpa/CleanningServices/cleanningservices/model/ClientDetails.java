package com.MyJpa.CleanningServices.cleanningservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String contactNum;
    private String email;

}
