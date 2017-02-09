
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simmg9723
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creates city called artisans
        City artisans = new City();
        
        // Creates robot called spyro
        Robot spyro = new Robot(artisans, 3, 3, Direction.EAST);
        spyro.setLabel("Spyro");
        
        // Creates robot called sparx
        Robot sparx = new Robot(artisans, 0, 1, Direction.WEST);
        sparx.setLabel("Sparx");
        
        // Creates walls
        new Wall(artisans, 2, 3, Direction.WEST);
        new Wall(artisans, 2, 3, Direction.NORTH);
        new Wall(artisans, 2, 3, Direction.EAST);
        new Wall(artisans, 3, 3, Direction.EAST);
        new Wall(artisans, 3, 3, Direction.SOUTH);
        new Thing(artisans, 0, 0);
        new Thing(artisans, 1, 0);
        new Thing(artisans, 1, 1);
        new Thing(artisans, 1, 2);
        new Thing(artisans, 2, 2);
        
        // Moves sparx and spyro to collect (things)
        sparx.move();
        sparx.pickThing();
        spyro.turnLeft();
        spyro.turnLeft();
        spyro.move();
        sparx.turnLeft();
        sparx.move();
        sparx.pickThing();
        spyro.turnLeft();
        spyro.turnLeft();
        spyro.turnLeft();
        spyro.move();
        spyro.pickThing();
        sparx.turnLeft();
        sparx.move();
        sparx.pickThing();
        spyro.move();
        spyro.pickThing();
        spyro.turnLeft();
    }
}
