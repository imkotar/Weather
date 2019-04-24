package MK.weather;

public class City {

    private String city;
    private String temperature;
    private String longitude;
    private String latitude;

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getTemperature() {
        ApiReader read = new ApiReader();
        return read.readApi(getCity());
    }
    public void setTemperature(String temperature) { this.temperature = temperature; }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
