package 命令模式;

public class ConcreteCommand implements Command{
	private Receiver receiver;//命令的真正执行者
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		//命令执行前、执行后可进行操作
		receiver.action();
	}

}
