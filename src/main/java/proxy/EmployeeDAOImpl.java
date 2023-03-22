package proxy;

import proxy.EmployeeDAO;
public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void create(Role role) throws Exception {
        //perform create operations
        System.out.println("Row Object Created");
    }

    @Override
    public void delete(Role role, String id) throws Exception {
        //perform delete operations
        System.out.println("Row Object Deleted: " + id);
    }

    @Override
    public void update(Role role, String id) throws Exception {
        //perform update operations
        System.out.println("Employee Object Updated: "+ id);
    }
}
