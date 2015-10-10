package pluginplugintest;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginPluginTest extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("ok");
	}
}
