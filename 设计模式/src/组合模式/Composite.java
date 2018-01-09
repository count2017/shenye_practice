package 组合模式;

/**
 * 容器组件
 * @author lenovo
 */
public interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
	
	
}
