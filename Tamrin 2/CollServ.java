// here is to import packages and framework
package com.example.springdatajpa1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
public class CollServ {
    @Autowired
    CollegianRepository collegianRepository;
    @Transactional
    public void save(Collegian collegian){
        collegianRepository.save(collegian);
    }
}
