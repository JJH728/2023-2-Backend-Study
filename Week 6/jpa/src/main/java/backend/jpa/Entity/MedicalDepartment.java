package backend.jpa.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MedicalDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Doctor> doctors;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    private String name;
}
