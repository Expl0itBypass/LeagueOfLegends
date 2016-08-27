package com.gmail.lynx7478.leagueoflegends.game.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class LScoreboard {
	
	private static ScoreboardManager manager;
	private static Scoreboard scoreboard;
	
	static
	{
		manager = Bukkit.getScoreboardManager();
		scoreboard = manager.getNewScoreboard();
	}
	
	public static Scoreboard getScoreboard()
	{
		return scoreboard;
	}

}
