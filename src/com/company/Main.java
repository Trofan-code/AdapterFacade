package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        
        TapePlayer tapePlayer = new TapePlayer();
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        EuroSocket euroSocket = new SocketAdapter(americanSocket);
        
        tapePlayer.startPlayMusic(euroSocket);
	// write your code here
    }
}
