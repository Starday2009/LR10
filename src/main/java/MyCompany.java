import java.util.ArrayList;

public class MyCompany {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private int age;

    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addEmployee(String employeeName, int age, String projectName) {
        employeeList.add(new Employee(employeeName, age, projectName));
    }

    public void deleteEmployeeByName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.remove(i);
            }
        }
    }

    public void getEmployeeSkills (String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).getSkills();
            }
        }
    }

    public  void addSkill (String employeeName, String skill){

        for (int i = 0; i<employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).addSkill(skill);
            }
        }
    }

    public  void deleteSkill (String employeeName, String skill){

        for (int i = 0; i<employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).removeSkill(skill);
            }
        }
    }

    public void deleteEmployeeOlder(int desiredAge) {//todo
        for (int i = 0; i < employeeList.size(); i++) {
            age = employeeList.get(i).getAge();
            if (age>desiredAge) {
                employeeList.remove(i);
            }
        }
    }

    public Employee getEmployeeByName(String employeeName) {
        Employee employeeToReturn = null;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeToReturn = employeeList.get(i);
            } else {
                employeeToReturn = new Employee("Not found", 0, "Not found");
            }
        }
        return employeeToReturn;
    }

    public void editEmployeeProjectName(String employeeName, String projectName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName(projectName);
            }
        }
    }

    public void updateEmployeeName (String employeeName, String newEmoloyeeName){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).setName(newEmoloyeeName);
            }
        }

    }
    public void setProjectName (String employeeName, String projectName){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).setProjectName(projectName);
            }
        }
    }
    public void clearProjectName (String employeeName){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getName().equals(employeeName)){
                employeeList.get(i).setProjectName(" ");
            }
        }

    }

}
