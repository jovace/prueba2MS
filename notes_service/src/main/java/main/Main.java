package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class Main {
    private static int seed;
    public static void main(String[] args){
        seed=(int)(Math.random()*256);
        SpringApplication.run(Main.class, args);
    }

    public static int getSeed(){
        return seed;
    }
}
