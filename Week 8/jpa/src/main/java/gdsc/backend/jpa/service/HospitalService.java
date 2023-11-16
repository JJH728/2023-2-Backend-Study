package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.HospitalDto;
import gdsc.backend.jpa.entity.Hospital;
import gdsc.backend.jpa.repository.HospitalRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public void createHospital(HospitalDto hospitalDto) {
        hospitalRepository.save(new Hospital(hospitalDto.getName()));
    }

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    @Transactional
    public Hospital getHospitalById(Long id) {
        return hospitalRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Transactional
    public void updateHospital(Long id, HospitalDto hospitalDto) {
        Hospital hospital = hospitalRepository.findById(id).orElseThrow(RuntimeException::new);
        hospital.updateName(hospitalDto.getName());
    }

    @Transactional
    public void deleteHospital(Long id) {
        hospitalRepository.deleteById(id);
    }
}
