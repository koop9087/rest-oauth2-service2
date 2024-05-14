package by.agsr.restoauth2service.service;

import by.agsr.restoauth2service.domain.dto.PatientDto;
import by.agsr.restoauth2service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
@Slf4j
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Override
    @Transactional
    public void savePatient(PatientDto patientDto) {
        log.info("Сохранение пациента с id {}", patientDto.getId());
        patientRepository.save(patientDto);
    }

    /*@Override
    public PatientDto getPatient(String id) {
        return null;
    }

    @Override
    public void updatePatient(PatientDto patientDto) {

    }

    @Override
    public void deletePatient(PatientDto patientDto) {

    }*/
}
