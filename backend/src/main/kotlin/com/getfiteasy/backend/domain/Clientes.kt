package com.getfiteasy.backend.domain

import jakarta.persistence.*
import jakarta.persistence.criteria.CriteriaBuilder.In
import java.util.Date

@Table(name = "clientes")
@Entity
data class Clientes(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var name: String,
    var idCard: Int,
    var address: String,
    var telNumber: Int,
    val email: String,
    val birthdate: Int,
    val startDate: Int,
    val protectDate: Boolean,
    val renovationDate: Int,
    val billingDate: Int,
    val dischargeDate: Int,
    val endDate: Int,
    val paymentType: Int,
    val subscriptionType: String


)
