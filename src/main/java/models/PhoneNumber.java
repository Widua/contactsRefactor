package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {
    private String number ;

    public boolean isValid(){
        Pattern pattern = Pattern.compile("^\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$") ;
        Matcher matcher = pattern.matcher(number) ;
        return matcher.matches() ;
    }

}
