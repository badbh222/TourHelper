package me.MrForknSpoon.TourHelper;


import java.util.List;

import org.bukkit.scheduler.BukkitRunnable;


public class ConfigUpdaterTask extends BukkitRunnable{
	
	private final TourHelper th;
	private final String player;
	private final List<String> list;
	
	public ConfigUpdaterTask(TourHelper tourHelper, String playerName, List<String> lineList){
		
		th = tourHelper;
		player = playerName;
		list = lineList;
	}
	
	public void run(){
		
		th.updateConfig(player, list);
	}
}