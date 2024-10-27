package org.example.rendezvousservice.web;

import org.example.rendezvousservice.dao.AppointmentRepo;
import org.example.rendezvousservice.dao.DoctorInter;
import org.example.rendezvousservice.entities.Appointment;
import org.example.rendezvousservice.models.Doctor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
    private AppointmentRepo appointmentRepo;
    private DoctorInter doctorInter;
    public AppointmentController(AppointmentRepo appointmentRepo, DoctorInter doctorInter) {
        this.appointmentRepo = appointmentRepo;
        this.doctorInter = doctorInter;
    }
    @GetMapping()
    public List<Appointment> getAllAppointments() {
        return appointmentRepo.findAll();
    }

    @GetMapping("/byId/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
      Appointment appointment = appointmentRepo.findById(id).get();
      Doctor doctor = doctorInter.getDoctorById(appointment.getDoctorId());
      appointment.setDoctor(doctor);
      return appointment;
    }
}
