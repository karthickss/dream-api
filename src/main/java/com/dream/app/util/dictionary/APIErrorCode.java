package com.dream.app.util.dictionary;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

/**
 * Created by sandheepgr on 20/4/14.
 */
public enum APIErrorCode {



    ERR_INVALID_INPUT(1),
    ERR_OPERATION_FAILED(2),
    ERR_EXCEPTION(3),
    ERR_NO_DATA(4),
    ERR_NOT_AUTHORIZED(5),
    ERR_NO_DATA_FOUND(6),
    ERR_DUPLICATE_ENTRY(7),
    ERR_STREAM_ERROR(8);



    private int value;

    APIErrorCode(int value) {

        this.value = value;

    }


    /**
     * Function to get the localized description of the errorcode for the APIErrorCode
     * Here the MessageSource is passed from calling function context
     * Function will read the localized message for the current error code
     *
     * @param messageSource - The MessageSource from the calling function
     *
     * @return - Return the String representation of the messageSoure
     */
    public String getLocalizedDesc(MessageSource messageSource) {

        // Get the current locale
        Locale locale = LocaleContextHolder.getLocale();

        // Variable holding the message
        String message = "";

        try {

            // Get the string
            message = messageSource.getMessage(this.toString(),new Object[0],locale);

        } catch (Exception e) {

            message = this.toString();

        }


        // Return the message
        return message;

    }


}