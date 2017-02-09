
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creates city called metalgear
        City metalgear = new City();
        
        // Creates robot called solidsnake
        Robot solidsnake = new Robot(metalgear, 0, 0, Direction.SOUTH);
        
        //Creates robot called enemy
        Robot enemy = new Robot(metalgear, 0, 1, Direction.SOUTH);
        
        // Creates walls
        new Wall(metalgear, 0, 1, Direction.WEST);
        new Wall(metalgear, 1, 1, Direction.WEST);
        new Wall(metalgear, 1, 1, Direction.SOUTH);
        
        //Moves solidsnake and enemy into position
        solidsnake.move();
        enemy.move();
        enemy.turnLeft();
        enemy.move();
        enemy.turnLeft();
        enemy.turnLeft();
        enemy.turnLeft();
        enemy.move();
        solidsnake.move();
        enemy.turnLeft();
        enemy.turnLeft();
        enemy.turnLeft();
        solidsnake.turnLeft();
        enemy.move();
        solidsnake.move();
        
    }
}
