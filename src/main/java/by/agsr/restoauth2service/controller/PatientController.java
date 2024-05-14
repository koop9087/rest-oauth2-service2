package by.agsr.restoauth2service.controller;

import by.agsr.restoauth2service.domain.dto.PatientDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Tag(name = "Patient controller", description = "API для работы с пациентами")
@RequestMapping("api/v1/patient-service")
public interface PatientController {

    @Operation(summary = "Получение информации о счете юридического лица от имени пользователя")
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    void savePatient(@RequestBody PatientDto patientDto);
}
