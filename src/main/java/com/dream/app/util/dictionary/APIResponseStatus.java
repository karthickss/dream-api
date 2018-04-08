package com.dream.app.util.dictionary;

/**
 * Created by karthick on 08/04/2018.
 */
public enum APIResponseStatus {

    failed("failed"),success("success");

    private String value;

    APIResponseStatus(String value) {

        this.value = value;

    }
}
