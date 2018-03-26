package enpit.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hallo aus dem RestController";
    }
}
