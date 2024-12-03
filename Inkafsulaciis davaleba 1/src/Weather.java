public class Weather {
    private String city;
    private double speedOfWind;
    private double rainPercentage;
    private boolean rainyWeather;
    private boolean cloudyWeather;
    private boolean sunnyWeather;

    Weather() {
        city = "null";
        speedOfWind = 0.0;
        rainPercentage = 0.0;
        rainyWeather = false;
        cloudyWeather = false;
        sunnyWeather = false;
    }

    Weather(String city, double speedOfWind, double rainPercentage, boolean rainyWeather, boolean cloudyWeather, boolean sunnyWeather) {
        this.city = city;
        this.speedOfWind = speedOfWind;
        this.rainPercentage = rainPercentage;
        this.rainyWeather = rainyWeather;
        this.cloudyWeather = cloudyWeather;
        this.sunnyWeather = sunnyWeather;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSpeedOfWind(double speedOfWind) {
        this.speedOfWind = speedOfWind;
    }

    public void setRainPercentage(double rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public void setRainyWeather(boolean rainyWeather){
        this.rainyWeather = rainyWeather;
    }

    public void setCloudyWeather(boolean cloudyWeather) {
        this.cloudyWeather = cloudyWeather;
    }

    public void setSunnyWeather(boolean sunnyWeather) {
        this.sunnyWeather = sunnyWeather;
    }

    public String getCity() {
        return city;
    }

    public double getSpeedOfWind() {
        return speedOfWind;
    }

    public double getRainPercentage() {
        return rainPercentage;
    }

    public boolean getRainyWeather() {
        return rainyWeather;
    }

    public boolean getCloudyWeather() {
        return cloudyWeather;
    }

    public boolean getSunnyWeather() {
        return sunnyWeather;
    }

    public void printInfo() {
        System.out.println("City: " + city);
        System.out.println("Speed of wind: " + speedOfWind);
        System.out.println("Rain percentage: " + rainPercentage);

        if(rainyWeather) {
            System.out.println("It will rain.");
        } else {
            System.out.println("it won't rain.");
        }

        if(cloudyWeather) {
            System.out.println("It will be cloudy weather.");
        } else {
            System.out.println("It won't be cloudy weather.");
        }

        if(sunnyWeather) {
            System.out.println("It will be sunny weather.");
        } else {
            System.out.println("It won't be sunny weather");
        }
    }

    public boolean walk() {
        if(speedOfWind > 20.0 || rainPercentage > 40 || rainyWeather || cloudyWeather) {
            return false;
        } else {
            return true;
        }
    }
}
