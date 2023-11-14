package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.HospitalDto;
import gdsc.backend.jpa.entity.Hospital;
import gdsc.backend.jpa.repository.HospitalRepository;
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
}
