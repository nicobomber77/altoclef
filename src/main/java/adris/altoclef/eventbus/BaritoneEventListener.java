package adris.altoclef.eventbus;

import java.util.ArrayList;

import adris.altoclef.AltoClef;
import adris.altoclef.Render.shapes.RenderableObject;
import baritone.api.event.events.BlockInteractEvent;
import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.PathEvent;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.SprintStateEvent;
import baritone.api.event.events.TabCompleteEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.WorldEvent;
import baritone.api.event.listener.IGameEventListener;

public class BaritoneEventListener implements IGameEventListener
{

    private AltoClef _mod;


    private ArrayList<RenderableObject>  _tempRenderObjects = new ArrayList<>();

    public BaritoneEventListener(AltoClef mod){
        _mod = mod;
    }

    @Override public void onTick(TickEvent tickEvent)
    {


        //_mod.getRenderer().RenderObject(lineToRender);
        _mod.getRenderer().onTick();
    }

    @Override public void onPlayerUpdate(PlayerUpdateEvent playerUpdateEvent)
    {

    }

    @Override public void onSendChatMessage(ChatEvent chatEvent)
    {

    }

    @Override public void onPreTabComplete(TabCompleteEvent tabCompleteEvent)
    {

    }

    @Override public void onChunkEvent(ChunkEvent chunkEvent)
    {

    }
    int counter;
    @Override public void onRenderPass(RenderEvent renderEvent)
    {

        _mod.getRenderer().Render(renderEvent.getModelViewStack());

    }

    @Override public void onWorldEvent(WorldEvent worldEvent)
    {

    }

    @Override public void onSendPacket(PacketEvent packetEvent)
    {

    }

    @Override public void onReceivePacket(PacketEvent packetEvent)
    {

    }

    @Override public void onPlayerRotationMove(RotationMoveEvent rotationMoveEvent)
    {

    }

    @Override public void onPlayerSprintState(SprintStateEvent sprintStateEvent)
    {

    }

    @Override public void onBlockInteract(BlockInteractEvent blockInteractEvent)
    {

    }

    @Override public void onPlayerDeath()
    {

    }

    @Override public void onPathEvent(PathEvent pathEvent)
    {

    }
}