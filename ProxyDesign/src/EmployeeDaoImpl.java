public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo employeeDo) {
        System.out.println("employee created");
    }

    @Override
    public void delete(String client, int employeeDoId) {
        System.out.println("employee deleted");
    }

    @Override
    public EmployeeDo getEmployee(String client, int employeeDoId) {
        System.out.println("returned employee");
        return new EmployeeDo();
    }
}
