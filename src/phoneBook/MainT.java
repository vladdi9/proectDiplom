package phoneBook;
import javax.swing.*;
import java.util.Scanner;
public class MainT extends JFrame {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Person person1 = new Person("Влад", "123123", "Vlad@com");
        Person person2 = new Person("Аня", "34634", "An@com");
        Person person3 = new Person("Паша", "33345", "Pa@com");
        Person person4 = new Person("Леша", "43211", "Alex@com");
        Person person5 = new Person("Таня", "235346", "Tan@com");
        Person person6 = new Person("Катя", "665544", "Kate@com");

        //Person.showAll();
        //Person.showMainMenu();
            System.out.print("Нажмите 1 что бы искать по имени, Нажмите 2 что бы искать по номеру, Нажмите 3 что бы искать по email: ");
            String searchType = in.nextLine();

            System.out.print("Введите данные: ");
            String searchString = in.nextLine();


            //Person.findPerson("1","Влад");

            Person.findPerson(searchType, searchString);
        }
    }

