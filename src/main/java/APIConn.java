import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.JsonObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONArray;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class APIConn {
    private static String regionApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/region.xml";
    private static String sprprf_uozApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/sprprf_uoz.xml";
    private static String sprprfApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/sprprf.xml";
    private static String cl_totalApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/cl_total.xml";
    private static String v_api_inyaz_resApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_inyaz_res.xml";
    private static String v_api_inyaz_vakApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_inyaz_vak.xml";
    private static String v_api_kartprigApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_kartprig.xml";
    private static String otklikiApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_otkliki.xml";
    private static String v_api_subscribeApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_subscribe.xml";
    private static String v_api_vacanciesApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_vacancies.xml";
    private static String v_api_employers_minApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_employers_min.xml";
    private static String v_api_educationsApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_educations.xml";
    private static String v_api_experiencesApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_experiences.xml";
    private static String v_api_persons_minAPI = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_persons_min.xml";
    private static String v_api_positionsApi = "https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_positions.xml";

    public void getFromVacancies() {
        try {
            URL url = new URL("https://api.covid19api.com/summary");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Close the scanner
                scanner.close();

                //Using the JSON simple library parse the string into a json object
                JSONParser parse = new JSONParser();
                JSONObject data_obj = (JSONObject) parse.parse(inline);

                //Get the required object from the above created object
                JSONObject obj = (JSONObject) data_obj.get("Global");

                //Get the required data using its key
                System.out.println(obj.get("TotalRecovered"));

                JSONArray arr = (JSONArray) data_obj.get("Countries");

                for (int i = 0; i < arr.size(); i++) {

                    JSONObject new_obj = (JSONObject) arr.get(i);

                    if (new_obj.get("Slug").equals("albania")) {
                        System.out.println("Total Recovered: " + new_obj.get("TotalRecovered"));
                        break;
                    }
                }
            }

        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }


}
//в 3 апишках можно вытащит данные по местности
//        https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_vacancies.xml
//        https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_employers_min.xml
//        https://iac2:Iac2007RBD@www.enbek.kz/feed/resume/v_api_persons_min.xml