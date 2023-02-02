public class Employee {

    private String fullName;
    // Объявили свойство name (Название книги)
    private int department;

    private int salary;

    private static int Counter;
    private int id;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++Counter;
    }

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

    public int setSalary(int i) {
        return this.salary;
    }

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

    public static void showFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


    public static int totalSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
        return sum;
    }

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


    public static void indexSalaries(Employee[] employees, int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
            }
        }
    }

    public static void findMinSalaryInDepartment(Employee[] employees, int department) {

        Employee employee = new Employee("", 0, Integer.MAX_VALUE);
        int count = 0;
        //в  цикле сравниваем записи сотрудником в нужном отделе
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
}



