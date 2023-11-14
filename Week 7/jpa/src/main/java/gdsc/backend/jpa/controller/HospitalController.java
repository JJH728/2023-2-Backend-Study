package gdsc.backend.jpa.controller;

import gdsc.backend.jpa.dto.HospitalDto;
import gdsc.backend.jpa.entity.Hospital;
import gdsc.backend.jpa.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@RequiredArgsConstructor
public class HospitalController {
    private final HospitalService hospitalService;

    @GetMapping()
    public List<Hospital> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }

    @PostMapping()
    public void createHospital(@RequestBody HospitalDto hospitalDto) {
        hospitalService.createHospital(hospitalDto);
    }
}
