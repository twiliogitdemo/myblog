package com.myblog9.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "roles")
    public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(length = 60)
        private String name;

        @ManyToMany(mappedBy = "roles")
        private Set<User> users = new HashSet<>();
    }


