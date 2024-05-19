public interface EmployeeDao {
    public void create(String client, EmployeeDo employeeDo) throws Exception;
    public void delete(String client, int employeeDoId) throws Exception;
    public EmployeeDo getEmployee(String client, int employeeDoId) throws Exception;
}
