package gdsc.backend.jpa.repository;

import gdsc.backend.jpa.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
