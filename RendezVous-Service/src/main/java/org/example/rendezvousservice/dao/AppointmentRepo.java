package org.example.rendezvousservice.dao;

import org.example.rendezvousservice.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
}
