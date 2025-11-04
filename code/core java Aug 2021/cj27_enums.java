// enum Level {
//     LOW,
//     MEDIUM,
//     HIGH
//   }

// public class cj27_enums {

//     public static void main(String[] args)
//     {
//         Level l1= Level.LOW;
//         System.out.println("hello world");
//         System.out.println(l1);    
//     }
// }














// class cj27_enums { 
//     enum Level {
//       LOW,
//       MEDIUM,
//       HIGH
//     }
  
//     public static void main(String[] args) { 
//       Level myVar = Level.MEDIUM; 
//       System.out.println(myVar); 
//     } 
//   }


























































class cj27_enums { 
    enum Level {
      LOW,
      MEDIUM,
      HIGH
    }
  
    public static void main(String[] args) { 
      Level myVar = Level.MEDIUM;
      
      switch(myVar) {
        case LOW:
          System.out.println("Low level");
          break;
        case MEDIUM:
          System.out.println("Medium level");
          break;
        case HIGH:
          System.out.println("High level");
          break;
      }
      System.out.println(myVar); 
    } 
  }






