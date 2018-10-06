package me.devmuc.AulaComandos;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("discord")) {
			if (args.length == 0) {
				if (!(sender instanceof Player)) {
					sender.sendMessage("§cVocê não é um jogador.");
					return true;
				}

				Player p = (Player) sender;

				p.sendMessage(" ");
				p.sendMessage("§aNosso discord: DISCORD");
				p.sendMessage(" ");

			}

			if (cmd.getName().equalsIgnoreCase("site")) {
				if (args.length == 0) {
					if (!(sender instanceof Player)) {
						sender.sendMessage("§cVocê não é um jogador.");
						return true;
					}

					Player p = (Player) sender;

					p.sendMessage("site: aaa");

				}
			}

			if (cmd.getName().equalsIgnoreCase("fly")) {
				if (args.length == 0) {
					if (!(sender instanceof Player)) {
						sender.sendMessage("§cVocê não é um jogador.");
						return true;
					}
										
					Player p = (Player)sender;
					if (!p.hasPermission("fly.usar")) {
						p.sendMessage("§cVocê não tem permissão");
						
					}else{
					
					ArrayList<String> lore = new ArrayList<String>();
					Inventory inv = Bukkit.createInventory(null, 3*9, "§aFly");
					ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta meta = item.getItemMeta();
					meta.setDisplayName("§eFly");
					lore.add("");
					lore.add("§aFly Desativado");
					lore.add("");
					meta.setLore(lore);
					inv.setItem(13, item);
					p.openInventory(inv);
					
				}
				}
			}

		}
		return false;
	}

}
