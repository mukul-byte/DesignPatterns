package proxy;
public interface EmployeeDAO {
    public void create(Role role) throws Exception;
    public void delete(Role role, String id) throws Exception;
    public void update(Role role, String id) throws Exception;
}
