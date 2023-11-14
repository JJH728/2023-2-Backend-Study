package gdsc.backend.jpa.controller;

import gdsc.backend.jpa.dto.DoctorDto;
import gdsc.backend.jpa.entity.Doctor;
import gdsc.backend.jpa.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping()
    public List<Doctor> getAllDoctors() { return doctorService.getAllDoctors(); }

    @PostMapping()
    public void createDoctors(@RequestBody DoctorDto doctorDto) {
        doctorService.createDoctor(doctorDto);
    }
}
