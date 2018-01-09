package 组合模式;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5,f6;
		Folder f1 = new Folder("我的收藏");
		f2 = new ImageFile("大头像照.png");
		f3 = new TextFile("Hello.txt");
		
		f1.add(f2);
		f1.add(f3);
		
//		f1.killVirus();
		System.out.println("===========");
		Folder f11 = new Folder("我的电影");
		f4 = new VideoFile("英雄本色");
		f5 = new VideoFile("教父");
		
		f11.add(f4);
		f11.add(f5);
		
		f1.add(f11);
		 
		f1.killVirus();
		
	}
}
