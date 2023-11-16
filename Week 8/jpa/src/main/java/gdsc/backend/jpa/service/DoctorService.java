package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.DoctorDto;
import gdsc.backend.jpa.entity.Doctor;
import gdsc.backend.jpa.entity.MedicalDepartment;
import gdsc.backend.jpa.repository.DoctorRepository;
import gdsc.backend.jpa.repository.MedicalDepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final MedicalDepartmentRepository medicalDepartmentRepository;

    public void createDoctor(DoctorDto doctorDto) {
        MedicalDepartment medicalDepartment = medicalDepartmentRepository.findById(doctorDto.getMedicalDepartmentId()).orElseThrow(RuntimeException::new);
        doctorRepository.save(new Doctor(doctorDto.getName(), medicalDepartment));
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
