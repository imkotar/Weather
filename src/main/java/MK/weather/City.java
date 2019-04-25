package MK.weather;


public class City {

    private String city;
    private String temperature;
    private String longitude;
    private String latitude;
    private String pressure;

    ApiReader read = new ApiReader();

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getTemperature() {
        return read.readApi(0, getCity());
    }

    public void setTemperature(String temperature) { this.temperature = temperature; }

    public String getLongitude() {
        return read.readApi(1, getCity());
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return read.readApi(2, getCity());
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPressure() {
        return read.readApi(3, getCity());
    }

    public void setPressure(String pressure) { this.pressure = pressure; }
}
