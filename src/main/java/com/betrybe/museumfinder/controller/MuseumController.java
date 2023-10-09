package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Museum controller.
 */
@Controller
@RequestMapping("/museums")
public class MuseumController {
  private final MuseumServiceInterface museumService;

  @Autowired
  public MuseumController(MuseumServiceInterface museumService) {
    this.museumService = museumService;
  }

  /**
   * Create a museum.
   */
  @PostMapping
  public ResponseEntity<Museum> createMuseum(@RequestBody Museum museum) {
    Museum newMuseum = this.museumService.createMuseum(museum);
    if (newMuseum == null) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(museum, HttpStatus.CREATED);
  }

  /**
   * Get the closest museum.
   */
  @GetMapping("/closest")
  public ResponseEntity<Museum> getClosestMuseum(
      @RequestParam Double lat,
      @RequestParam Double lng,
      @RequestParam(name = "max_dist_km") Double maxDistance) {
    Coordinate coordinate = new Coordinate(lat, lng);
    Museum museum = this.museumService.getClosestMuseum(coordinate, maxDistance);
    if (museum == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(museum, HttpStatus.OK);
  }

}
