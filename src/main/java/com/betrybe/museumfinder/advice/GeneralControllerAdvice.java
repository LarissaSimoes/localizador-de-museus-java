package com.betrybe.museumfinder.advice;

import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * General controller advice.
 */
@ControllerAdvice
public class GeneralControllerAdvice {

  @ExceptionHandler(InvalidCoordinateException.class)
  public ResponseEntity<String> handleInvalidCoordinateException() {
    return new ResponseEntity<>("Coordenada inválida!", HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(MuseumNotFoundException.class)
  public ResponseEntity<String> handleMuseumNotFoundException() {
    return new ResponseEntity<>("Museu não encontrado!", HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleException() {
    return new ResponseEntity<>("Erro interno!", HttpStatus.INTERNAL_SERVER_ERROR);
  }


}
