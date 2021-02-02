package com.resta.procedure_processing.controller

import com.resta.procedure_processing.dto.ProcedureDto
import com.resta.procedure_processing.service.ProcessingService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/procedure")
class ProcedureController(private val processingService: ProcessingService) {

    @PostMapping(produces = ["application/json; charset=utf-8"])
    fun create(@RequestBody procedure: ProcedureDto): ProcedureDto {
        return processingService.create(procedure)
    }
}