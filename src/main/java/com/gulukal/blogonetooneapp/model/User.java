package com.gulukal.blogonetooneapp.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;
    private String mail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userdetailid")
    private UserDetail userDetail;


}
