
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simmg9723
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating a new city called kitchener
        City kitchener = new City();
        
        // Creating a robot
        Robot jerry = new Robot(kitchener, 2, 1, Direction.EAST);
        jerry.move();
        jerry.turnLeft();
        jerry.move();
        jerry.move();
        jerry.move();
        jerry.turnLeft();
        jerry.turnLeft();
        jerry.move();
        
    }
}
