package com.assetapp.assets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assetapp.assets.entity.Asset;

import java.util.List;

// TODO: Annotate this interface to mark it as a Repository component
@Repository
// TODO: Extend the JpaRepository interface, specifying Asset as the entity type and Long as the ID type
public interface AssetRepository extends JpaRepository <Asset,Long> {

    // TODO: Write a Derived Query method to find assets by their category
    // Hint: The method name must follow the pattern 'findBy' + FieldName
    // Example : SELECT * FROM corporate_assets WHERE category = ?
    // The return type should be a List of Asset objects
    List<Asset> findByCategory (String category);
}