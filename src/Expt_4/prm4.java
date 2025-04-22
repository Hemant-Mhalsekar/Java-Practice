package Expt_4;
import java.util.*;

public class prm4
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int choice;

        try
        {
            System.out.print("Enter number of elements to add in the array: ");
            int n = sc.nextInt();
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++)
            {
                array.add(sc.nextInt());
            }

            do
            {
                System.out.println("\nArray: " + array);
                System.out.println("Choose an operation:");
                System.out.println("1. Add an element");
                System.out.println("2. Delete an element by index");
                System.out.println("3. Update an element by index");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                try
                {
                    switch (choice)
                    {
                        case 1:
                            System.out.print("Enter element to add: ");
                            int n1= sc.nextInt();
                            array.add(n1);
                            break;

                        case 2:
                            System.out.print("Enter index to delete: ");
                            int d= sc.nextInt();
                            try {
                                array.remove(d);
                            } catch (IndexOutOfBoundsException e)
                            {
                                System.out.println("Error: Index out of bounds!");
                            }
                            break;

                        case 3:
                            System.out.print("Enter index to update: ");
                            int u = sc.nextInt();
                            System.out.print("Enter new value: ");
                            int ne = sc.nextInt();
                            try {
                                array.set(u, ne);
                            } catch (IndexOutOfBoundsException e)
                            {
                                System.out.println("Error: Index out of bounds!");
                            }
                            break;

                        case 4:
                            System.out.println("Exiting program.");
                            break;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Error: Please enter valid input.");
                    sc.next();
                }

            }
            while (choice != 4);

        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: Invalid input type.");
        }
        finally
        {
            System.out.println("\nFinal Array Content: " + array);
            sc.close();
            System.out.println("Program End.");
        }
    }
}