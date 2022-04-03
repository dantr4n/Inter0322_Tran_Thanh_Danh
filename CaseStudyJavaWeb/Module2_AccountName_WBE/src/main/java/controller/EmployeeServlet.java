package controller;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {

    // Dependency Injection
    private EmployeeService employeeService = new EmployeeServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action == null){
//            action = "";
//        }
//        switch (action){
//            case "show":
//                request.getRequestDispatcher("/employee/employee.jsp").forward(request, response);
//            default:
//                getEmployeeList(request, response);
//        }

        getEmployeeList(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createEmployee(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            default:
                getEmployeeList(request, response);
        }

    }

    public void getEmployeeList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Employee> employeeList = employeeService.getEmployeeList();

        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("/employee/employee.jsp").forward(request, response);
    }

    public void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int educationDegree = Integer.parseInt(request.getParameter("educationDegree"));
        int division = Integer.parseInt(request.getParameter("division"));
        int position = Integer.parseInt(request.getParameter("position"));
        double salary = Double.parseDouble(request.getParameter("salary"));
        String username = request.getParameter("username");

        Employee employee = new Employee(id, name, birthday, gender, idCard, phoneNumber, email, address, educationDegree, division, position, salary, username);
        employeeService.createEmployee(employee);
        response.sendRedirect("/employee");
    }

    public void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = new Employee(id);
        employeeService.removeEmployee(employee);
        response.sendRedirect("/employee");
    }

}
