package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.MedicalDepartmentDto;
import gdsc.backend.jpa.entity.Hospital;
import gdsc.backend.jpa.entity.MedicalDepartment;
import gdsc.backend.jpa.repository.HospitalRepository;
import gdsc.backend.jpa.repository.MedicalDepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalDepartmentService {
    private final MedicalDepartmentRepository medicalDepartmentRepository;
    private final HospitalRepository hospitalRepository;

    public void createMedicalDepartment(MedicalDepartmentDto createMedicalDepartmentDto) {
        Hospital hospital = hospitalRepository.findById(createMedicalDepartmentDto.getHospitalId()).orElseThrow(RuntimeException::new);
        medicalDepartmentRepository.save(new MedicalDepartment(hospital, createMedicalDepartmentDto.getName()));
    }

    public List<MedicalDepartment> getAllMedicalDepartments() { return medicalDepartmentRepository.findAll();}
}
