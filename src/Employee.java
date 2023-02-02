public class Employee {

    private String fullName;
    // Объявили свойство name (Название книги)
    private int department;

    private int salary;

    private static int Counter;
    private int Id;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        Id = ++Counter;
    }


    //Get
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
        return this.Id;
    }

    //Set
    public String setFullName() {
        return this.fullName;
    }

    public int setDepartment() {
        return this.department;
    }

    public int setSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public int setId() {
        return this.Id;
    }

    public String toString() {
        String info = "";
        info += "\nId: " + Id;
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

    // Посчитать сумму затрат на зарплаты в месяц.
    public static int totalSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) ;
        {
            if (employees != null) {
                sum += employees.getSalar();
            }
        }
        return sum;
    }
}


// public static void totalSalary(Employee[] employees) {
//   float totalSalary =



