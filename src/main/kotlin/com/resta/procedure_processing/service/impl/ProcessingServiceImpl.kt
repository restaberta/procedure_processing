package com.resta.procedure_processing.service.impl

import com.resta.procedure_processing.dto.ProcedureDto
import com.resta.procedure_processing.service.ProcessingService
import org.springframework.stereotype.Service

@Service
class ProcessingServiceImpl : ProcessingService {

    override fun create(procedure: ProcedureDto): ProcedureDto {
        procedure.id = 1
        return procedure
    }
}