package chapter04;

enum CompassDirections
  {
    NORTH, SOUTH, EAST,WEST,NORTEAST,SOUTHEAST,SOUTHWEST,NORTHWEST;
  }
class TestCompassDirections
{
   
  public static void main(String[] args)
  {
    CompassDirections cd = CompassDirections.EAST; 
    
    System.out.println(cd);
    
    
  }
}
