package com.sample.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private String empId;
    private String name;
    private String designation;
    private double salary;

}
