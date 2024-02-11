package com.cms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEACHER_ID")
    private Long teacherId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="CONTACT_NO")
    private String contactNo;

    @Column(name="SUBJECT")
    private List<String> subject;

    @Column(name="ADDRESS")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TEACHER_ID")
    private AccountEntity accountEntity;
}
