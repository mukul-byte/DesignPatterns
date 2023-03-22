package proxy;

import static proxy.Role.ADMIN;
import static proxy.Role.EMPLOYEE;

public class ProxyApplication {
    public static void main(String[] args) throws Exception {
        EmployeeDAO employeeDAO = new EmployeeDAOImplProxy();
        employeeDAO.create(ADMIN);
        employeeDAO.create(EMPLOYEE);
    }
}
