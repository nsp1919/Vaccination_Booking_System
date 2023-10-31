package com.example.Vaccination_Booking_system.Controller;

import com.example.Vaccination_Booking_system.DTO.ResponseDto.DoseResponse;
import com.example.Vaccination_Booking_system.Enums.DoseType;
import com.example.Vaccination_Booking_system.Exceptions.DoseAlreadyTakenException;
import com.example.Vaccination_Booking_system.Model.Dose;
import com.example.Vaccination_Booking_system.Service.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dose")
public class DoseController {

    @Autowired
    DoseService doseService;


    @GetMapping("/getdose1")
    public ResponseEntity getDose1(@RequestParam("id") Integer personId,
                                   @RequestParam("id1")DoseType doseType){
        try {
            DoseResponse Response= doseService.getDose1(personId, doseType);
            return new ResponseEntity(Response, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.ALREADY_REPORTED);
        }
    }
    @GetMapping("/getdose2")
    public ResponseEntity getDose2(@RequestParam("id") Integer personId,
                                   @RequestParam("id1")DoseType doseType){
        try {
            DoseResponse Response= doseService.getDose2(personId, doseType);
            return new ResponseEntity(Response, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.ALREADY_REPORTED);
        }
    }

}
