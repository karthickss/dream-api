package com.dream.app.util;

/**
 * Created by karthick on 08/04/2018.
 */
public abstract class APIResponseObjectFactory {


    public static APIResponseObject getJSONAPIResponseObject() {

        return new APIResponseObject();

    }
}
