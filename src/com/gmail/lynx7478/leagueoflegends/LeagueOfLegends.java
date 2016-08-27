package com.gmail.lynx7478.leagueoflegends;

import org.bukkit.plugin.java.JavaPlugin;

public class LeagueOfLegends extends JavaPlugin {
	
	private static LeagueOfLegends instance;
	
	public LeagueOfLegends getInstance()
	{
		return instance;
	}
	
	@Override
	public void onEnable()
	{
		instance = this;
	}
	
	public void onDisable()
	{
		
	}

}
