package com.example.apicoords;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CoordsRepository extends JpaRepository<Coords, Long> {
 @Query(value="select lat,lon from coords where trip_number=:tripNumber", nativeQuery=true)
 List<Object[]> findLatLoneByTripNumber(Long tripNumber);

}
