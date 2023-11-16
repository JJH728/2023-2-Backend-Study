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

    public void createMedicalDepartment(MedicalDepartmentDto medicalDepartmentDto) {
        Hospital hospital = hospitalRepository.findById(medicalDepartmentDto.getHospitalId()).orElseThrow(RuntimeException::new);
        medicalDepartmentRepository.save(new MedicalDepartment(medicalDepartmentDto.getName(), hospital));
    }

    public List<MedicalDepartment> getAllMedicalDepartments() {
        return medicalDepartmentRepository.findAll();
    }
}
