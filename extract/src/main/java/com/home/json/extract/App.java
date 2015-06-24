package com.home.json.extract;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Hello world!
 *
 */
public class App {
    public static final String JSON_FILE = "C:\\Home\\json\\Liechtenstein.json";

    public static void main(String[] args) throws Exception {

        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(JSON_FILE));
        for (Object object : jsonArray) {
            JSONObject jsonObject = (JSONObject) object;

            String type = (String) jsonObject.get("type");
            System.out.println("type::::" + type);

            String spec = (String) jsonObject.get("spec");
            System.out.println("type::::" + spec);

            String area = (String) jsonObject.get("area");
            System.out.println("area::::" + area);

            Integer year = (Integer) jsonObject.get("year");
            System.out.println("year::::" + year);

            String title = (String) jsonObject.get("title");
            System.out.println("title::::" + title);

            JSONArray picsarrays = (JSONArray) jsonObject.get("pics");
            for (Object pic : picsarrays) {
                JSONObject jsonPic = (JSONObject) pic;
                String picType = (String) jsonPic.get("type");
                System.out.println("picType::::" + picType);

                @SuppressWarnings("unchecked")
                List<Integer> dim = (ArrayList<Integer>) jsonPic.get("dim");
                System.out.println("dim::::" + dim);
                String file = (String) jsonPic.get("file");
                String descr = (String) jsonPic.get("descr");
                System.out.println("file::::" + file);
                System.out.println("descr::::" + descr);
            }
            @SuppressWarnings("unchecked")
            ArrayList<ArrayList<String>> data = (ArrayList<ArrayList<String>>) jsonObject.get("data");
            System.out.println("data::::" + data);
            System.out.println();

        }
    }
}
