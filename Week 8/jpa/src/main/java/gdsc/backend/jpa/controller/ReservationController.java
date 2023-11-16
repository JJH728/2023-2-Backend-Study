package gdsc.backend.jpa.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import gdsc.backend.jpa.dto.ReservationDto;
import gdsc.backend.jpa.dto.UpdateReservationDto;
import gdsc.backend.jpa.entity.Reservation;
import gdsc.backend.jpa.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping()
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") Long id) {
        return reservationService.getReservationById(id);
    }

    @PostMapping()
    public void createReservation(@RequestBody ReservationDto reservationDto) {
        reservationService.createReservation(reservationDto);
    }

    @PatchMapping("/{id}")
    public void updateReservation(@PathVariable("id") Long id, @RequestBody UpdateReservationDto updateReservationDto) {
        reservationService.updateReservation(id, updateReservationDto);
    }

    @DeleteMapping("/all")
    public void deleteAllReservations() {
        reservationService.deleteAllReservations();
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable("id") Long id) {
        reservationService.deleteReservationById(id);
    }
}
