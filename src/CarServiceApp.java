import java.util.Scanner;

public class CarServiceApp {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in, "UTF-8");
        CarService carService = new CarService();

        int option;

        do {
            System.out.println("---------- Car Service App -----------");
            System.out.println("1 - add employee");
            System.out.println("2 - display employee");
            System.out.println("3 - add task");
            System.out.println("100 - stop");

            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();

                    Employee employee = new Employee(name, age);
                    carService.addEmployee(employee);

                    break;
                case 2:
                    carService.displayEmployees();
                    break;
            }
        }while(option != 100);
        scanner.close();
    }
}
