package com.project.ecommerce.repositories;

import com.project.ecommerce.entities.ShirtModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShirtRepository extends JpaRepository<ShirtModel, UUID> {
}
