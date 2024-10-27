package org.example.rendezvousservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.rendezvousservice.models.Doctor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate date;
    private Long DoctorId;
    @Transient
    private Doctor doctor;
}
