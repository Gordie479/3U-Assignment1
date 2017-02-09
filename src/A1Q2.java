
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creates citty called london
        City london = new City();
        
        // Creates robot called eox
        Robot eox = new Robot(london, 1, 2, Direction.SOUTH);
        
        //Creates walls and thing
        new Thing(london, 2, 2);
        new Wall(london, 1, 2, Direction.SOUTH);
        new Wall(london, 1, 2, Direction.EAST);
        new Wall(london, 1, 2, Direction.NORTH);
        new Wall(london, 1, 1, Direction.NORTH);
        new Wall(london, 1, 1, Direction.WEST);
        new Wall(london, 2, 1, Direction.WEST);
        new Wall(london, 2, 1, Direction.SOUTH);
        
        // Makes eox get (thing) and return to original position
        eox.turnLeft();
        eox.turnLeft();
        eox.turnLeft();
        eox.move();
        eox.turnLeft();
        eox.move();
        eox.turnLeft();
        eox.move();
        eox.pickThing();
        eox.turnLeft();
        eox.turnLeft();
        eox.move();
        eox.turnLeft();
        eox.turnLeft();
        eox.turnLeft();
        eox.move();
        eox.turnLeft();
        eox.turnLeft();
        eox.turnLeft();
        eox.move();
        eox.turnLeft();
        eox.turnLeft();
        eox.turnLeft();
                
    }
}
