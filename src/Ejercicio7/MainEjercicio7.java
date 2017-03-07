
package Ejercicio7;

import becker.robots.*;
import java.awt.Color;

public class MainEjercicio7 {

    public static void main(String[] args) {
        City cd = new City(11, 11);
        Robot mark = new Robot(cd, 9, 5, Direction.NORTH);
        mark.setColor(Color.blue);
        Ejercicio7 c = new Ejercicio7(cd, mark);
        c.Recoger();
    }
    
}
