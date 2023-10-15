package top.shop.shop1_service.exceptionhandler.exception;

import org.springframework.http.HttpStatus;

public class OrderServiceException extends AbstractException {
    public OrderServiceException(HttpStatus status, String errorMessage) {
        super(status, errorMessage);
    }
}
