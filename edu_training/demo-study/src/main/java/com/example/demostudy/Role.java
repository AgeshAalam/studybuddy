package com.example.demostudy;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int roleId;
    private String roleName;
}
