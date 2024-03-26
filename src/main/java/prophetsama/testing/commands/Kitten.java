package prophetsama.testing.commands;

import net.minecraft.core.net.command.Command;
import net.minecraft.core.net.command.CommandHandler;
import net.minecraft.core.net.command.CommandSender;

import java.util.Random;

public class Kitten extends Command {
	private final static String COMMAND = "kitten";
	private final static String NAME = "Kitten";
	private final static Random random = new Random();

	public Kitten() {
		super(COMMAND);
	}

	@Override
	public boolean execute(CommandHandler handler, CommandSender sender, String[] strings) {
		if(random.nextDouble() > .5){
			sender.sendMessage("/ᐠ-ꞈ-ᐟ\\ ɴʏᴀ~");
			if (random.nextDouble() < .95){
				sender.getPlayer().world.playSoundAtEntity(sender.getPlayer(), sender.getPlayer(), "mob.ghast.moan", 1f, 0.8f);
			} else {
				sender.getPlayer().world.playSoundAtEntity(sender.getPlayer(), sender.getPlayer(), "mob.wolf.bark", 1f, 1f);
			}

		}
		else{
			sender.sendMessage("/ᐠ - ˕ -マ ɴʏᴀᴀᴀᴀᴀ!");
			sender.getPlayer().world.playSoundAtEntity(sender.getPlayer(), sender.getPlayer(), "mob.ghast.scream", 1f, 0.85f);
		}

		return true;
	}

	@Override
	public boolean opRequired(String[] strings) {
		return false;
	}

	@Override
	public void sendCommandSyntax(CommandHandler commandHandler, CommandSender commandSender) {

	}
}
