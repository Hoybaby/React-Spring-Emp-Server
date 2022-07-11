package com.React.reactEmployee.entitiy;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employees")
public class Employee {
    // the generatio type means the value be incremented
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
