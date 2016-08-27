package com.gmail.lynx7478.leagueoflegends.game;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

public class Summoner {
	
	private static HashMap<UUID, Summoner> summoners;
	
	static
	{
		summoners = new HashMap<UUID, Summoner>();
	}
	
	public Summoner getSummoner(UUID id)
	{
		return summoners.get(id);
	}
	
	// Vars.
	
	private Player p;
	private String name;
	private UUID id;
    private LTeam team;
	
	public Summoner(Player p)
	{
		this.p = p;
		this.name = p.getName();
		this.id = p.getUniqueId();
		team = null;
		
		// This should be last.
		summoners.put(this.id, this);
	}
	
	public Player getPlayer()
	{
		return p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public UUID getUniqueId()
	{
		return id;
	}
	
	public LTeam getTeam()
	{
		return team;
	}
	
	public void setTeam(LTeam t)
	{
		this.team = t;
	}

}
