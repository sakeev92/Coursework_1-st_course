public class Employee {

    private String fullName; // поле для хранения ФИО

    private int department; // поле для хранения номера отдела

    private int salary; //поле для хранения зарплаты

    private static int Counter; // переменная-счётчик для поля id
    private int id; //поле для хранения id


    public Employee(String fullName, int department, int salary) { // объявляем конструктор класса
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++Counter; // присваиваем полю "id" значение переменной idCount, затем увеличиваем счётчик на 1
    }

    // четыре геттера для полей
    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    // четыри сеттера для полей
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    // переопределение стандартного метода toString
    public String toString() {
        String info = "";
        info += "\nId: " + id;
        info += "\n ФИО: " + fullName;
        info += "\n Департамент: " + department;
        info += "\n Зарплата: " + salary;
        return info;
    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void listOfEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // метод, выводящий ФИО всех сотрудников
    public static void showFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    // метод, выводящий id,ФИО,зарплата
    public static void showIdFullNamesSalary(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("\nid: " + employee.getId() +
                        "\nФИО: " + employee.getFullName()
                        + "\nЗарплата: " + employee.getSalary());
            }
        }
    }

    // метод, возвращающий сумму затрат на зарплаты в месяц
    public static int totalSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
        return sum;
    }

    // метод, выводящий сотрудника с максимальной зарплатой
    public static int maxSalary(Employee[] employees) {
        int maxSalary = (int) Double.MIN_VALUE;
        String empName = "";
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                empName = employee.getFullName();
            }
        }
        System.out.println(empName + "Зарплата - " + maxSalary);
        return maxSalary;
    }

    // метод, выводящий сотрудника с минимальной зарплатой
    public static int minSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        String empName = "";
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                empName = employee.getFullName();
            }
        }
        System.out.println(empName + "Зарплата - " + minSalary);
        return minSalary;
    }

    // метод, возвращающий среднее значение зарплат
    public static double averageValueOfSalaries(Employee[] employees) {
        int sum = 0;
        int aaverage = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            aaverage = sum / employee.getId();

        }
        System.out.println(aaverage);
        return aaverage;
    }

    // метод, индексирующий зарплату всем сотрудникам на определенный процент
    public static void indexSalaries(Employee[] employees, int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
            }
        }
    }

    // метод, выводящий сотрудника с минимальной зарплатой в определенноом отделе
    public static void findMinSalaryInDepartment(Employee[] employees, int department) {

        Employee employee = new Employee("", 0, Integer.MAX_VALUE);
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department && emp.getSalary() <= employee.getSalary()) {
                employee = emp;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Сотрудник с минимальной зарплатой в отделе №" + department + " - " +
                    employee.getFullName() + " " + "Зарплата: " + employee.getSalary());
        } else System.out.println("В данном отделе сотрудников нет");
    }

    // метод, выводящий сотрудника с максимальной зарплатой в определенноом отделе
    public static void findMaxSalaryInDepartment(Employee[] employees, int department) {

        Employee employee = new Employee("", 0, Integer.MIN_VALUE);
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department && emp.getSalary() >= employee.getSalary()) {
                employee = emp;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Сотрудник с максимальной зарплатой в отделе №" + department + " - " +
                    employee.getFullName() + " " + "Зарплата: " + employee.getSalary());
        } else System.out.println("В данном отделе сотрудников нет");
    }

    // метод, возвращающий среднее значение зарплат по определенному отделу
    public static void getAverageSalaryInDepartment(Employee[] employees, int department) {
        int sum = 0;
        int count = 0;
        int average = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
                count++;
                average = sum / count;

            }
        }
        System.out.println(average);
    }

    // метод, выводящий всех сотрудников с зарплатой меньше указанного параметра
    public static void findSalaryLessThen(Employee[] employees ,int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("\n id: " + employee.getId()
                        + "\nФИО: " + employee.getFullName()
                        + "\nЗарплата " + employee.getSalary());
            }
        }
    }
    // метод, выводящий всех сотрудников с зарплатой больше (или равно) указанного параметра
    public static void findSalaryMoreThen(Employee[] employees ,int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("\nid: " + employee.getId()
                        + "\nФИО: " + employee.getFullName()
                        + "\nЗарплата " + employee.getSalary());
            }
        }
    }
}

