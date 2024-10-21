package org.store.gpsmapping.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.store.gpsmapping.entity.Location;
import org.store.gpsmapping.repository.LocationRepository;

import java.util.List;

@Service @RequiredArgsConstructor
public class LocationService {

    private final LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }
}
