package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 12/17/17 12:37 AM
 */

class Employee {
  // It's the unique id of each node;
  // unique id of this employee
  public int id;
  // the importance value of this employee
  public int importance;
  // the id of direct subordinates
  public List<Integer> subordinates;
}

class EmployeeImportance {

  public int getImportance(List<Employee> employees, int id) {

    int totalImportance = 0;
    Map<Integer, Employee> idEmployeeMap = new HashMap<>();
    for (Employee employee : employees) {
      idEmployeeMap.put(employee.id, employee);
    }

    Employee primeEmployee = idEmployeeMap.get(id);
    Queue<Employee> employeeTree = new LinkedList<>();
    employeeTree.add(primeEmployee);
    while (!employeeTree.isEmpty()) {

      int levelSize = employeeTree.size();

      for (int i = 0; i < levelSize; i++) {

        Employee candidate = employeeTree.remove();
        totalImportance += candidate.importance;
        if (candidate.subordinates.size() > 0) {
          for (Integer childTreeNode : candidate.subordinates) {
            Employee childEmployee = idEmployeeMap.get(childTreeNode);
            employeeTree.add(childEmployee);
          }
        }
      }
    }

    return totalImportance;
  }

}
