// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Woemmm extends Actor
{

    /**
     * Act - do whatever the Woemmm wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("w")) {
            move(6);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-6);
        }
    }
}
