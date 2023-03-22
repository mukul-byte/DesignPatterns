package proxy;

import static proxy.Role.ADMIN;

public class EmployeeDAOImplProxy implements EmployeeDAO{
    private  EmployeeDAOImpl employeeDAO;

    public EmployeeDAOImplProxy() {
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(Role role) throws Exception {
        if(ADMIN.equals(role)){
            employeeDAO.create(role);
        } else {
            System.out.println("Invalid Role, cannot create row");
        }
    }

    @Override
    public void delete(Role role, String id) throws Exception {
        if(ADMIN.equals(role)){
            employeeDAO.delete(role, id);
        } else {
            System.out.println("Invalid Role, cannot delete row: "+ id);
        }
    }

    @Override
    public void update(Role role, String id) throws Exception {
        if(ADMIN.equals(role)){
            employeeDAO.update(role, id);
        } else {
            System.out.println("Invalid Role, cannot update row: "+ id);
        }
    }
}
