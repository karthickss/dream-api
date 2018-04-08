package com.dream.app.util.dictionary;

/**
 * Created by sandheepgr on 17/2/14.
 */
public enum APIResponseStatus {

    failed("failed"),success("success");

    private String value;

    APIResponseStatus(String value) {

        this.value = value;

    }
}
