package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class PlantInventoryEntry {
        @Id @GeneratedValue
        Long Id;
        String description;
        @Column(precision=8, scale=2)
        BigDecimal price;
        String name;

}
