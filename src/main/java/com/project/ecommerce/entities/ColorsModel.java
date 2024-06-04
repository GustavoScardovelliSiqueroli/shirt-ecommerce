package com.project.ecommerce.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "colors")
public class ColorsModel implements Serializable {
    private static final long serialVersionUIDLONG = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "color_id")
    private UUID colorId;
    private String name;

    @OneToMany(mappedBy = "colors")
    Set<ShirtColorsModel> shirtColorsModels;

    public Set<ShirtColorsModel> getShirtColorsModels() {
        return shirtColorsModels;
    }

    public void setShirtColorsModels(Set<ShirtColorsModel> shirtColorsModels) {
        this.shirtColorsModels = shirtColorsModels;
    }

    public UUID getColorId() {
        return colorId;
    }

    public void setColorId(UUID colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
