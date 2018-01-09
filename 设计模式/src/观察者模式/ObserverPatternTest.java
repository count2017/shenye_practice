package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternTest {
	public static void main(String[] args) {
		WheatherData weatherdata = new WheatherData();
		CurrentConditionsDisplay currentConDisplay = 
				new CurrentConditionsDisplay(weatherdata);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherdata);
		
		List<Float> forecastTemperatures = 
				new ArrayList<Float>();
		forecastTemperatures.add(22f);
        forecastTemperatures.add(-1f);
        forecastTemperatures.add(9f);
        forecastTemperatures.add(23f);
        forecastTemperatures.add(27f);
        forecastTemperatures.add(30f);
        forecastTemperatures.add(10f);
        weatherdata.setMeasurements(22f, 0.8f, 1.2f, forecastTemperatures);
	}
}
