package com.cms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StaffEntity {

    @Id
    @Column(name = "STAFF_ID")
    private Long staffId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ADDRESS")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STUDENT_ID")
    private AccountEntity accountEntity;

}
