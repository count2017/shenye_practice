package 建造者02;


/**
 * 类似的：StringBuiler,XML解析中，JDOM库中：DomBuilder，SaxBuilder
 * @author lenovo
 *
 */
public class AirshipBuilder_Cla implements
   AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("构件发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构件轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构件逃逸塔");
		return new EscapeTower("逃逸塔");
	}
	
}
