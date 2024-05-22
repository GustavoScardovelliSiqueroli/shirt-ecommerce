package com.project.ecommerce.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "shirts")
public class ShirtModel implements Serializable {
    private static final long serialVersionUIDLONG = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID shirtId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String color;
    @Lob
    @Column(nullable = false, columnDefinition = "longtext")
    private String description;

    public UUID getShirtId() {
        return shirtId;
    }

    public void setShirtId(UUID shirtId) {
        this.shirtId = shirtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
