import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        System.out.println("Enter number of floors:");
        house.setFloorsNumber(scanner.nextInt());

        scanner.nextLine(); // Needed for the nextInt() to not 'eat' the next nextLine() call due to the innate "\n".

        System.out.println("Enter address:");
        house.setAddress(scanner.nextLine()); // An address will for sure contain spaces.

        System.out.println("Enter resident names (comma separated):");
        house.setResidentsNames(scanner.nextLine());

        String houseDetails = String.format("House Details:\nFloors: %d\nAddress: %s\nResidents: %s",
                house.getFloorsNumber(),
                house.getAddress(),
                house.getResidentsNames()
        );

        System.out.println(houseDetails);
    }
}
