package commands;


import models.Contact;
import models.PhoneNumber;

import java.util.Scanner;

public class AddCommand implements Command{
    private final String addCommandPrefix = "[ADD] " ;
    private final Scanner scan = new Scanner(System.in) ;

    @Override
    public void execute() {

    }

    private Contact simpleContactElements(){
        System.out.println(addCommandPrefix+"Provide contact name: ");
        String name = scan.next();
        System.out.println(addCommandPrefix+"Provide contact phone number: ");
        PhoneNumber number = new PhoneNumber( scan.next() ) ;
        if (!number.isValid()){
            System.err.println("YOU PROVIDED WRONG PHONE NUMBER!");

        }
        return null ;
    }

    private void addCompany(){

    }

    private void addPerson(){

    }

}
