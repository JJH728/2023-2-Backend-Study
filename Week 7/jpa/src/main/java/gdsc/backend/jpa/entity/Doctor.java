package gdsc.backend.jpa.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private MedicalDepartment medicalDepartment;

    public Doctor(String name, MedicalDepartment medicalDepartment) {
        this.name = name;
        this.medicalDepartment = medicalDepartment;
    }
}
