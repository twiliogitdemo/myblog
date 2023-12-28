package com.myblog9.entity;

import  lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data       //lambok plugin should be downloaded (file/settings/plugins)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title", nullable=false, unique = true)
    private String title;
    @Column(name = "description", nullable=false, unique = true)
    private String description;
    @Column(name = "content", nullable=false, unique = true)
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)  //Composition rule
    List<Comment> comments = new ArrayList<>();


}
