package 接口和this变量;

public interface IQueryDao {
	public <T> IQueryDao createQuery(Class<T> clazz);
}
