package com.example.demospringblog.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column
private String title;
    @NotNull
    @Column
    @Lob
    private String content;
    @Column
    private Instant createdOn;
    @Column
    private Instant updatedOn;
@Column
    private String userName;

}
