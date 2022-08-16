import java.util.Arrays;

public class Main {
    private static final Employee[] emmployees = new Employee[10];

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов", "Петр", "Иванович", 1, 25648);
        Employee employee2 = new Employee("Петров", "Василий", "Шестевич", 2, 53263);
        Employee employee3 = new Employee("Вишняков", "Иван", "Кураженкив", 3, 64367);
        Employee employee4 = new Employee("Прокопюк", "Константин", "Игоревич", 4, 65856);
        Employee employee5 = new Employee("Аратюнян", "Павел", "Сергеевич", 5, 23456);
        Employee employee6 = new Employee("Вандалов", "Михаил", "Васильевич", 6, 74574);
        Employee employee7 = new Employee("Шевченко", "Алексей", "Анатольевич", 7, 53242);
        Employee employee8 = new Employee("Юсупов", "Ильнур", "Вахитович", 8, 85475);
        Employee employee9 = new Employee("Кравченко", "Никита", "Верхович", 9, 53251);
        Employee employee10 = new Employee("Измайлова", "Наталья", "Семянович", 10, 64362);

        emmployees[0] = employee1;
        emmployees[1] = employee2;
        emmployees[2] = employee3;
        emmployees[3] = employee4;
        emmployees[4] = employee5;
        emmployees[5] = employee6;
        emmployees[6] = employee7;
        emmployees[7] = employee8;
        emmployees[8] = employee9;
        emmployees[9] = employee10;
        allEmployees();
        System.out.println("Сумма затрат на всех сотрудников в месяц = " + allCosts() + " рублей");
        System.out.println("Сотрудник с минимальной зарплатой за месяц- " + minimumWage());
        System.out.println("Сотрудник с максимальной зарплатой за месяц- " + maximummumWage());
        System.out.println("Средняя зарплата за месяц - " + averageSalary());
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
        float month = 30;
        for (Employee employee : emmployees) {
            sum += employee.getSalary() / month;
        }
        return sum;
    }

    public static void lastNameFirstNamePatronymicOfAllEmployees() {
        for (int i = 0; i <emmployees.length ; i++){
        String name = emmployees[i].getName();
        String surname = emmployees[i].getSurname();
        String patronymic = emmployees[i].getPatronymic();


            System.out.println(surname+" "+name+" "+patronymic);
        }

        }





}