package 享元模式;

public class Client {

	public static void main(String[] args) {
		ChessFlyWeight cfw1 = ChessFlyWeightFactory.getChess("black");
		ChessFlyWeight cfw2 = ChessFlyWeightFactory.getChess("black");
		System.out.println(cfw1);
		System.out.println(cfw2);
		
		System.out.println("===================");
		cfw1.display(new Coordinate(12, 15));
		cfw2.display(new Coordinate(55, 60));
	}

}
