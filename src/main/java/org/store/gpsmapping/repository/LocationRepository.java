package org.store.gpsmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.store.gpsmapping.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
}
