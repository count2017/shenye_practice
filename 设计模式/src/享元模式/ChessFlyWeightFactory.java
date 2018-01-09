package 享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author lenovo
 *
 */
public class ChessFlyWeightFactory {
	private static Map<String,ChessFlyWeight> map =
			new HashMap<>();
	
	public static ChessFlyWeight getChess(String color){
		if(map.get(color) != null){
			return map.get(color);
		}else{
			ChessFlyWeight cfw = new Con_Chess(color);
			map.put(color, cfw);
			return cfw;
		}
	}
}
