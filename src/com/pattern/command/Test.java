package com.pattern.command;

public class Test {

    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        Commend lightOnCommand = new LightOnCommand(lightReceiver);
        Commend lightOffCommand= new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController(5);
        remoteController.setCommand(0, lightOnCommand,lightOffCommand);

        remoteController.onButton(0);
        remoteController.offButton(0);
        remoteController.undoButton();

    }
}
