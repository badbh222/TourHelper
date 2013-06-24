package me.MrForknSpoon.TourHelper;


import org.bukkit.scheduler.BukkitRunnable;


public class NotifyPlayerOfBadURLTask extends BukkitRunnable{
	
	private final TourHelper th;
	private final String player;
	
	public NotifyPlayerOfBadURLTask(TourHelper tourHelper, String playerName){
		
		th = tourHelper;
		player = playerName;
	}
	
	public void run(){
		
		th.notifyPlayerOfBadURL(player);
	}
}