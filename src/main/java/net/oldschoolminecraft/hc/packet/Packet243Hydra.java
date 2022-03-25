package net.oldschoolminecraft.hc.packet;

import net.minecraft.server.NetHandler;
import net.minecraft.server.Packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Packet243Hydra extends Packet
{
    public String json;

    public void a(DataInputStream dataInputStream) throws IOException
    {
        json = dataInputStream.readUTF();
    }

    public void a(DataOutputStream dataOutputStream) throws IOException
    {
        dataOutputStream.writeUTF(json);
    }

    public void a(NetHandler netHandler)
    {
        netHandler.a(this);
    }

    public int a()
    {
        return json.length();
    }
}
