package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyContact extends Contact {
    private String address ;


    @Override
    public String toString() {
        return
                "Organization name: "+getName() +"\n"
                + "Address: "+getAddress() +"\n"
                + "Created: "+getCreated() + "\n"
                + "LastModified: "+ getModified() ;
    }
}
