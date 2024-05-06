package com.tpe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//update
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    @NotBlank(message = "Kitap ismi boşluk olamaz!")
    @NotNull(message = "Kitap ismi girilmelidir!")
    private String title;

    @NotBlank(message = "Yazar ismi boşluk olamaz!")
    @Size(min = 2,max = 30,message = "Yazar ismi(${validatedValue}) {min} ve {max} karakter arasında olmalıdır!")
    private String author;

    private String publicationDate;

}
