package 责任链模式;

/**
 * 总经理类
 * @author lenovo
 *
 */
public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 30){
			System.out.println("员工"+request.getEmpName()+"请假"+request.getLeaveDays()
			+"天，理由："+request.getReason());
			System.out.println("总经理"+this.name+"审批通过");
		}else{
			System.out.println("莫非"+request.getEmpName()+"想。。。。。。。");
		}
	}
	
}
