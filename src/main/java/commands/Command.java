package commands;

import phonebook.PhoneBook;

public interface Command {

    PhoneBook phonebook = PhoneBook.getInstance() ;

    void execute() ;
}
