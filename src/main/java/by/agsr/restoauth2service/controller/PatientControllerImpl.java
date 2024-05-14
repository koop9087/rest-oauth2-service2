package by.agsr.restoauth2service.controller;

import by.agsr.restoauth2service.domain.dto.PatientDto;
import by.agsr.restoauth2service.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/patient-service")
@RequiredArgsConstructor
public class PatientControllerImpl implements PatientController {

    private PatientService patientService;
    @Override
    @PostMapping("/save")
    public void savePatient(PatientDto patientDto) {
        patientService.savePatient(patientDto);
    }
}
