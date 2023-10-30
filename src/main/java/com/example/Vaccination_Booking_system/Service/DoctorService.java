package com.example.Vaccination_Booking_system.Service;

import com.example.Vaccination_Booking_system.Exceptions.IdNotFoundException;
import com.example.Vaccination_Booking_system.Model.Doctor;
import com.example.Vaccination_Booking_system.Model.Person;
import com.example.Vaccination_Booking_system.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;


    public String addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return "Doctor added";
    }

//    public List<String> getPersonsByDoctorId(int doctorid) {
//        Optional<Doctor> optionalDoctor=doctorRepository.findById(doctorid);
//        if (!optionalDoctor.isPresent()){
//            throw new IdNotFoundException("Doctor Id not found");
//        }
//        Doctor doctor=optionalDoctor.get();
//        List<Person>personList=doctor.getPersonList();
//        List<String>ans=new ArrayList<>();
//        for(Person person:personList){
//            ans.add(person.getName());
//        }
//        return ans;
//    }
}
