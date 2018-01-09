package 注解;

import java.util.List;

public class PswUtils {
	
	@UseCase(id=47,description="pwd must contain at least one number", hehe = "1")
	public boolean validPwd(String pwd){
		return (pwd.matches("\\w*\\d\\w*"));
	}
	
	@UseCase(id=48, hehe = "2")
	public String encryptPassword(String pwd){
		return new StringBuilder(pwd).reverse().toString();
	}
	
	@UseCase(id=49,description="new pwd can't contain ...", hehe = "3")
	public boolean checkForNewpwd(List<String> prePwd,String pwd){
		return !prePwd.contains(pwd);
	}
}
