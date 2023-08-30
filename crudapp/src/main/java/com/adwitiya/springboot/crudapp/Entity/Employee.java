package com.adwitiya.springboot.crudapp.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private  int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}
