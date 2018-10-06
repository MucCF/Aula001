package me.devmuc.AulaComandos;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Aula extends JavaPlugin {
	
	@Override
	public void onLoad() {
		
		Bukkit.getConsoleSender().sendMessage("§aCarregando!");
		
	}
	
	@Override
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage("§aAtivado!");
		getCommand("discord").setExecutor(new Commands());
		getCommand("site").setExecutor(new Commands());
		getCommand("fly").setExecutor(new Commands());
		
	}
	
	@Override
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage("§cDesativado!");
		
	}

}
