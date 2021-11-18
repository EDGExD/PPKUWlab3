package com.API.PPKWUlab3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @GetMapping("/JSON")
    public String makeJSON(@RequestParam String str){
        String url = "http://localhost:8080/API?str=" +str;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        return giveJSON(result);
    }

    @GetMapping("/CSV")
    public String makeCSV(@RequestParam String str){
        String url = "http://localhost:8080/API?str=" +str;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        return giveCSV(result);
    }

    @GetMapping("/XML")
    public String makeXML(@RequestParam String str){
        String url = "http://localhost:8080/API?str=" +str;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        return giveXML(result);
    }

    @GetMapping("/TXT")
    public String makeTXT(@RequestParam String str){
        String url = "http://localhost:8080/API?str=" +str;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        return giveTXT(result);
    }

    @GetMapping("/")
    public String help(){
        return "Aby skorzystać z zaimplementowanej funkcjonalności jako endpoint należy do URL dopisać format pliku np.- \"/XML\" oraz \"?str=\" a po znaku \"=\" dowolny tekst.";
    }


    public String giveCSV (String str)
    {
        String substr = str;

        StringBuilder sb = new StringBuilder();
        sb.append("Wielkie litery");
        sb.append(',');
        sb.append("Małe litery");
        sb.append(',');
        sb.append("Cyfry");
        sb.append(',');
        sb.append("Znaki specjalne");
        sb.append(',');
        sb.append("Suma znaków");
        sb.append('\n');

        for(int i =0; i <4; i++)
        {
            substr= substr.substring(substr.indexOf('>')+1);
            sb.append(substr.substring(0,substr.indexOf(' ')));
            sb.append(',');
        }

        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append('\n');


        return sb.toString();
    }

    public String giveJSON (String str)
    {
        String substr = str;

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"Wielkie litery\": ");

        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append(",\n");

        sb.append("\"Małe litery\": ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append(",\n");

        sb.append("\"Cyfry\": ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append(",\n");

        sb.append("\"Znaki specjalne\": ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append(",\n");

        sb.append("\"Suma znaków\": ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append('\n');
        sb.append('}');

        return sb.toString();
    }

    public String giveTXT (String str)
    {
        String substr = str;

        StringBuilder sb = new StringBuilder();

        sb.append("Wielkie litery: ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("\n");

        sb.append("Male litery: ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("\n");

        sb.append("Cyfry: ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("\n");

        sb.append("Znaki specjalne: ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("\n");

        sb.append("Suma znaków: ");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("\n");

        return sb.toString();
    }

    public String giveXML (String str)
    {
        String substr = str;

        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<StringInfo>\n");

        sb.append("<WielkieLitery>");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("</WielkieLitery>\n");

        sb.append("<MaleLitery>");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("</MaleLitery>\n");

        sb.append("<Cyfry>");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("</Cyfry>\n");

        sb.append("<ZnakiSpecjalne>");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("</ZnakiSpecjalne>\n");

        sb.append("<SumaZnaków>");
        substr= substr.substring(substr.indexOf('>')+1);
        sb.append(substr.substring(0,substr.indexOf(' ')));
        sb.append("</SumaZnaków>\n");
        sb.append("</StringInfo>\n");

        return sb.toString();
    }
}
