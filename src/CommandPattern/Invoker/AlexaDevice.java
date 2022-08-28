package CommandPattern.Invoker;

import CommandPattern.Commands.Command;
import CommandPattern.Commands.NoOpCommand;

public class AlexaDevice {

    Command[] onCommands;
    Command[] offCommands;

    int slots=3;
    public AlexaDevice(){
        offCommands=new Command[slots];
        onCommands= new Command[slots];
        for(int i=0;i<slots;i++){
            onCommands[i]=new NoOpCommand();
            offCommands[i]=new NoOpCommand();
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        if(onCommand==null || offCommand==null){
            throw new IllegalArgumentException("Command cannot be null");
        }else{
            onCommands[slot]=onCommand;
            offCommands[slot]=offCommand;
        }
    }

    public void activateSlot(int slot){
        onCommands[slot].execute();

    }

    public void deActivateSlot(int slot){
        offCommands[slot].execute();

    }
}
