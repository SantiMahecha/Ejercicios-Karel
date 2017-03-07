package Ejercicio5_2;

import becker.robots.*;

public class Ejercicio5
{
   public static void main(String[] args)
   {
      City ny = new City();
      Wall blockAve0 = new Wall(ny, 5, 2, Direction.WEST);
      Wall blockAve1 = new Wall(ny, 6, 2, Direction.WEST);
      Wall blockAve2 = new Wall(ny, 7, 2, Direction.WEST);
      Wall blockAve3 = new Wall(ny, 8, 2, Direction.WEST);
      Wall blockAve4 = new Wall(ny, 9, 2, Direction.WEST);
      Wall blockAve5 = new Wall(ny, 10, 2, Direction.WEST);
      Wall blockAve6 = new Wall(ny, 11, 2, Direction.WEST);
      Wall blockAve7 = new Wall(ny, 12, 2, Direction.WEST);
      Wall blockAve8 = new Wall(ny, 5, 2, Direction.NORTH);
      Wall blockAve9 = new Wall(ny, 5, 3, Direction.NORTH);
      Wall blockAve10 = new Wall(ny, 5, 4, Direction.NORTH);
      Wall blockAve11 = new Wall(ny, 5, 5, Direction.NORTH);
      Wall blockAve12 = new Wall(ny, 5, 6, Direction.NORTH);
      Wall blockAve13 = new Wall(ny, 5, 7, Direction.NORTH);
      Wall blockAve14 = new Wall(ny, 5, 8, Direction.NORTH);
      Wall blockAve15 = new Wall(ny, 5, 9, Direction.NORTH);
      Wall blockAve16 = new Wall(ny, 5, 9, Direction.EAST);
      Wall blockAve17 = new Wall(ny, 6, 9, Direction.EAST);
      Wall blockAve18 = new Wall(ny, 7, 9, Direction.EAST);
      Wall blockAve19 = new Wall(ny, 8, 9, Direction.EAST);
      Wall blockAve20 = new Wall(ny, 9, 9, Direction.EAST);
      Wall blockAve21 = new Wall(ny, 10, 9, Direction.EAST);
      Wall blockAve22 = new Wall(ny, 11, 9, Direction.EAST);
      Wall blockAve23 = new Wall(ny, 12, 9, Direction.EAST);
      Wall blockAve24 = new Wall(ny, 12, 9, Direction.SOUTH);
      Wall blockAve25 = new Wall(ny, 12, 3, Direction.SOUTH);
      Wall blockAve26 = new Wall(ny, 12, 4, Direction.SOUTH);
      Wall blockAve27 = new Wall(ny, 12, 5, Direction.SOUTH);
      Wall blockAve28 = new Wall(ny, 12, 6, Direction.SOUTH);
      Wall blockAve29 = new Wall(ny, 12, 7, Direction.SOUTH);
      Wall blockAve30 = new Wall(ny, 12, 8, Direction.SOUTH);
      
      Thing parcel = new Thing (ny, 10, 2);
      parcel = new Thing (ny, 7, 2);
      parcel = new Thing (ny, 12, 4);
      parcel = new Thing (ny, 5, 4);
      parcel = new Thing (ny, 5, 7);
      parcel = new Thing (ny, 7, 9);
      parcel = new Thing (ny, 12, 7);
      parcel = new Thing (ny, 10, 9);
      
      Wall blockAv0 = new Wall(ny, 1, 11, Direction.WEST);
      Wall blockAv1 = new Wall(ny, 2, 11, Direction.WEST);
      Wall blockAv2 = new Wall(ny, 3, 11, Direction.WEST);
      Wall blockAv3 = new Wall(ny, 4, 11, Direction.WEST);
      Wall blockAv4 = new Wall(ny, 5, 11, Direction.WEST);
      Wall blockAv5 = new Wall(ny, 6, 11, Direction.WEST);
      Wall blockAv6 = new Wall(ny, 7, 11, Direction.WEST);
      Wall blockAv7 = new Wall(ny, 8, 11, Direction.WEST);
      Wall blockAv8 = new Wall(ny, 1, 11, Direction.NORTH);
      Wall blockAv9 = new Wall(ny, 1, 12, Direction.NORTH);
      Wall blockAv10 = new Wall(ny, 1, 13, Direction.NORTH);
      Wall blockAv11 = new Wall(ny, 1, 14, Direction.NORTH);
      Wall blockAv12 = new Wall(ny, 1, 15, Direction.NORTH);
      Wall blockAv13 = new Wall(ny, 1, 16, Direction.NORTH);
      Wall blockAv14 = new Wall(ny, 1, 17, Direction.NORTH);
      Wall blockAv15 = new Wall(ny, 1, 18, Direction.NORTH);
      Wall blockAv16 = new Wall(ny, 1, 18, Direction.EAST);
      Wall blockAv17 = new Wall(ny, 2, 18, Direction.EAST);
      Wall blockAv18 = new Wall(ny, 3, 18, Direction.EAST);
      Wall blockAv19 = new Wall(ny, 4, 18, Direction.EAST);
      Wall blockAe20 = new Wall(ny, 5, 18, Direction.EAST);
      Wall blockAv21 = new Wall(ny, 6, 18, Direction.EAST);
      Wall blockAe22 = new Wall(ny, 7, 18, Direction.EAST);
      Wall blockAv23 = new Wall(ny, 8, 18, Direction.EAST);
      Wall blockAv24 = new Wall(ny, 8, 12, Direction.SOUTH);
      Wall blockAv25 = new Wall(ny, 8, 13, Direction.SOUTH);
      Wall blockAv26 = new Wall(ny, 8, 14, Direction.SOUTH);
      Wall blockAv27 = new Wall(ny, 8, 15, Direction.SOUTH);
      Wall blockAe28 = new Wall(ny, 8, 16, Direction.SOUTH);
      Wall blockAv29 = new Wall(ny, 8, 17, Direction.SOUTH);
      Wall blockAv30 = new Wall(ny, 8, 18, Direction.SOUTH);
      

      
      Robot mark = new Robot(ny, 13, 2, Direction.EAST);
      mark.setSpeed(10);
      
      mark.turnLeft();
      for(int i=0; i<2; i++){
          mark.move();
          mark.move();     
          mark.move();
          mark.pickThing();
      }
      mark.move();     
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();     
      mark.move();
      mark.pickThing();
      for(int i=0; i<3; i++){
          mark.move();
      }
      mark.pickThing();
      mark.move();     
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();     
      mark.move();
      mark.pickThing();
      for(int i=0; i<3; i++){
          mark.move();
      }
      mark.pickThing();
      mark.move();     
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();     
      mark.move();
      mark.pickThing();
      for(int i=0; i<3; i++){
          mark.move();
      }
      mark.pickThing();
      mark.move();     
      for(int i=0; i<2; i++){
          mark.move();
          mark.turnLeft();
      }
      
                                        //primera fase
      
      for(int i=0; i<9; i++){
          mark.move();
      }
      mark.turnLeft();
      for(int i=0; i<7; i++){
          mark.move();
      }
      mark.putThing();
      mark.move();     
      mark.move();
      mark.move();
      mark.putThing();
      mark.move();     
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();     
      mark.move();
      mark.putThing();
      for(int i=0; i<3; i++){
          mark.move();
      }
      mark.putThing();
      mark.move();     
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();     
      mark.move();
      mark.putThing();
      for(int i=0; i<3; i++){
          mark.move();
      }
      mark.putThing();
      mark.move();     
      mark.move();
      for(int i=0; i<3; i++){
          mark.turnLeft();
      }
      mark.move();     
      mark.move();
      mark.putThing();
      for(int i=0; i<3; i++){
          mark.move();
      }
      mark.putThing();
      mark.move();     
      for(int i=0; i<2; i++){
          mark.move();
          mark.turnLeft();
      }
      mark.move();
   }
}
