package com.company;

import com.company.playbackProcess.MusicGenre;
import com.company.playbackProcess.OnOffTapePlayer;
import com.company.playbackProcess.StartMusic;
import com.company.playbackProcess.TapeSettings;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TapePlayer {  // this is an adapter implementation
GregorianCalendar newCal = new GregorianCalendar( );
int day = newCal.get( Calendar.DAY_OF_WEEK );
	
	private OnOffTapePlayer onOffTapePlayer = new OnOffTapePlayer();
	private StartMusic startMusic = new StartMusic();
	private MusicGenre musicGenre = new MusicGenre();
	private TapeSettings tapeSettings = new TapeSettings();
	
	public void startPlayMusic(EuroSocket euroSocket){
		euroSocket.getPower();
		onOffTapePlayer.on();
		tapeSettings.putTapeInsideOfPlayer();
		startMusic.startPlaying();
		if (day==2){ // 2 => monday
			
			musicGenre.classicMusic();
		}else {
			musicGenre.rock();
			
		}
		
		try {
			Thread.sleep(1000);
			System.out.println("-----------------------------");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		onOffTapePlayer.off();
		
	}
	
	

}
