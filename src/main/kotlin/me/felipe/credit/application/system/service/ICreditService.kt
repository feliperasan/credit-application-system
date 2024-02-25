package me.felipe.credit.application.system.service

import me.felipe.credit.application.system.entity.Credit
import java.util.*


interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId: Long): List<Credit>
    fun findByCreditCode(creditCode: UUID): Credit
}