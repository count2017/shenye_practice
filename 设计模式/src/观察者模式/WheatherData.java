package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject {
	private List<Observer> observers;
	
	private float temperature;//温度
	private float humidity;//湿度
	private float pressure;//气压
	private List<Float> forecastTemperatures;//未来几天的温度
	
	public WheatherData(){
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObervers() {
		for (Observer ob : observers) {
			ob.update();
		}
	}
	
	public void measurementsChanged(){
		notifyObervers();
	}
	
	public void setMeasurements(float temperature,
			float humidity,float pressure,
			List<Float> forecastTemperatures){
		this.temperature = temperature;
		this.humidity = humidity;
		this.forecastTemperatures = forecastTemperatures;
		measurementsChanged();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public List<Float> getForecastTemperatures() {
		return forecastTemperatures;
	}
	
}
