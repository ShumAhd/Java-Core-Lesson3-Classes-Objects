package ru.shum;

import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс программы.
 */
public class Main {

  public static void main(String[] args) {
// Создание списка сотрудников
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("John Doe", 3000));
    employees.add(new Manager("Jane Smith", 5000));
    employees.add(new Employee("Mark Johnson", 4000));

    System.out.println("Before salary increase:");
    for (Employee employee : employees
    ) {
      System.out.println(employee);
    }
  }
}