package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.PatientDto;
import gdsc.backend.jpa.entity.Patient;
import gdsc.backend.jpa.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public void createPatient(PatientDto patientDto) {
        patientRepository.save(new Patient(patientDto.getName()));
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
