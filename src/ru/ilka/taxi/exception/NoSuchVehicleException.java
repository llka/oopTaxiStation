package ru.ilka.taxi.exception;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class NoSuchVehicleException extends Exception {
    public NoSuchVehicleException() {
    }

    public NoSuchVehicleException(String message) {
        super(message);
    }

    public NoSuchVehicleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchVehicleException(Throwable cause) {
        super(cause);
    }

    public NoSuchVehicleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
