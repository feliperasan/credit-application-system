package me.felipe.credit.application.system.controller

import me.felipe.credit.application.system.dto.CreditDto
import me.felipe.credit.application.system.entity.Credit
import me.felipe.credit.application.system.service.impl.CreditService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/credit")
class CreditResource(
    private val creditService: CreditService
) {
    @PostMapping
    fun saveCredit(@RequestBody creditDto: CreditDto): String {
        val credit: Credit = this.creditService.save(creditDto.toEntity())
        return "Credit ${credit.creditCode} - Customer ${credit.customer?.firstName} saved!"
    }
}