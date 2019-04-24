package MK.weather;

public class Greeting {

    private String city_input;

    public String getCity_input() {
        return city_input;
    }

    public void setCity_input(String city_input) {
        this.city_input = city_input;
    }

//    public String apiReader_response(){
//        ApiReader read = new ApiReader();
//        return read.readApi(city_input);
//    }

    public String cityResponse_city(){
        City city_city = new City();
        city_city.setCity(city_input);
        return city_city.getCity();
    }

    public String cityResponse_temperature(){
        City city_city = new City();
        city_city.setCity(city_input);
        return city_city.getTemperature();
    }

}
