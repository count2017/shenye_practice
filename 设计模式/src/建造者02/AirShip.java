package 建造者02;

/**
 * 宇宙飞船
 * @author lenovo
 *
 */
public class AirShip {
	private OrbitalModule orbitalModule;//轨道舱
	private Engine engine;//发动机
	private EscapeTower escapeTower;//逃逸塔
	
	/**
	 * 发射方法
	 */
	public void launch(){
		
	}
	
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
	
	
}
