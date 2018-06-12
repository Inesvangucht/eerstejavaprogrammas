package Weather;

public enum MonthsWeather {

    JANUARI ("januari", 11, 22),
    FEBRUARI ("februari", 10,10),
    MAART ("maart",15,20),
    APRIL ("april",16,22),
    MEI ("mei", 22,15),
    JUNI("juni", 24,26),
    AUGUSTUS ("augustus", 25,22),
    SEPTEMBER ("september",19,28),
    OKTOBER ("oktober",15,25),
    NOVEMBER ("november",14,26),
    DECEMBER ("december",8,26);


    final String name;
    final int temp;
    final int rain;

    MonthsWeather(String name, int temp, int rain) {
        this.name = name;
        this.temp = temp;
        this.rain = rain;
    }

    public String getName() {
        return this.name;
    }

    public int getTemp() {
        return this.temp;
    }

    public int getRAin() {
        return this.rain;
    }

    public void giveWeather(){
        System.out.println("Het gemiddelde temperatuur in " + this.name + " is gemiddeld " + this.temp + "graden Celsius.");
    }

}
