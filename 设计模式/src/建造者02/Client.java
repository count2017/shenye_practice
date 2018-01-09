package 建造者02;

public class Client {
	public static void main(String[] args) {
		AirshipDirector director = new AirshipDirector_Cla(
				new AirshipBuilder_Cla());
		
		AirShip ship = director.directAirship();
		
		System.out.println(ship.getEngine().getName());
	}
}
