package repository;

import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
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
                boolean gender = resultSet.getBoolean("employee_gender");
                String idCard = resultSet.getString("employee_id_card");
                String phoneNumber = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int educationDegree = resultSet.getInt("education_degree_id");
                int division = resultSet.getInt("division_id");
                int position = resultSet.getInt("position_id");
                double salary = resultSet.getDouble("employee_salary");
                String username = resultSet.getString("username");

                employee = new Employee(employeeID, name, birthday, gender, idCard, phoneNumber, email, address, educationDegree, division, position, salary, username);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public void createEmployee(Employee employee){
        try {
            String sql = "INSERT into employee values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setDate(3, Date.valueOf(employee.getBirthday()));
            preparedStatement.setBoolean(4, employee.getGender());
            preparedStatement.setString(5, employee.getIdCard());
            preparedStatement.setDouble(6, employee.getSalary());
            preparedStatement.setString(7, employee.getPhoneNumber());
            preparedStatement.setString(8, employee.getEmail());
            preparedStatement.setString(9, employee.getAddress());
            preparedStatement.setInt(10, employee.getPosition());
            preparedStatement.setInt(11, employee.getEducationDegree());
            preparedStatement.setInt(12, employee.getDivision());
            preparedStatement.setString(13, employee.getUsername());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee employee, Employee employeeNew){
//
    }

    public void removeEmployee(Employee employee){
        String sql = "Delete from employee where employee_id = (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, employee.getId());
            int result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
