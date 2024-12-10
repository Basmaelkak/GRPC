package com.example.grpc3.services;
import com.example.grpc3.entities.Compte;
import com.example.grpc3.repositories.CompteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CompteService {
    private final CompteRepository compteRepository;
    public CompteService (CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }
    public Compte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }
    public Compte saveCompte (Compte compte) {
        return compteRepository.save(compte);
    }
    public void deleteCompteById (String id) {
        compteRepository.deleteById(id);
    }
    public List<Compte> GetComptesByType(String type) {
        return compteRepository.findByType(type);
    }
}