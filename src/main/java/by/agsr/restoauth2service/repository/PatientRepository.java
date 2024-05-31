package by.agsr.restoauth2service.repository;

import by.agsr.restoauth2service.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {

}
