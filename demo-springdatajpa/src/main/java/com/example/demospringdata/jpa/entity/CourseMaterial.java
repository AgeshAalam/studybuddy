package com.example.demospringdata.jpa.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @SequenceGenerator(

            name = "coursematerial_sequence",
            sequenceName = "coursematerial_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "coursematerial_sequence")
    private long courseMaterialId;
    private String url;
    @OneToOne(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY)
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;
}
