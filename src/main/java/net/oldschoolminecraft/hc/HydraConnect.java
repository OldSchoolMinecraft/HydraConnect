package net.oldschoolminecraft.hc;

import net.minecraft.server.Packet;
import net.oldschoolminecraft.hc.packet.Packet243Hydra;
import org.bukkit.plugin.java.JavaPlugin;

public class HydraConnect extends JavaPlugin
{
    private boolean packetRegistered = true; // make sure the packet doesn't get double registered when reloading

    public void onEnable()
    {
        if (!packetRegistered) Packet.registerPacket(243, true, true, Packet243Hydra.class);
        packetRegistered = true;
        System.out.println("HydraConnect enabled");
    }

    public void onDisable()
    {
        System.out.println("HydraConnect disabled");
    }
}
