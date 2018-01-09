package 责任链模式;


public class ArrOfRes_chain_Obj {
	
//	static List<Leader> list = new ArrayList<Leader>();
	
	public static void setRelationship(LeaveRequest request){
		Leader a = new Director("zhangsan");
		Leader b = new Manager("lisi");
		Leader c = new GeneralManager("wangwu");
		
		//组织责任链间对象的关系
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		a.handleRequest(request);
	}
	
	
}
