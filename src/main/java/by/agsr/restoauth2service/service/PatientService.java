package by.agsr.restoauth2service.service;

import by.agsr.restoauth2service.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    Optional<Patient> getPatientById(String id);

    List<Patient> getAllPatients();

    Patient savePatient(Patient patient);

    Patient updatePatient(String id, Patient updatedPatient);

    void deletePatient(String id);
}
