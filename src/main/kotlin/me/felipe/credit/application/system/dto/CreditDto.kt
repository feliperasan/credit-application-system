package me.felipe.credit.application.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import me.felipe.credit.application.system.entity.Credit
import me.felipe.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Invalid input") val creditValue: BigDecimal,
    @field:Future val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int,
    @field:NotNull(message = "Invalid input") val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        numberOfInstallments = this.numberOfInstallments,
        dayFirstInstallment = this.dayFirstInstallment,
        customer = Customer(id = this.customerId)
    )
}
