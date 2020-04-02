package com.pattern.command;

public class RemoteController {

    private Commend[] onCommands;
    private Commend[] offCommands;

    private Commend undoCommend;

    public RemoteController(int num) {
        onCommands = new Commend[num];
        offCommands = new Commend[num];

        for (int i=0; i<num; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

    }

    public void setCommand(int no, Commend on, Commend off){
        onCommands[no] = on;
        offCommands[no] = off;
    }

    public void onButton(int no){
        onCommands[no].excute();
        undoCommend = onCommands[no];
    }

    public void offButton(int no){
        offCommands[no].excute();
        undoCommend = offCommands[no];
    }


    public void undoButton(){
        undoCommend.undo();
    }

}
