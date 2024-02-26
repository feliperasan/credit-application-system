package me.felipe.credit.application.system.service.impl

import me.felipe.credit.application.system.entity.Credit
import me.felipe.credit.application.system.repository.CreditRepository
import me.felipe.credit.application.system.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*
@Service
class CreditService(
    private var creditRepository: CreditRepository,
    private val customerService: CustomerService
) : ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> {
        return this.creditRepository.findAllByCustomerId(customerId)
    }

    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = this.creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException("Creditcode $creditCode not found")
        return if (credit.customer?.id == customerId)
            credit
        else
            throw RuntimeException("Contact admin")
    }
}