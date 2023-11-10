// here is to import packages

package com.example.springdatajpa1;

import org.springframework.data.repository.CrudRepository;

public interface CollegianRepository extends CrudRepository<Employee,Long> {

}
