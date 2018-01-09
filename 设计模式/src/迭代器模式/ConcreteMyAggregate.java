package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * @author lenovo
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();

	public ConcreteMyAggregate(List<Object> list) {
		super();
		this.list = list;
	}
	
	public void addObject(Object obj){
		this.list.add(obj);
	}
	
	public void removeObject(Object obj){
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	//获得迭代器
	public MyIterator createIterator(){
		return new ConcreteIterator();
	}
	
	/**
	 * 使用内部类定义迭代器
	 */
	private class ConcreteIterator implements MyIterator{
		
		private int cursor;
		
		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			if(cursor<list.size()) cursor++;
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()){
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0 ? true : false;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1)? true : false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
