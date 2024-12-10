package com.example.grpc3.repositories;


import com.example.grpc3.entities.Compte;
import org.springframework.data.jpa.repository. JpaRepository;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, String> {
    List<Compte> findByType(String type);
}