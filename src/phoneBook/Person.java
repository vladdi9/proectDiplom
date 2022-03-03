package phoneBook;
import javax.swing.*;
import java.util.Scanner;
import java.util.Vector;

public class Person {
    public static Scanner in = new Scanner(System.in);
    private String name;
    private String phone;
    private String email;
    private static Vector<Person> contactList = new Vector<Person>();


    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        addPerson(this);

    }

    public Person() {

    }

    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }

    public static void addPerson(Person person) {
        contactList.add(person);
    }

    public static void removePerson(Person person) {
        contactList.remove(person);
    }

    public static void showAll() {
        System.out.println("Список контактов: ");
        for (Person person : contactList) {
            System.out.println(person);
        }
    }

    public String toString() {
        return "\n\nName: " + this.getName() + "\nPhone number: " + this.getPhone() + "\nEmail: " + this.getEmail();
    }

    // Поиск контакта
    public static void findPerson(String searchType, String searchString) {

        //for (Person person: contactList) {
        switch (searchType) {

            case "1":
                for (Person persons : contactList) {
                    if (persons.name.equals(searchString)) {
                        System.out.println(persons.name + ' ' + persons.phone + ' '+ persons.email);
                    }
                }
                // По имени
                break;
            case "2":
                for (Person persons : contactList) {
                    if (persons.phone.equals(searchString)) {
                        System.out.println(persons.name + ' ' + persons.phone + ' '+ persons.email);
                    }
                }
                // По номеру телефона
                break;
            case "3":
                for (Person persons : contactList) {
                    if (persons.email.equals(searchString)) {
                        System.out.println(persons.name + ' ' + persons.phone + ' '+ persons.email);
                    }
                }
                // по EMAIL
                break;
            }
        //}
    }
}