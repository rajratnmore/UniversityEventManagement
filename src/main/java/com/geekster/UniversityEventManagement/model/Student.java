package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    private Integer studentId;
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$")
    private String studentFirstName;
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$")
    private String studentLastName;
    @Min(value = 18, message = "Age must be above 17")
    @Max(value = 25, message = "Age must be below 26")
    private Integer studentAge;
    private Department studentDepartment;

}
