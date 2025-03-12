package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    String name ;
     long number;
    public Contact(String name ,long number)
    {
        this.name = name;
        this.number = number;
    }
    @Override
    public String toString()
    {
        return "Name :"+name+" "+"Number :"+number;
    }

    public static void main(String[] args) {
        ArrayList<Contact>list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Add contact list");
            System.out.println("2.Delete contact list");
            System.out.println("3.View all contact list");
            System.out.println("4.Search contact list");
            System.out.println("5.Exit");

            System.out.println("Enter your choice ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    addcontact(scanner,list);
                    break;
                case 2:
                    deletecontact(scanner,list);
                    break;
                case 3:
                    viewcontact(list);
                    break;
                case 4:
                    searchcontact(list,scanner);
                    break;
                case 5:
                    System.out.println("Exiting....");
                    return;
            }
        }
    }
    public static void addcontact(Scanner scanner , ArrayList<Contact>list)
    {
        System.out.println("Enter the name of the contact");
        String name = scanner.next();
        System.out.println("Enter the number ");
        long number = scanner.nextLong();
        Contact  contact = new Contact(name,number);
        list.add(contact);
        System.out.println("Successfully added ");
    }
    public static void viewcontact(ArrayList<Contact>list)
    {
        if(list.isEmpty())
        {
            System.out.println("Your contact list is empty");
        }else {
            System.out.println("Contact lists are : ");
            for(Contact c : list)
            System.out.println(c);
        }
    }
    public static void deletecontact(Scanner scanner,ArrayList<Contact>list)
    {
        System.out.println("Enter your number :");
        long num = scanner.nextInt();
        boolean f=false;
        for(Contact c : list)
        {
            if(!list.isEmpty() &&c.number==num)
            {
                list.remove(c);
                System.out.println("Successfully removed");
                f=true;
                break;
            }

        }if(!f)
    {
        System.out.println("No contact is found");
    }
    }
    public static void searchcontact(ArrayList<Contact>list,Scanner scanner)
    {
        System.out.println("Enter the name :");
        String search_name = scanner.next();
        for(Contact contact : list)
        {
            if(contact.name.equals(search_name))
            {
                System.out.println("Searched contact details :");
                System.out.println(contact);
            }else {
                System.out.println("No contact is found ");
            }
        }
    }

}
