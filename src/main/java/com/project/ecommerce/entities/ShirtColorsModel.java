package com.project.ecommerce.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "shirt_colors")
public class ShirtColorsModel implements Serializable {
    private static final long serialVersionUIDLONG = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "s_color_id")
    private UUID sColorId;

    @ManyToOne
    private ColorsModel colors;

    @ManyToOne
    private ShirtModel shirts;

    @Column(nullable = false)
    private String size;



    public ColorsModel getColorsModel() {
        return colors;
    }

    public void setColorsModel(ColorsModel colors) {
        this.colors = colors;
    }

    public ShirtModel getShirtModel() {
        return shirts;
    }

    public void setShirtModel(ShirtModel shirts) {
        this.shirts = shirts;
    }

    public UUID getsColorId() {
        return sColorId;
    }

    public void setsColorId(UUID sColorId) {
        this.sColorId = sColorId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
