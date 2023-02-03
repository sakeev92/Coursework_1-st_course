import java.util.Arrays;

public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        // проверка сохранения записей и работы методов
        // создание книги записей


        employees[0] = new Employee("Кононова Мария Андреевна", 1, 100000);
        employees[1] = new Employee("Александрова Виктория Андреевна", 2, 95000);
        employees[2] = new Employee("Рыбаков Кирилл Давидович", 2, 90000);
        employees[3] = new Employee("Севастьянова Ника Данииловна", 3, 80000);
        employees[4] = new Employee("Кравцов Василий Русланович", 3, 75000);
        employees[5] = new Employee("Большакова Варвара Владиславовна", 3, 72000);
        employees[6] = new Employee("Антонов Максим Артёмович", 4, 70000);
        employees[7] = new Employee("Беляев Вячеслав Родионович", 4, 60000);
        employees[8] = new Employee("Федоров Тимур Даниилович", 4, 50000);
        employees[9] = new Employee("Ермолова Вера Михайловна", 5, 30000);

        System.out.println("Отобразим список всех сотрудников с данными");
        Employee.listOfEmployees(employees);
        System.out.println();
        System.out.println("Отобразим сумму затрат на зарплаты в месяц");
        Employee.totalSalary(employees);
        System.out.println();
        System.out.println("Отоброзим сотрудника с максимальной зарплатой");
        Employee.maxSalary(employees);
        System.out.println();
        System.out.println("Отоброзим сотрудника с минимальной зарплатой");
        Employee.minSalary(employees);
        System.out.println();
        System.out.println("Отоброзим среднее значение зарплат");
        Employee.averageValueOfSalaries(employees);
        System.out.println();
        System.out.println("Отоброзим Ф.И.О. всех сотрудников");
        Employee.showFullNames(employees);
        System.out.println();
        System.out.println("Отоброзим индексацию зарплаты на _%");
        System.out.println(employees[1]);
        Employee.indexSalaries(employees, 10);
        System.out.println(employees[1]);
        System.out.println();
        System.out.println("Отоброзим сотрудника с минимальной зарплатой в отделе №");
        Employee.findMinSalaryInDepartment(employees, 3);
        System.out.println();
        System.out.println("Отоброзим сотрудника с максимальной зарплатой в отделе №");
        Employee.findMaxSalaryInDepartment(employees, 3);
        System.out.println();
        System.out.println("Отоброзим среднюю зарплату по отделу №");
        Employee.getAverageSalaryInDepartment(employees, 3);
        System.out.println("Отоброзим всех сотрудников отдела (все данные, кроме отдела).");
        Employee.showIdFullNamesSalary(employees, 3);
        System.out.println("Отоброзим всех сотрудников с зарплатой меньше указанного параметра");
        Employee.findSalaryLessThen(employees, 60000);
        System.out.println("Отоброзим всех сотрудников с зарплатой больше или равно указанного параметра");
        Employee.findSalaryMoreThen(employees, 96000);

    }
}









