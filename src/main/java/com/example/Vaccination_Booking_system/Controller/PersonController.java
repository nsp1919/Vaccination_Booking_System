package com.example.Vaccination_Booking_system.Controller;


import com.example.Vaccination_Booking_system.DTO.RequestDto.PersonRequest;
import com.example.Vaccination_Booking_system.Exceptions.IdNotFoundException;
import com.example.Vaccination_Booking_system.Model.Doctor;
import com.example.Vaccination_Booking_system.Model.Person;
import com.example.Vaccination_Booking_system.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService;

    @PutMapping("/add")
    public String addPerson(@RequestBody PersonRequest personRequest){
        personService.addPerson(personRequest);
        return "person added";
    }
//    @PutMapping("/assignDoctor")
//    public ResponseEntity assignDoctor(@RequestParam("id1") int personId, @RequestParam("id2") int doctorId){
//        try{
//            String res =personService.assignDoctor(personId,doctorId);
//            return new ResponseEntity(res,HttpStatus.OK);
//        }
//        catch(Exception e){
//            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_GATEWAY);
//        }


}


















