package com.React.reactEmployee.entitiy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="employees")
public class Employee {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
