package com.example.Vaccination_Booking_system.DTO.ResponseDto;

import com.example.Vaccination_Booking_system.Enums.DoseType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DoseResponse {
    String doseId;
    String personName;
    Date date;
    DoseType doseType;

}
