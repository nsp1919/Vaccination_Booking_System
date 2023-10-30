package com.example.Vaccination_Booking_system.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String certificateId;

    @CreationTimestamp
    Date certificateGeneratedDate;

    @OneToOne
    @JoinColumn
    Person person;


}
