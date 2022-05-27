package commands;

import lombok.Setter;

@Setter
public class CommandManager {
    private Command command ;

    public void executeCommand(){
        command.execute();
    }

}
