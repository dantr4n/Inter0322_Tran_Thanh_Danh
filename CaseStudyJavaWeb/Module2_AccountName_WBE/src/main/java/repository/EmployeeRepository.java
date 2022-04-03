package repository;

import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository = new BaseRepository();
    Connection connection = this.baseRepository.getConnection();


    public List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from employee");
            Employee employee;
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int employeeID = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                boolean gender = resultSet.getBoolean("")
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public void createEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void updateEmployee(Employee employee, Employee employeeNew){
//        for(Employee employeeItem : employeeList){
//            if (employeeItem.equals(employee)){
//                int id = employeeNew.getId();
//                employeeItem.setId(id);
//
//                String name = employeeNew.getName();
//                employeeItem.setName(name);
//            }
//        }
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
}
