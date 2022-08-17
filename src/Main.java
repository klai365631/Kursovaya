import java.util.Arrays;

public class Main {
    private static final Employee[] emmployees = new Employee[10];

    public static void main(String[] args) {
        emmployees[0] = new Employee("Иванов", "Петр", "Иванович", 1, 25648);
        emmployees[1] = new Employee("Петров", "Василий", "Шестевич", 2, 53263);
        emmployees[2] = new Employee("Вишняков", "Иван", "Кураженкив", 3, 64367);
        emmployees[3] = new Employee("Прокопюк", "Константин", "Игоревич", 4, 65856);
        emmployees[4] = new Employee("Аратюнян", "Павел", "Сергеевич", 5, 23456);
        emmployees[5] = new Employee("Вандалов", "Михаил", "Васильевич", 6, 74574);
        emmployees[6] = new Employee("Шевченко", "Алексей", "Анатольевич", 7, 53242);
        emmployees[7] = new Employee("Юсупов", "Ильнур", "Вахитович", 8, 85475);
        emmployees[8] = new Employee("Кравченко", "Никита", "Верхович", 9, 53251);
        emmployees[9] = new Employee("Измайлова", "Наталья", "Семянович", 10, 64362);


        allEmployees();
        System.out.println("Сумма затрат на всех сотрудников в месяц = " + allCosts() + " рублей");
        System.out.println("Сотрудник с минимальной зарплатой за месяц- " + minimumWage());
        System.out.println("Сотрудник с максимальной зарплатой за месяц- " + maximummumWage());
        System.out.println("Средняя зарплата сотрудника - " + averageSalary());
        lastNameFirstNamePatronymicOfAllEmployees();


    }

    public static void allEmployees() {
        for (Employee employee : emmployees) {
            System.out.println(employee);
        }
    }

    public static int allCosts() {
        int sum = 0;
        for (Employee employee : emmployees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minimumWage() {
        Employee result = emmployees[0];
        int minSalary = emmployees[0].getSalary();
        for (Employee employee : emmployees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }

    public static Employee maximummumWage() {
        Employee result = emmployees[0];
        int minSalary = emmployees[0].getSalary();
        for (Employee employee : emmployees) {
            if (employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }

    public static float averageSalary() {
        float sum = 0f;
        for (Employee employee : emmployees) {
            sum = sum + employee.getSalary();
        }
        sum = sum / emmployees.length;
        return sum;
    }

    public static void lastNameFirstNamePatronymicOfAllEmployees() {
        for (int i = 0; i < emmployees.length; i++) {
            String name = emmployees[i].getName();
            String surname = emmployees[i].getSurname();
            String patronymic = emmployees[i].getPatronymic();


            System.out.println(surname + " " + name + " " + patronymic);
        }

    }


}