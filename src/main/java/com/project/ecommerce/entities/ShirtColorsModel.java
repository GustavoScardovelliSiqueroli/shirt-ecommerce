package com.project.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "shirt_colors")
public class ShirtColorsModel implements Serializable {
    private static final long serialVersionUIDLONG = 1L;

    private UUID sColorId;
    private String name;
    private String size;
}
