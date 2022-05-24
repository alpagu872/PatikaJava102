package Z_New_era.A_HashMapAndInterface;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> countries = new HashMap<String,String>();
        countries.put("TR","TURKIYE");
        countries.put("GR" , "ALMANYA");
        countries.put("FR" , "FRANSA");
        countries.put("EN" , "İNGİLTERE");
        System.out.println(countries.get("TR"));
        System.out.println(countries.get("EN"));
        countries.remove("FR");
        System.out.println(countries.get("FR"));
        countries.replace("GR","GERMANY");


        for (String CountryKeys : countries.keySet() ) {
            System.out.println(CountryKeys);
        }
        System.out.println("***************");
        for (String countyValues: countries.values()){
            System.out.println(countyValues);
        }
    }
}
