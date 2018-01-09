package 接口和this变量;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HisDao implements IQueryDao{
	
	private static ThreadLocal<String> sql = new ThreadLocal<String>();
    private static ThreadLocal<StringBuffer> whereSql = new ThreadLocal<StringBuffer>();
    private static ThreadLocal<StringBuffer> orderBy = new ThreadLocal<StringBuffer>();
    private static ThreadLocal<List<Object>>  args = new ThreadLocal<List<Object>>();
    private static ThreadLocal<Integer> firstResult = new ThreadLocal<Integer>();
    private static ThreadLocal<Integer> maxResults = new ThreadLocal<Integer>();
    private static Map<String,Object> cache = new HashMap<String,Object>();

	@Override
	public <T> IQueryDao createQuery(Class<T> clazz) {
		String clazzName = clazz.getName().replaceAll(clazz.getPackage().getName()+".","");
	    sql.set(" from " + clazzName + aiase());
	    orderBy.set(new StringBuffer());
	    whereSql.set(new StringBuffer(" where 1=1 "));
	    args.set(new ArrayList<Object>());
	    maxResults.set(0);
	    firstResult.set(0);
	    return this;
	}
	
	protected String aiase(){
		return " e";
	}
}
