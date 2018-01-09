package 泛型;

import java.util.List;

public class Canvas {
	public void drawAll(List<? extends Shape> shapes){
		/*for (Shape shape : shapes) {
			shape.draw();
		}*/
		shapes.addAll(0,new Rectangle());
		
	}
}
