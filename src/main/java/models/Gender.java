package models;

public enum Gender {
    MALE,FEMALE,NON_BINARY,ITS_COMPLICATED,NOT_PROVIDED
    ;

    String getName(){
        return this.name().toLowerCase().replace("_"," ");
    }
}
