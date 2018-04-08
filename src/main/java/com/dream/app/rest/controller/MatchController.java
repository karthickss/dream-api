package com.dream.app.rest.controller;

import com.dream.app.core.domain.Match;
import com.dream.app.core.service.MatchService;
import com.dream.app.rest.resource.MatchResource;
import com.dream.app.util.APIResponseObject;
import com.dream.app.util.APIResponseObjectFactory;
import com.dream.app.util.dictionary.APIResponseStatus;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class MatchController {

    @Autowired
    private Mapper mapper;

    @Autowired
    MatchService matchService;

    // Create the logger instance
    private static Logger log = LoggerFactory.getLogger(MatchController.class);


    @RequestMapping(value = "/api/0.9/json/admin/match", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public APIResponseObject saveMatch(@RequestBody Map<String,Object> params) throws Exception {

        // Create the response object
        APIResponseObject retData = APIResponseObjectFactory.getJSONAPIResponseObject();

        MatchResource matchResource= mapper.map(params,MatchResource.class);

        // Log the Request
        log.info("saveMatch - Request Received# Match : "+matchResource) ;

        // Call the saveData
        Match match = matchService.saveMatchDetail(matchResource);

       // set status
        retData.setStatus(APIResponseStatus.success);

        // Set the data to the match number
        retData.setData(match.getMatMatchNo());

        // Log the response
        log.info("saveCustomer - " +match.getMatMatchNo());

        // Return the retData
        return retData;


    }
}
