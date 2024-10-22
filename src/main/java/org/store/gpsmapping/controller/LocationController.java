package org.store.gpsmapping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.store.gpsmapping.entity.Location;
import org.store.gpsmapping.service.LocationService;

import java.util.List;

@RestController @RequestMapping("/api/locations") @RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @GetMapping
    public ResponseEntity<List<Location>> getAllLocations() {
        return ResponseEntity.ok(locationService.getAllLocations());
    }

}
