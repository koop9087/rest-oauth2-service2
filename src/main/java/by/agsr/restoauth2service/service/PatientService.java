package by.agsr.restoauth2service.service;

import by.agsr.restoauth2service.domain.dto.PatientDto;
import org.springframework.stereotype.Service;

public interface PatientService {
    void savePatient(PatientDto patientDto);
/*

    PatientDto getPatient(String id);

    void updatePatient(PatientDto patientDto);

    void deletePatient(PatientDto patientDto);
*/

}
