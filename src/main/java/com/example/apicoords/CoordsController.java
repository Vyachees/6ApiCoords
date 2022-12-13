package com.example.apicoords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CoordsController {

	@Autowired
	CoordsRepository coordsRepository;

	@GetMapping("/coords")
	public ResponseEntity<List<Coords>> getAllCoords() {
		try {
			List<Coords> coords = new ArrayList<>(coordsRepository.findAll());
			if (coords.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(coords, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@GetMapping("/coords/{id}")
	public ResponseEntity<Coords> getCoordsById(@PathVariable("id") Long id) {
		Optional<Coords> coordsData = coordsRepository.findById(id);
		return coordsData.map(coords -> new ResponseEntity<>(coords, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@GetMapping("/coords/trip/{trip_number}")
	public ResponseEntity<List<Object[]>> getLatLonByTripNumber(@PathVariable("trip_number") Long tripNumber)
	{
		try {
			List<Object[]> coords = new ArrayList<>(coordsRepository.findLatLoneByTripNumber(tripNumber));

			if (coords.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(coords, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
