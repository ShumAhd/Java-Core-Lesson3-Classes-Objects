# Java Core (семинары)
## Урок 3. Классы и объекты

Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты (сделать статическим) в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

2.(*) Сделать компараторы для Сотрудников на основе ЗП и Возраста

[Код программы](https://github.com/ShumAhd/Java-Core-Lesson3-Classes-Objects/tree/main/src/main/java/ru/shum) 
**Результат:**
```
Before salary increase:
Employee [name=John Doe, salary=3000.0]
Employee [name=Jane Smith, salary=5000.0]
Employee [name=Mark Johnson, salary=4000.0]

After salary increase:
Employee [name=John Doe, salary=4000.0]
Employee [name=Jane Smith, salary=5000.0]
Employee [name=Mark Johnson, salary=5000.0]

After sorting by salary:
Employee [name=John Doe, salary=4000.0]
Employee [name=Mark Johnson, salary=5000.0]
Employee [name=Jane Smith, salary=5000.0]

After sorting by age:
Employee [name=Mark Johnson, salary=5000.0]
Employee [name=John Doe, salary=4000.0]
Employee [name=Jane Smith, salary=5000.0]
```
