package main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class LoginController {

    @RequestMapping("/ping")
    @Scope("request")
    @ResponseBody
    public String ping(@RequestParam(name="info") String info){
        return info+"\n Login->Seed: "+Main.getSeed();
    }
}
