package com.myblog9.payload;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data //lambok plugin should be downloaded (file/settings/plugins)
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {


    private long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post description should be atleast 10 characters")
    private String description;

    @NotEmpty
    private String content;

}
