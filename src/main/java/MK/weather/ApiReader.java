package MK.weather;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ApiReader {


    public String readApi(int number, String readCity) {
        ApiID readApiID = new ApiID();
        try {
            String url= "http://api.openweathermap.org/data/2.5/weather?q="+readCity+"&APPID=" + readApiID.getApi_id();
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject myresponse = new JSONObject(response.toString());
            JSONObject main_object = new JSONObject(myresponse.getJSONObject("main").toString());
            JSONObject name_object = new JSONObject(myresponse.toString());
            JSONObject coord_object = new JSONObject(myresponse.getJSONObject("coord").toString());

            //what will be red from api:

            double pressure_value = main_object.getDouble("pressure");
            String name = name_object.getString("name");
            double longitude = coord_object.getDouble("lon");
            double latitude = coord_object.getDouble("lat");
            double temp_value = main_object.getDouble("temp") - 273;
            temp_value*=100;
            temp_value=Math.round(temp_value);
            temp_value/=100;

            //double to string conversion

            String longitude_string=String.valueOf(longitude);
            String latitude_string=String.valueOf(latitude);
            String temp_value_string=String.valueOf(temp_value);
            String pressure_value_string=String.valueOf(pressure_value);

            ArrayList<String> apiResponse = new ArrayList<>();
            apiResponse.add(temp_value_string +" °C");
            apiResponse.add(String.valueOf(longitude));
            apiResponse.add(String.valueOf(latitude));
            apiResponse.add(pressure_value_string + " hPa");
            apiResponse.add(name);

            return apiResponse.get(number);

        } catch (Exception e) {
            System.out.println(e);
        }
        return "incorrect City name!";
    }

}
