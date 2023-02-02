import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        // проверка сохранения записей и работы методов
        // создание книги записей

        Employee[] employees = new Employee[10];
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

        System.out.println("Список всех сотрудников:");
        Employee.listOfEmployees(employees);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц составило:");
        Employee.totalSalary(employees);
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: ");
        Employee.maxSalary(employees);
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: ");
        Employee.minSalary(employees);
        System.out.println();
        System.out.println("Среднее значение зарплат составило:");
        Employee.averageValueOfSalaries(employees);
        System.out.println();
        System.out.println("Ф.И.О. всех сотрудников: ");
        Employee.showFullNames(employees);
        System.out.println();
        System.out.println("Проиндексировали зарплату на _%:");
        System.out.println(employees[1]);
        Employee.indexSalaries(employees,10);
        System.out.println(employees[1]);
        System.out.println();
        Employee.findMinSalaryInDepartment(employees,3);
        System.out.println();


    }
}









