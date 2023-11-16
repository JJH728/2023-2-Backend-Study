package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.ReservationDto;
import gdsc.backend.jpa.dto.UpdateReservationDto;
import gdsc.backend.jpa.entity.Doctor;
import gdsc.backend.jpa.entity.MedicalDepartment;
import gdsc.backend.jpa.entity.Patient;
import gdsc.backend.jpa.entity.Reservation;
import gdsc.backend.jpa.repository.DoctorRepository;
import gdsc.backend.jpa.repository.MedicalDepartmentRepository;
import gdsc.backend.jpa.repository.PatientRepository;
import gdsc.backend.jpa.repository.ReservationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public void createReservation(ReservationDto reservationDto) {
        Patient patient = patientRepository.findById(reservationDto.getPatientId()).orElseThrow(RuntimeException::new);
        Doctor doctor = doctorRepository.findById(reservationDto.getDoctorId()).orElseThrow(RuntimeException::new);
        reservationRepository.save(new Reservation(reservationDto.getTime(), patient, doctor));
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Transactional
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Transactional
    public void updateReservation(Long id, UpdateReservationDto updateReservationDto) {
        Reservation reservation = reservationRepository.findById(id).orElseThrow(RuntimeException::new);
        reservation.updateTime(updateReservationDto.getTime());
    }

    public void deleteAllReservations() {
        reservationRepository.deleteAll();
    }

    @Transactional
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }
}
