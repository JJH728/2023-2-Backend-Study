package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.ReservationDto;
import gdsc.backend.jpa.entity.Doctor;
import gdsc.backend.jpa.entity.Patient;
import gdsc.backend.jpa.entity.Reservation;
import gdsc.backend.jpa.repository.DoctorRepository;
import gdsc.backend.jpa.repository.PatientRepository;
import gdsc.backend.jpa.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public void createReservation(ReservationDto reservationDto) {
        Doctor doctor = doctorRepository.findById(reservationDto.getDoctorId()).orElseThrow(RuntimeException::new);
        Patient patient = patientRepository.findById(reservationDto.getPatientId()).orElseThrow(RuntimeException::new);
        reservationRepository.save(new Reservation(reservationDto.getTime(), patient, doctor));
    }

    public List<Reservation> getAllReservations() { return reservationRepository.findAll(); }
}
