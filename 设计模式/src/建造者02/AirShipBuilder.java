package 建造者02;

public interface AirShipBuilder {
	Engine builderEngine();
	
	OrbitalModule builderOrbitalModule();
	
	EscapeTower builderEscapeTower();
}
