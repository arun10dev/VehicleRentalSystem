
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Brand:");
        String brand=sc.nextLine();
        double rent;
        if (brand.equalsIgnoreCase("Swift")) {
            rent = 2500;
        }
        else if (brand.equalsIgnoreCase("Hyundai Creta")) {
            rent = 3500;
        }
        else if (brand.equalsIgnoreCase("Toyota Innova")) {
            rent = 5000;
        }
        else if (brand.equalsIgnoreCase("Fortuner")) {
            rent = 7000;
        }
        else if (brand.equalsIgnoreCase("BMW")) {
            rent = 8500;
        }
        else if (brand.equalsIgnoreCase("Mercedes-Benz")) {
            rent = 10000;
        }
        else if (brand.equalsIgnoreCase("Audi")) {
            rent = 9000;
        }
        else {
            rent = 0;
            System.out.println("Car not available!");
        }
  if(rent>0) {
      Car c = new Car(brand, rent);

      c.displayDetails();
  }
    }
}
