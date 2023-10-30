package com.example.Vaccination_Booking_system.Model;

import com.example.Vaccination_Booking_system.Enums.DoseType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dose {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String DoseId;

    @Enumerated(value = EnumType.STRING)
    DoseType doseType;

    @CreationTimestamp
    Date VaccinationDate;

    @ManyToOne
    @JoinColumn
    Person person;

}
