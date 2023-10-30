package com.example.Vaccination_Booking_system.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String appointmentId;

    @ManyToOne
    @JoinColumn
    Doctor doctor;

    @ManyToOne
    @JoinColumn
    Person person;
}
