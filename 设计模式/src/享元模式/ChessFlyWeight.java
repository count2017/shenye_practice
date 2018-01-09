package 享元模式;

public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}
