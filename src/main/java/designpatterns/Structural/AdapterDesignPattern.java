package designpatterns.Structural;

import java.util.ArrayList;
import java.util.List;

public class AdapterDesignPattern {
    public static void main(String[] args) {

        EmployeeClient employeeClient= new EmployeeClient();
        List<Employee> employeeList= employeeClient.getEmployeeList();
        System.out.println(employeeList);
    }
}

interface Employee {
    String getId();
    String getFirstName();
    String getLastName();
    String getEmail();
}

class EmployeeNew implements Employee {

    private String id;
    private String f_name;
    private String l_name;
    private String mail;

    EmployeeNew(String id, String f_name, String l_name, String mail) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return f_name;
    }

    public String getLastName() {
        return l_name;
    }

    public String getEmail() {
        return mail;
    }
}

class EmployeeOld{

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeOld(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}

class EmployeeAdapter implements Employee{

    private EmployeeOld employeeOld;

    EmployeeAdapter(EmployeeOld employeeOld){
        this.employeeOld=employeeOld;
    }
    public String getId() {
        return employeeOld.getCn();
    }

    public String getFirstName() {
        return employeeOld.getGivenName();
    }

    public String getLastName() {
        return employeeOld.getSurname();
    }

    public String getEmail() {
        return employeeOld.getSurname();
    }
}

class EmployeeClient{

    public List<Employee> getEmployeeList(){

        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employeeNew= new EmployeeNew("1234","Artika","Shukla","test@gmail.com");
        employeeList.add(employeeNew);

        EmployeeOld employeeOld= new EmployeeOld("1235","You","Hey","test1@gmail.com");
        employeeList.add(new EmployeeAdapter(employeeOld));

        return employeeList;
    }
}
