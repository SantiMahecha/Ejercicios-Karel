package Ejercicio5_1;

import becker.robots.*;
import java.awt.Color;

public class Ejercicio5
{
   public static void main(String[] args)
   {

      City ny = new City();
                                        //inicio de la escena
      Wall blockAve0 = new Wall(ny, 1, 6, Direction.NORTH);
      Wall blockAve1 = new Wall(ny, 1, 3, Direction.NORTH);
      Wall blockAve2 = new Wall(ny, 1, 4, Direction.NORTH);
      Wall blockAve3 = new Wall(ny, 1, 5, Direction.NORTH);
      Wall blockAve4 = new Wall(ny, 1, 3, Direction.WEST);
      Wall blockAve5 = new Wall(ny, 1, 6, Direction.EAST);
      Wall blockAve6 = new Wall(ny, 2, 3, Direction.WEST);
      Wall blockAve7 = new Wall(ny, 3, 2, Direction.NORTH);
      Wall blockAve8 = new Wall(ny, 3, 2, Direction.WEST);
      Wall blockAve9 = new Wall(ny, 4, 1, Direction.NORTH);
      Wall blockAve10 = new Wall(ny, 4, 1, Direction.WEST);
      Wall blockAve11 = new Wall(ny, 5, 1, Direction.WEST);
      Wall blockAve12 = new Wall(ny, 5, 1, Direction.SOUTH);
      Wall blockAve13 = new Wall(ny, 6, 2, Direction.WEST);
      Wall blockAve15 = new Wall(ny, 6, 2, Direction.SOUTH);
      Wall blockAve14 = new Wall(ny, 6, 3, Direction.SOUTH);
      Wall blockAve16 = new Wall(ny, 6, 3, Direction.EAST);
      Wall blockAve17 = new Wall(ny, 5, 3, Direction.EAST);
      Wall blockAve19 = new Wall(ny, 4, 4, Direction.EAST);
      Wall blockAve20 = new Wall(ny, 4, 4, Direction.SOUTH);
      Wall blockAve21 = new Wall(ny, 3, 4, Direction.EAST);
      Wall blockAve22 = new Wall(ny, 2, 7, Direction.NORTH);
      Wall blockAve23 = new Wall(ny, 2, 7, Direction.EAST);
      Wall blockAve24 = new Wall(ny, 3, 8, Direction.NORTH);
      Wall blockAve25 = new Wall(ny, 3, 8, Direction.EAST);
      Wall blockAve26 = new Wall(ny, 4, 8, Direction.EAST);
      Wall blockAve27 = new Wall(ny, 5, 8, Direction.EAST);
      Wall blockAve28 = new Wall(ny, 6, 8, Direction.NORTH);
      Wall blockAve29 = new Wall(ny, 6, 7, Direction.EAST);
      Wall blockAve30 = new Wall(ny, 7, 7, Direction.NORTH);
      Wall blockAve31 = new Wall(ny, 6, 7, Direction.WEST);
      Wall blockAve32 = new Wall(ny, 5, 7, Direction.WEST);
      Wall blockAve33 = new Wall(ny, 5, 7, Direction.NORTH);
      Wall blockAve34 = new Wall(ny, 5, 6, Direction.NORTH);
      Wall blockAve35 = new Wall(ny, 5, 6, Direction.WEST);
      Wall blockAve36 = new Wall(ny, 5, 5, Direction.SOUTH);
      Wall blockAve37 = new Wall(ny, 6, 4, Direction.EAST);
      Wall blockAve38 = new Wall(ny, 4, 7, Direction.NORTH);
      Wall blockAve39 = new Wall(ny, 3, 6, Direction.EAST);
      Wall blockAve40 = new Wall(ny, 4, 5, Direction.NORTH);
      Wall blockAve41 = new Wall(ny, 2, 5, Direction.EAST);
      Wall blockAve42 = new Wall(ny, 2, 5, Direction.NORTH);
      Wall blockAve43 = new Wall(ny, 3, 6, Direction.NORTH);
      Wall blockAve44 = new Wall(ny, 2, 4, Direction.NORTH);
      Wall blockAve45 = new Wall(ny, 3, 3, Direction.EAST);
      Wall blockAve46 = new Wall(ny, 2, 3, Direction.EAST);
      Wall blockAve47 = new Wall(ny, 4, 3, Direction.NORTH);
      Wall blockAve48 = new Wall(ny, 4, 2, Direction.EAST);
      Wall blockAve49 = new Wall(ny, 5, 2, Direction.EAST);
      Wall blockAve50 = new Wall(ny, 5, 2, Direction.NORTH);
      
                                                        //FIN ESCENARIO
      
      Robot mark = new Robot(ny, 6, 7, Direction.EAST);
      mark.setSpeed(10);
      Thing parcel = new Thing (ny, 3, 5);
      parcel.setColor(Color.blue);
      
      parcel = new Thing (ny, 5, 4);
      parcel.setColor(Color.blue);
      
      parcel = new Thing (ny, 2, 7);
      parcel.setColor(Color.blue);
                                                        //inicio robot
      mark.turnLeft();
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();
      mark.turnLeft();
      for(int i=0; i<2; i++){
          mark.move();
      }
      mark.turnLeft();
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();
      mark.pickThing();
      mark.turnLeft();
      mark.turnLeft();
      for(int i=0; i<2; i++){
          mark.move();
          mark.turnLeft();
      }
      mark.turnLeft();
      mark.turnLeft();
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      for(int i=0; i<2; i++){
          mark.move();
      }
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      for(int i=0; i<2; i++){
          mark.move();
          mark.turnLeft();
      }
      mark.pickThing();
      mark.turnLeft();
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();
      mark.turnLeft();
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();
      mark.pickThing();
      mark.turnLeft();
      for(int i=0; i<2; i++){
          mark.move();
      }
                                    //fin robot
   }
}
