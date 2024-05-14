package by.agsr.restoauth2service.repository;

import by.agsr.restoauth2service.domain.dto.PatientDto;
import by.agsr.restoauth2service.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, String> {

    void save(PatientDto patient);

    /*Optional<Patient> getPatient(String id);

    void updatePatient(PatientDto patientDto);

    void deletePatient(PatientDto patientDto);*/
}
