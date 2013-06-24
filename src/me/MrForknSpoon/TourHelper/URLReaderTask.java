package me.MrForknSpoon.TourHelper;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.scheduler.BukkitRunnable;


public class URLReaderTask extends BukkitRunnable{
	
	private final TourHelper th;
	private final String player;
	private final String url;
	
	public URLReaderTask(TourHelper tourHelper, String playerName, String url){
		
		th = tourHelper;
		player = playerName;
		this.url = url;
	}
	
	public void run(){
		
		try{
			URL game = new URL(url);
			URLConnection connection = game.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			List<String> inputs = new ArrayList<String>();
			int i = 0;
			while ((inputLine = in.readLine()) != null){
				inputs.add(i++, inputLine);
			}
			in.close();
			th.configUpdaterTask(player, inputs);
		}catch (Exception e){
			th.notifyPlayerOfBadURLTask(player);
		}
	}
}