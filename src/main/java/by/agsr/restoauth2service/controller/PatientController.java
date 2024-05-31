package by.agsr.restoauth2service.controller;


import by.agsr.restoauth2service.model.Patient;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Tag(name = "Rest controller", description = "API для работы с пациентами")
@RequestMapping("/api/patients")
public interface PatientController {

    @Operation(description = "Получение данных о всех пациентах")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Получение данных о пациентах успешно")
    })
    @GetMapping
    List<Patient> getAllPatients();

    @Operation(description = "Получение данных о пациенте по id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Получение данных о пациенте успешно")
    })
    @GetMapping("/{id}")
    ResponseEntity<Patient> getPatientById(@PathVariable String id);

    @Operation(description = "Создание записи о пациенте")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Запись о пациенте успешно создана")
    })
    @PostMapping(consumes = "application/json", produces = "application/json")
    Patient createPatient(@RequestBody Patient patient);

    @Operation(description = "Обновление записи о пациенте")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Обновление записи о пациенте произошло успешно")
    })
    @PutMapping("/{id}")
    ResponseEntity<Patient> updatePatient(@PathVariable String id, @RequestBody Patient updatedPatient);

    @Operation(description = "Удаление записи о пациенте")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Удаление записи о пациенте произошло успешно")
    })
    @DeleteMapping("/{id}")
    void deletePatient(@PathVariable String id);
}