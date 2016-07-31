package th.co.krungthaiaxa.api.taxcert.controller;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.co.krungthaiaxa.api.taxcert.model.Greeting;

/**
 * Created by wuttichai on 7/30/2016 AD.
 */
@RestController
public class TaxcertController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method= RequestMethod.GET,value="/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(method= RequestMethod.GET,value="/greeting2/{name}")
    public Greeting greeting2(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }


    @RequestMapping(method= RequestMethod.GET,value="/testing",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String testing() {
        return "Hello World";
    }



    @RequestMapping(method= RequestMethod.POST,value="/runCycle")
    public Map<String, String> runCycle(@RequestBody Greeting cycle) {
        System.out.println(cycle.getContent());
        System.out.println(cycle.getId());
        System.out.println(cycle.toString());
        return Collections.singletonMap("response", "your string value");
    }

    @RequestMapping(method= RequestMethod.POST,value="/patchData")
    public Greeting patchData(@RequestParam(value="patchcontent") String patchcontent) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, patchcontent));
    }

}
