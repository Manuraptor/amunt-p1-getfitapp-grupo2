package com.getfiteasy.backend.domain

import jakarta.persistence.*

@Table(name = "clientes")
@Entity
data class Client(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var name: String,
    var idCard: String,
    var address: String,
    var telNumber: String,
    val email: String,
    val birthDate: String,
    val startDate: String,
    val lopdAccepted: Boolean,
    val renovationDate: String,
    val billingDate: String,
    val endDate: String?,
    val paymentType: String,
    val subscriptionType: String
)

// camelCase
// snake_case
// kebab-case