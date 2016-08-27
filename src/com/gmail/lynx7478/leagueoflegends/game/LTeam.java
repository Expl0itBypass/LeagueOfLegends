package com.gmail.lynx7478.leagueoflegends.game;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Team;

import com.gmail.lynx7478.leagueoflegends.game.scoreboard.LScoreboard;

public class LTeam {
	
	public static final LTeam Blue = new LTeam("Blue", ChatColor.BLUE);
	public static final LTeam Purple = new LTeam("Purple", ChatColor.DARK_PURPLE);
	
	public static final LTeam[] Teams = new LTeam[]
			{
					LTeam.Blue,
					LTeam.Purple
			};
	
	private String name;
	private ChatColor color;
	private ArrayList<Summoner> players;
	private Team team;
//  private Turret[] turrets;
//  private Nexus nexus;
//  private Inhibitors[] inhibitors;
	
	public LTeam(String name, ChatColor color)
	{
		this.name = name;
		this.color = color;
		this.players = new ArrayList<Summoner>();
		(this.team = LScoreboard.getScoreboard().registerNewTeam(name)).setAllowFriendlyFire(false);
		this.team.setCanSeeFriendlyInvisibles(true);
		this.team.setDisplayName(this.color+name);
		this.team.setPrefix(color.toString());
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColoredName()
	{
		return color+name;
	}
	
	public ArrayList<Summoner> getSummoners()
	{
		return players;
	}
	
	public Team getScoreboardTeam()
	{
		return team;
	}
	
	public void addToTeam(Summoner p)
	{
		this.players.add(p);
		this.team.addEntry(p.getName());
		p.setTeam(this);
	}

}
