package gdsc.backend.jpa.controller;

import gdsc.backend.jpa.dto.MedicalDepartmentDto;
import gdsc.backend.jpa.entity.MedicalDepartment;
import gdsc.backend.jpa.service.MedicalDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalDepartments")
@RequiredArgsConstructor
public class MedicalDepartmentController {
    private final MedicalDepartmentService medicalDepartmentService;

    @GetMapping()
    public List<MedicalDepartment> getAllMedicalDepartments() {
        return medicalDepartmentService.getAllMedicalDepartments();
    }

    @PostMapping
    public void createMedicalDepartment(@RequestBody MedicalDepartmentDto medicalDepartmentDto) {
        medicalDepartmentService.createMedicalDepartment(medicalDepartmentDto);
    }
}
