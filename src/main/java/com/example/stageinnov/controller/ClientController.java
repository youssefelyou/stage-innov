package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Client;
import com.example.stageinnov.service.ClientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/save")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @GetMapping("/{id}")
    public Optional<Client> findById(@PathVariable Integer id) {
        return clientService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        clientService.deleteById(id);
    }
}
