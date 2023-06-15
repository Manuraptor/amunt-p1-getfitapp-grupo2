package com.getfiteasy.backend.controllers

import com.getfiteasy.backend.domain.Client
import com.getfiteasy.backend.repositories.ClientesRepository
import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin
class ClienteController (private val repository: ClientesRepository){

    @GetMapping("/clientes")
    fun allSubscribers() : List<Client>? {
        return repository.findAll()

    }
    @GetMapping("/clientes/location/{location}")
    fun getSubscribersByLocation(@PathVariable location: String): List<Client>? {
        return repository.findAllByAddressContains(location)
    }




}




