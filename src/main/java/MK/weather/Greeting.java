package MK.weather;

public class Greeting {

    private String city_input;

    public String getCity_input() {
        return city_input;
    }
    City city = new City();

    //    public String apiReader_response(){
//        ApiReader read = new ApiReader();
//        return read.readApi(city_input);
//    }

    public void setCity_input(String city_input) {
        this.city_input = city_input;
        city.setCity(city_input);
    }

    public String cityResponse_city(){
        return city.getCity();
    }
    public String cityResponse_name(){
        return city.getName();
    }
    public String cityResponse_temperature(){
        return city.getTemperature();
    }
    public String cityResponse_pressure(){
        return city.getPressure();
    }

}
