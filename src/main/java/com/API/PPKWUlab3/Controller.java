package com.API.PPKWUlab3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @GetMapping("/Lab3")
    public String giveStringInfo(@RequestParam String str){
        String url = "http://localhost:8080/API?str=" +str;

        System.out.println(str);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);
        return result;
    }

//    @GetMapping("/")
//    public String help(){
//        return "Aby skorzystać z zaimplementowanej funkcjonalności jako endpoint należy do URL dopisać - \"/API?str=\" a po znaku \"=\" dowolny tekst.";
//    }
}
