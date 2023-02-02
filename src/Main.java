public class Main {
    public static void main(String[] args) {

        // проверка сохранения записей и работы методов
        // создание книги записей

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Кононова Мария Андреевна", 1, 100000);
        employees[1] = new Employee("Александрова Виктория Андреевна", 2, 95000);
        employees[2] = new Employee("Рыбаков Кирилл Давидович", 2, 90000);
        employees[3] = new Employee("Севастьянова Ника Данииловна", 3, 80000);
        employees[4] = new Employee("Кравцов Василий Русланович", 3, 79000);
        employees[5] = new Employee("Большакова Варвара Владиславовна", 3, 78000);
        employees[6] = new Employee("Антонов Максим Артёмович", 4, 70000);
        employees[7] = new Employee("Беляев Вячеслав Родионович", 4, 60000);
        employees[8] = new Employee("Федоров Тимур Даниилович", 4, 50000);
        employees[9] = new Employee("Ермолова Вера Михайловна", 5, 30000);
        System.out.println("Список всех сотрудников");

        //Список всех сотрудников со всеми имеющимися по ним данными:
        Employee.listOfEmployees(employees);
        //Сумма затрат на зарплаты в месяц.
        Employee.totalSalaries(employees);
    }


    }


