
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creates city called deathmountain
        City deathmountain = new City();
        
        // Creates robot called darunia
        Robot darunia = new Robot(deathmountain, 3, 0, Direction.EAST);
        
        // Creates mountain(walls and flag)
        new Thing(deathmountain, 3, 1);
        new Wall(deathmountain, 3, 2, Direction.WEST);
        new Wall(deathmountain, 3, 2, Direction.NORTH);
        new Wall(deathmountain, 2, 3, Direction.WEST);
        new Wall(deathmountain, 1, 3, Direction.WEST);
        new Wall(deathmountain, 1, 3, Direction.NORTH);
        new Wall(deathmountain, 1, 3, Direction.EAST);
        new Wall(deathmountain, 2, 4, Direction.NORTH);
        new Wall(deathmountain, 2, 4, Direction.EAST);
        new Wall(deathmountain, 3, 4, Direction.EAST);
        
        // Makes darunia take (thing) to top of mountain then climb down
        darunia.move();
        darunia.pickThing();
        darunia.turnLeft();
        darunia.move();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.move();
        darunia.turnLeft();
        darunia.move();
        darunia.move();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.move();
        darunia.putThing();
        darunia.move();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.move();
        darunia.turnLeft();
        darunia.move();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.turnLeft();
        darunia.move();
        darunia.move();
        darunia.turnLeft();
        
    }
}
