package com.project.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "colors")
public class ColorsModel implements Serializable {
    private static final long serialVersionUIDLONG = 1L;

    private UUID colorId;
    private String name;

}
