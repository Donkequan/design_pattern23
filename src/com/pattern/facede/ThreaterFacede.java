package com.pattern.facede;

public class ThreaterFacede {

    private Screen screen = new Screen();
    private DVDPlayer dvdPlayer = new DVDPlayer();
    private  Door door = new Door();

    public void on(){
        screen.down();
        door.open();
        dvdPlayer.on();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        dvdPlayer.off();
        screen.up();
        door.close();
    }
}
