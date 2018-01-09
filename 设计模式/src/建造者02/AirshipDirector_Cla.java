package 建造者02;

public class AirshipDirector_Cla implements
   AirshipDirector{
	
	private AirShipBuilder builder;
	
	public AirshipDirector_Cla(AirShipBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public AirShip directAirship() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//装配飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}

}
