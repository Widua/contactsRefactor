package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonContact extends Contact{
    private String surname ;
    private Date birthDate ;
    private Gender gender ;

    @Override
    public String toString(){
        return "Name: "+ getName() + "\n"
                + "Surname: "+getSurname()+"\n"
                + "Birth date: "+getBirthDate()+"\n"
                + "Gender: "+getGender().getName()+"\n"
                + "Number: "+ getPhoneNumber()+"\n"
                +"Time created: "+ getCreated()+"\n"
                +"Time last edit: "+ getModified();
    }


}
