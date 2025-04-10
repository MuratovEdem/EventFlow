package org.example.clientservice.service;

import org.example.clientservice.entity.Client;

import java.util.List;

public interface ClientService {
    Client getById(Long id);

    List<Client> getAll();

    Client create(Client client);

    void deleteById(Long id);
}
