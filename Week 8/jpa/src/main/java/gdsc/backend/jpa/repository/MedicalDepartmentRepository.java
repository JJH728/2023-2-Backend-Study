package gdsc.backend.jpa.repository;

import gdsc.backend.jpa.entity.MedicalDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalDepartmentRepository extends JpaRepository<MedicalDepartment, Long> {
}
