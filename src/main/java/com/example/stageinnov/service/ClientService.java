package com.example.stageinnov.service;

import com.example.stageinnov.entity.Client;
import com.example.stageinnov.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        clientRepository.deleteById(id);
    }
}
