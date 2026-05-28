package com.assetapp.assets.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assetapp.assets.entity.Asset;
import com.assetapp.assets.repository.AssetRepository;

// TODO: Mark this class as a Service component
@Service
public class AssetService {

    // TODO: Define the AssetRepository variable (should be final)
    private final AssetRepository ar;

    // TODO: Inject the AssetRepository using Constructor Injection
    AssetService(AssetRepository ar){
        this.ar = ar;
    }


    // 1. CREATE: Save a new asset
    public Asset addAsset(Asset asset) {
        // TODO: Use the repository to save the asset
        return ar.save(asset);
    }

    // 2. READ: Get all assets
    public List<Asset> getAllAssets() {
        return ar.findAll();
    }

    // 3. READ: Get a single asset by ID
    public Asset getAssetById(Long id) {
        // TODO: Find by ID (return null if not found)
        return ar.findById(id).orElse(null);
    }

    // 4. READ: Get assets by Category
    public List<Asset> getAssetsByCategory(String category) {
        // TODO: Use the derived query from the repository
        return ar.findByCategory(category);
    }

    // 5. UPDATE: Modify an existing asset
    public Asset updateAsset(Long id, Asset assetDetails) {
        // TODO: Find the existing asset by ID
        // TODO: If it exists: Update its fields (Name, Category, Purchase Value, Assigned To) and save it back to the database
        // TODO: If it does not exist: Return null
        if(ar.existsById(id)){
         assetDetails.setId(id);   
         return ar.save(assetDetails);
    }else {
        return null;
    }
    }

    // 6. DELETE: Remove an asset
    public String deleteAsset(Long id) {

        // TODO: Check if the asset exists
        if (ar.existsById(id)) {
            // TODO: If yes: Delete it and return a success message
            ar.deleteById(id);
            return "Asset with ID " + id + " has been successfully deleted.";
        } else {
            // TODO: If no: Return a "Not Found" message
            return "Asset with ID " + id + " not found.";
        }
    }
}



