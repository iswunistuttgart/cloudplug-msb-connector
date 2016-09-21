package rest;

import models.CloudPlugModelLegacy;
import models.CloudPlugModelOptimizedIsochronous;
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

    @RequestMapping(value = "/cloudplug/data/0", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
    public void cloudPlugEndpoint0(@RequestParam("deviceId") String deviceId, @RequestBody CloudPlugModelLegacy model){
    }

    @RequestMapping(value = "/cloudplug/data/2", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
    public void cloudPlugEndpoint2(@RequestParam("deviceId") String deviceId, @RequestBody CloudPlugModelOptimizedIsochronous model){
    }

    @RequestMapping(value = "/getendpoint", method = RequestMethod.GET, produces = "application/json")
    public String getEndpoint(){
        return null;
    }

}
