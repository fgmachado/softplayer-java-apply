package br.com.softplan.softplayerjavaapply.core.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handle(final BusinessException exception) {
        return ResponseEntity.status(exception.getStatus())
                .body(exception.getMessage());
    }

}
