package com.dream.app.rest.controller;

import com.dream.app.util.APIResponseObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class MatchController {

    @RequestMapping(value = "/api/0.9/json/merchant/customer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public APIResponseObject saveCustomer(@RequestBody Map<String,Object> params) throws InspireNetzException {

        // Create the response object
        APIResponseObject retData = APIResponseObjectFactory.getJSONAPIResponseObject();

        CustomerResource customerResource= mapper.map(params,CustomerResource.class);

        CustomerProfileResource customerProfileResource= mapper.map(params,CustomerProfileResource.class);

        // Log the Request
        log.info("saveCustomer - Request Received# Customer : "+customerResource + " - CustomerProfile : " + customerProfileResource) ;
        log.info("saveCustomer - "+generalUtils.getLogTextForRequest());


        // Call the saveData
        Customer customer = customerService.saveCustomerDetails(customerResource,customerProfileResource);

        // Set the status as success as otherwise for any error condition, we will
        // have the exception thrown from there
        retData.setStatus(APIResponseStatus.success);

        // Set the data to the customer number
        retData.setData(customer.getCusCustomerNo());



        // Log the response
        log.info("saveCustomer - "+generalUtils.getLogTextForResponse(retData));

        // Return the retData
        return retData;


    }
}
