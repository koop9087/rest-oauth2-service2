package by.agsr.restoauth2service.service.impl;

import by.agsr.restoauth2service.exception.PatientDeleteException;
import by.agsr.restoauth2service.exception.PatientNotFoundException;
import by.agsr.restoauth2service.exception.PatientSaveException;
import by.agsr.restoauth2service.exception.PatientUpdateException;
import by.agsr.restoauth2service.model.Patient;
import by.agsr.restoauth2service.repository.PatientRepository;
import by.agsr.restoauth2service.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        log.info("Поиск всех пациентов");
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getPatientById(String id) {
        return Optional.of(patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException("Пациент не найден")));
    }

    @Override
    public Patient savePatient(Patient patient) {
        return Optional.ofNullable(patient)
                .map(p -> {
                    Patient savedPatient = patientRepository.save(p);
                    log.info("Patient saved successfully, patient id: {}", savedPatient.getId());
                    return savedPatient;
                })
                .orElseThrow(() -> new PatientSaveException("Ошибка при сохранении пациента"));
    }

    @Override
    public Patient updatePatient(String id, Patient updatedPatient) {
        Optional<Patient> optionalExistingPatient = patientRepository.findById(id);
        if (optionalExistingPatient.isPresent()) {
            return patientRepository.save(updatedPatient);
        } else {
            throw new PatientUpdateException("Не удалось обновить данные о пациенте");
        }
    }

    @Override
    public void deletePatient(String id) {
        patientRepository.findById(id)
                .ifPresentOrElse(
                        patientRepository::delete,
                        () -> {
                            throw new PatientDeleteException("Не удалось удалить пациента");
                        }
                );
    }
}
