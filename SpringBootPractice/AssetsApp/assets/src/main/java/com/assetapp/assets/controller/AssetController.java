package com.assetapp.assets.controller;

import org.springframework.web.bind.annotation.*;

import com.assetapp.assets.entity.Asset;
import com.assetapp.assets.service.AssetService;

import java.util.List;

// TODO: Mark this class as a REST Controller
// TODO: Define the base URL for all endpoints ("/api")
@RestController
@RequestMapping("/api")
public class AssetController {

    // TODO: Define the AssetService variable (should be final)
    private final AssetService as;

    // TODO: Inject the AssetService using Constructor Injection
    AssetController(AssetService as){
       this.as = as;
    }


    // 1. POST: Add a new asset
    // TODO: Map this method to the URL "/add"
    // TODO: Use @RequestBody to map the JSON input to the Asset object
    @PostMapping("/add")
    public Asset addAsset(@RequestBody Asset asset) {
        return as.addAsset(asset);
    }

    // 2. GET: Retrieve all assets
    // TODO: Map this method to the URL "/all"
    @GetMapping("/all")
    public List<Asset> getAllAssets() {
        return as.getAllAssets();
    }

    // 3. GET: Retrieve asset by ID
    // TODO: Map this method to "/{id}"
    // TODO: Use @PathVariable to extract the "id" from the URL
    @GetMapping("/{id}")
    public Asset getAssetById(@PathVariable Long id) {
        return as.getAssetById(id);
    }

    // 4. GET: Retrieve assets by category
    // TODO: Map this method to "/category/{category}"
    // TODO: Use @PathVariable to extract the "category"
    @GetMapping("/category/{category}")
    public List<Asset> getAssetsByCategory(@PathVariable String category) {
        return as.getAssetsByCategory(category);
    }

    // 5. PUT: Update an existing asset
    // TODO: Map this to "/update/{id}"
    // TODO: Use @PathVariable for the ID and @RequestBody for the asset details
    @PutMapping("/update/{id}")
    public Asset updateAsset(@PathVariable Long id, @RequestBody Asset assetDetails) {
        return as.updateAsset(id,assetDetails);
    }

    // 6. DELETE: Remove an asset
    // TODO: Map this to "/delete/{id}"
    // TODO: Use @PathVariable for the ID
    @DeleteMapping("/delete/{id}")
    public String deleteAsset(@PathVariable Long id) {
        return as.deleteAsset(id);
    }
}


