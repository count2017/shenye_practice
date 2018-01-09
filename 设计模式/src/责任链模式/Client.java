package 责任链模式;

public class Client {
	public static void main(String[] args) {
		Leader a = new Director("zhangsan");
		Leader b = new Manager("lisi");
		Leader c = new GeneralManager("wangwu");
		
		//组织责任链间对象的关系
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		//开始请假操作
		LeaveRequest req1 = new LeaveRequest("Tom", 10, "回家看看");
		a.handleRequest(req1);
	}
}
