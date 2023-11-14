package gdsc.backend.jpa.repository;

import gdsc.backend.jpa.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
