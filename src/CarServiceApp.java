import java.util.Scanner;

public class CarServiceApp {
    public static void main(String[] args) {
        System.out.println("---------- Car Service App -----------");
        System.out.println("1 - add employee");
        Scanner scanner =  new Scanner(System.in, "UTF-8");
        int option = scanner.nextInt();
        scanner.nextLine(); // \n

        switch(option){
            case 1:
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                Employee employee = new Employee(name, age);

                break;

        }


    }
}
