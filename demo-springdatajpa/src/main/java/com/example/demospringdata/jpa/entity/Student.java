package com.example.demospringdata.jpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tbl_student_table",
        uniqueConstraints =@UniqueConstraint(
                name="email_id",
                columnNames = "email_address")
)

public class Student {
    @Id
    @SequenceGenerator(
            name = "student_id_seq",
            sequenceName = "student_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_id_seq"
    )
    @Column
    private long studentId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(name = "email_address",
    nullable = false)
    private String emailId;
@Embedded
private Guardian guardian;


}
