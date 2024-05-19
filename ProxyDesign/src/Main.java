public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeDao proxy = new EmployeeDaoProxy(new EmployeeDaoImpl());
        proxy.create("ADMIN", new EmployeeDo());

        proxy.getEmployee("ADMIN", 2);
//        proxy.delete("ROCKY", 2);
        proxy.delete("ADMIN", 2);

    }
}