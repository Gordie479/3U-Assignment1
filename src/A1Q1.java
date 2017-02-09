
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simmg9723
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creates city called rapture
        City rapture = new City();
        
        // Creates robot called walle
        Robot walle = new Robot(rapture, 0, 2, Direction.WEST);
        
        // Creates walls around the city
        new Wall(rapture, 1, 1, Direction.NORTH);
        new Wall(rapture, 1, 1, Direction.WEST);
        new Wall(rapture, 2, 1, Direction.WEST);
        new Wall(rapture, 2, 1, Direction.SOUTH);
        new Wall(rapture, 2, 2, Direction.SOUTH);
        new Wall(rapture, 2, 2, Direction.EAST);
        new Wall(rapture, 1, 2, Direction.EAST);
        new Wall(rapture, 1, 2, Direction.NORTH);
        
        //makes walle run around the wall forever
        while(true) {
        walle.move();
        walle.move();
        walle.turnLeft();
        walle.move();
        walle.move();
        walle.move();
        walle.turnLeft();
        walle.move();
        walle.move();
        walle.move();
        walle.turnLeft();
        walle.move();
        walle.move();
        walle.move();
        walle.turnLeft();
        walle.move();
        }
    }
}
