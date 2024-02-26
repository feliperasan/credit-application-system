package me.felipe.credit.application.system.dto

import me.felipe.credit.application.system.entity.Credit
import me.felipe.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    val creditValue: BigDecimal,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int,
    val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        numberOfInstallments = this.numberOfInstallments,
        dayFirstInstallment = this.dayFirstInstallment,
        customer = Customer(id = this.customerId)
    )
}
