package ru.shum;

/**
 * Класс, представляющий руководителя.
 */
public class Manager extends Employee {

  /**
   * Конструктор руководителя.
   *
   * @param name   Имя руководителя
   * @param salary Зарплата руководителя
   */
  public Manager(String name, double salary) {
    super(name, salary);
  }
  /**
   * Статический метод для повышения зарплаты сотрудников, кроме руководителей.
   *
   * @param employees Массив сотрудников
   * @param amount    Сумма повышения
   */
  public static void increaseSalary(Employee[] employees, double amount) {
    for (Employee employee : employees
    ) {
      if (!(employee instanceof Manager)) {
        employee.increaseSalary(amount);
      }
    }
  }

}
