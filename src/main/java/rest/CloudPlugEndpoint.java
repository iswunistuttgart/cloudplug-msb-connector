package rest;

import models.CloudPlugModel;
import org.springframework.web.bind.annotation.*;

/**
 * @author Timur Tasci
 * @version 1.0
 * @date 07.09.2016
 * @copyright Timur Tasci, ISW Uni Stuttgart
 */

@RestController
@RequestMapping("api")
public class CloudPlugEndpoint {

    @RequestMapping(value = "/cloudplug/data/0", method = RequestMethod.POST)
    public void cloudPlugEndpoint(@RequestBody CloudPlugModel model){

    }

    @RequestMapping(value = "/getendpoint", method = RequestMethod.GET, produces = "application/json")
    public String getEndpoint(){
        return null;
    }

}
