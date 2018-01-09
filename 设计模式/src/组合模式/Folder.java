package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile{
	private String name;
	
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	//定义容器，用来存放本容器构建下的字节点
	private List<AbstractFile> list=
			 new ArrayList<AbstractFile>();
	
	public void add(AbstractFile abstractFile){
		list.add(abstractFile);
	}
	
	public void remove(AbstractFile abstractFile){
		list.remove(abstractFile);
	}
	
	public AbstractFile getChild(int index){
		return list.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("--文件夹"+name+"，进行查杀");
		for (AbstractFile abstractFile : list) {
			abstractFile.killVirus();
		}
	}

}
