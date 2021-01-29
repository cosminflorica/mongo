package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString
@Document(collection = "Project")
public class Project {
    @Id
    private ObjectId id;
    @NotBlank(message="identifier should not be blank ")
    @Indexed(unique = true)
    private String identifier;
    @NotBlank(message="name should not be blank")
    private String name;
    @NotNull(message="description should not be blank")
    private String description;
}
