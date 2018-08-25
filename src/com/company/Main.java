package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay conditionsDisplay=new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurments(25,86,98);
    }
}
