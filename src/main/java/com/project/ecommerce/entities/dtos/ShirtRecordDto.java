package com.project.ecommerce.entities.dtos;

import jakarta.validation.constraints.NotBlank;

public record ShirtRecordDto(@NotBlank String name,@NotBlank String size,@NotBlank String color,@NotBlank String description ) {
}
