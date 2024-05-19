public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDaoImpl;
    EmployeeDaoProxy(EmployeeDaoImpl employeeDaoImpl) {
        this.employeeDaoImpl = employeeDaoImpl;
    }
    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoImpl.create(client, employeeDo);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeDoId) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoImpl.delete(client, employeeDoId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo getEmployee(String client, int employeeDoId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            return employeeDaoImpl.getEmployee(client, employeeDoId);

        }
        throw new Exception("Access Denied");
    }
}
