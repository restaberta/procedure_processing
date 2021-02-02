package com.resta.procedure_processing.service

import com.resta.procedure_processing.dto.ProcedureDto

interface ProcessingService {

    fun create(procedure: ProcedureDto): ProcedureDto

}