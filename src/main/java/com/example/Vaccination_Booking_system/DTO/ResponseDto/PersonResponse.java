package com.example.Vaccination_Booking_system.DTO.ResponseDto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PersonResponse {
    Integer personId;
    String message;
}
