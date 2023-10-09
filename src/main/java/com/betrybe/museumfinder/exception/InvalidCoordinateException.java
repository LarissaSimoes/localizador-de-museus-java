package com.betrybe.museumfinder.exception;

/**
 * Exception to be thrown when an invalid coordinate is provided.
 */
public class InvalidCoordinateException extends RuntimeException {
  public InvalidCoordinateException(String message) {
    super(message);
  }

}
