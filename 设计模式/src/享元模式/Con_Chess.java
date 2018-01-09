package 享元模式;

public class Con_Chess implements ChessFlyWeight{
	private String color;
	
	public Con_Chess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		color = c;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色是："+color);
		System.out.println("棋子位置是："+c.getX()+"  "+c.getY());
	}

}
