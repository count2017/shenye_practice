package annotations.javabean;

import annotations.database.Constraints;
import annotations.database.DBTable;
import annotations.database.SQLInteger;
import annotations.database.SQLString;

@DBTable(name="MEMBER")//表名
public class Member {
	//长度30
	@SQLString(30) 
	String firstName;
	
	//长度50
	@SQLString(50) String lastName;
	
	@SQLInteger Integer age;
	
	@SQLString(value=30,constraints=
			@Constraints(primaryKey=true))
	String handle;
	
	static int memberCount;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public String getHandle() {
		return handle;
	}
	
	@Override
	public String toString(){
		return handle;
	}
	
}
