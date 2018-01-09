package 观察者模式;

public class CurrentConditionsDisplay implements Observer,
Displayment{
	private WheatherData weatherdata;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay(WheatherData weatherdata){
		this.weatherdata = weatherdata;
		this.weatherdata.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("当前温度为：" + this.temperature + "℃");
        System.out.println("当前湿度为：" + this.humidity);
        System.out.println("当前气压为：" + this.pressure);
	}

	@Override
	public void update() {
		this.temperature = this.weatherdata.getTemperature();
		this.humidity = this.weatherdata.getHumidity();
		this.pressure = this.weatherdata.getPressure();
		display();
	}
	
}
