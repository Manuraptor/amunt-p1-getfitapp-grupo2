package com.getfiteasy.backend.repositories

import com.getfiteasy.backend.domain.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientesRepository : JpaRepository<Client, Long> {
    fun findAllByAddressContains(word: String): List<Client>
}