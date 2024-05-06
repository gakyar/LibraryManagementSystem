package com.tpe.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Owner {

    @Id
    private Long id;

}
