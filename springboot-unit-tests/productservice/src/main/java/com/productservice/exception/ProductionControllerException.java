package com.productservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductionControllerException {

    @ExceptionHandler(value = InvalidCouponException.class)
    public ResponseEntity<Object> exception(InvalidCouponException exception) {
        return new ResponseEntity<>("Invalid Coupon Entered", HttpStatus.NOT_FOUND);
    }
}
