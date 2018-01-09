package 责任链模式;

public abstract class Leader {
	protected String name;//丢给子类使用，protected
	protected Leader nextLeader;//责任链上的 后继对象
	
	public Leader(String name) {
		super();
		this.name = name;
	}
	//设定责任链上的后继对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	/**
	 * 处理请求的核心的业务方法
	 * @param reuqest
	 */
	public abstract void handleRequest(LeaveRequest request);
	
//	public abstract void run();
}
