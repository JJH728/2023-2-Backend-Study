package gdsc.backend.jpa.dto;

import lombok.Getter;

@Getter
public class ReservationDto {
    private String time;
    private Long patientId;
    private Long doctorId;
}
