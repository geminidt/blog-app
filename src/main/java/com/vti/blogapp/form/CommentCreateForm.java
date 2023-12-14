package com.vti.blogapp.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class CommentCreateForm {
//    @NonNull  //NOT NULL
//    @NotEmpty // NOT NULL & LENGTH > 0: "  "
    @NotBlank
    @Length(max = 50)
    private String name;

    @NotBlank
    @Length(max = 75)
    @Email
    private String email;

    @NotBlank
    @Length(max = 100)
    private String body;
}
