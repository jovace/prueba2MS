package main;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class LoginController {

    @RequestMapping("/ping")
    @Scope("request")
    @ResponseBody
    public String ping(@RequestParam(name="info") String info){
        return info+" Seed: "+Main.getSeed();
    }
}
