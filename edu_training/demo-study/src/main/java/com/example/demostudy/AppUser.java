package com.example.demostudy;

import lombok.*;

import javax.persistence.*;
import java.util.*;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class AppUser {
    private int id;
    private String fName;
    private String lName;
    private int phoneNumber;
    private int altPhoneNumber;
    private String role;
    private String userId;
    private String UserName;
    private Collection<LearningBlocker> learningBlocker;
    private Collection<Role> roles = new ArrayList<Role>();
}
