package com.getfiteasy.backend.controllers

import com.getfiteasy.backend.repositories.ClientesRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ClienteController (private val repository: ClientesRepository){

    @GetMapping("/clientes")
    fun allClientes() = repository.findAll()



}




