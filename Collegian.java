// here is to import packages and framework
import lombok.experimental.FieldDefaults;
package com.example.springdatajpa1;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AccessLevel;
import lombok.Data;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Collegian {
    @Id
    Long id;
    Long nationalcode;
    Long phonenumber;
    Long collegeId;
    int age;
    string major;
    String firstname;
    String lastname;
    string fathername;
}
