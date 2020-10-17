package net.gopine.events.impl.world;

import net.gopine.events.Event;

/**
 * Called when the player joins a singleplayer world.
 * @author Nebula | Nebula#9998
 * @since b0.1
 */
public class EventWorldJoin extends Event {

	public final String folderName;
  	public final String worldName;

  	public EventWorldJoin(String folderName, String worldName) {
    	this.folderName = folderName;
    	this.worldName = worldName;
  	}

}
