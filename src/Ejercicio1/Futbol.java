
package Ejercicio1;

import becker.robots.*;
import java.awt.Color;

public class Futbol {
    private final Robot Karel;
    private final City Ciudad;
    private final Thing Balon;
    private final Wall[] Paredes;
    
    public Futbol(){
        this.Paredes = new Wall[12];
        this.Ciudad = new City(7, 9);
        Ciudad.setFrameTitle("Ejecicio 1 Karel");
        this.Balon = new Thing(this.Ciudad, 2, 8);
        this.Balon.setColor(Color.green);
        this.Karel = new Robot(this.Ciudad, 2, 8, Direction.WEST);
        this.Karel.setColor(Color.blue);
        int x = 0;
        for(int i=0;i<7;i++){
            if(i==3)
                continue;
            Paredes[x] = new Wall(Ciudad, i, 0, Direction.WEST);
            x++;
        }
        for(int i=0;i<7;i++){
            if(i==3)
                continue;
            Paredes[x] = new Wall(Ciudad, i, 8, Direction.EAST);
            x++;
        }
    }
        
    public void advance(){
        this.Karel.pickThing();
        this.Karel.move();
        this.Karel.move();
        this.Karel.putThing();
    }
    
    public void advanceLeft(){
        this.Karel.pickThing();
        this.Karel.move();
        this.Karel.move();
        this.Karel.turnLeft();
        this.Karel.move();
        for(int i=0;i<3;i++)
            this.Karel.turnLeft();
        this.Karel.putThing();
    }
    
    public void advanceRight(){
        this.Karel.pickThing();
        this.Karel.move();
        this.Karel.move();
        for(int i=0;i<3;i++)
            this.Karel.turnLeft();
        this.Karel.move();
        this.Karel.turnLeft();
        this.Karel.putThing();
    }
    
}