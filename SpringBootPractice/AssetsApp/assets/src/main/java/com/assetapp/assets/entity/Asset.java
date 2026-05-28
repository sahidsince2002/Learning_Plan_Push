package com.assetapp.assets.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// TODO: Mark this class as a JPA Entity
// TODO: Map this entity to a table named "corporate_assets"
@Entity
@Table(name="corporate_assets")
public class Asset {
    
    // TODO: Define the Primary Key 'id' (Long)
    // TODO: Configure it to Auto-Increment (IDENTITY strategy)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    // Domain fields
    @Getter @Setter private String assetName;
    @Getter @Setter private String category;
    @Getter @Setter private Double purchaseValue;
    @Getter @Setter private String assignedTo;

    // TODO: Write the default Constructor (Unparameterized Constructor required by JPA)
    Asset(){

    }

    // TODO: Write the parameterized Constructor
    Asset(String assetName,String category,Double purchaseValue,String assignedTo){
         this.assetName = assetName;
         this.category = category;
         this.purchaseValue = purchaseValue;
         this.assignedTo = assignedTo;
    }


    // TODO: Write the Getters and Setters for all fields
    // You have 2 options: 
    // 1. Manually write them
    // 2. Use Lombok annotations to generate them automatically using @Getter and @Setter
   



}
