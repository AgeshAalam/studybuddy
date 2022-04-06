package com.example.demospringdata.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Course {

    @Id
    @SequenceGenerator(

            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "course_sequence")

    @Column
    private long courseId;
    @Column
    private String title;
    @Column
    private Integer credit;
@OneToOne(mappedBy = "course")
private CourseMaterial courseMaterial;
}
