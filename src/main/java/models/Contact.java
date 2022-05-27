package models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Contact {

    private long id;
    private String name ;
    private PhoneNumber phoneNumber ;
    private LocalDateTime created ;
    private LocalDateTime modified ;

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true ;
        }
        if (!(obj instanceof Contact contact)){
            return false ;
        }
        return this.id == contact.id ;
    }
}
