package br.com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        
        Map<String, String> caixa = new HashMap<String, String>();
        caixa.put("M2225", "Ahri");
        caixa.put("M2226", "Akali");
        caixa.put("M2227", "Soraka");

        System.out.println(caixa.isEmpty());
        System.out.println(caixa.size());
        System.out.println(caixa.containsKey("M2225"));
        System.out.println(caixa.containsValue("Ahri"));
        System.out.println(caixa);
    }
}
