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
public class AccountEntity {
    @Id
    @Column(name="ACCOUNT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STUDENT_ID")
    private AccountEntity accountEntity;
}
