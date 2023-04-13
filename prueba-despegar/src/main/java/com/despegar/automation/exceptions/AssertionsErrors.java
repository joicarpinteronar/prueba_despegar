package com.despegar.automation.exceptions;

public class AssertionsErrors extends AssertionError {

    private static final long serialVersionUID = 1L;


    public static final String MESSAGE_ERROR_WITHOUT_SPECIFY_PLACE_NOT_EXPECTED = "The error message is not showing";
    public static final String MESSAGE_ERROR_FIELD_CLEAN = "To continue, please correct the 2 errors below.";
    public static final String MESSAGE_ERROR_TEXT_CLEAN = "Please select an origin";


    public AssertionsErrors(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionsErrors(String message) {
        super(message);
    }


}
