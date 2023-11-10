// here is to import packages and framework
package com.example.springdatajpa1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Run implements CommandLineRunner {
    @Autowired
    CollServ collServ;
    @Override
    public void run(String... args) throws Exception {
        Collegian collegian=new Collegian();

        collegian.setId(12345);

        collegian.setPhonenumber(0912345678);
        collegian.setNationalcode(00123456);
        collegian.setCollegeId(40234567890);
        collegian.setAge(24);
        collegian.setMajor("Computer science");
        collegian.setFirstname("َAlireza");
        collegian.setLastname("Nazari");
        collegian.setFathername("saeed");

        collServ.save(collegian);

    }
}
