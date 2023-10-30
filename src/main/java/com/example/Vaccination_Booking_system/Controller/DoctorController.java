package com.example.Vaccination_Booking_system.Controller;

import com.example.Vaccination_Booking_system.Model.Doctor;
import com.example.Vaccination_Booking_system.Model.Person;
import com.example.Vaccination_Booking_system.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/add")
    public ResponseEntity addDoctor(@RequestBody Doctor doctor){
        String Response=doctorService.addDoctor(doctor);
        return new ResponseEntity(Response, HttpStatus.OK);
    }
//    @GetMapping("/getpersons")
//    public ResponseEntity getPersonsByDoctorId(@RequestParam("id") int doctorid){
//        List<String> personList=doctorService.getPersonsByDoctorId(doctorid);
//        return new ResponseEntity(personList,HttpStatus.OK);
//    }


}
