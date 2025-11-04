// import java.time.LocalDate;  // import the LocalDate class

// class cj28_date_time
// {  
//   public static void main(String[] args)
//   {  
//     LocalDate myObj = LocalDate.now();  // Create a date object
//     System.out.println(myObj);  // Display the current date
//   }  
// }  







































// // import java.time.LocalDate;  // import the LocalDate class
// import java.time.LocalTime;  // import the LocalDate class

// class cj28_date_time
// {  
//   public static void main(String[] args)
//   {  
//     LocalTime myObj = LocalTime.now();  // Create a date object
//     System.out.println(myObj);  // Display the current date
//   }  
// }  







































// // import java.time.LocalDate;  // import the LocalDate class
// import java.time.LocalDateTime;  // import the LocalDate class

// class cj28_date_time
// {  
//   public static void main(String[] args)
//   {  
//     LocalDateTime myObj = LocalDateTime.now();  // Create a date object
//     System.out.println(myObj);  // Display the current date
//   }  
// }  







































import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class cj28_date_time {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    
    DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("d-MM-yy HH:mm:ss");  
    DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("E dd-MMM-yyy HH:mm:ss");  
    DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("EEEE dd-MMM-yyyy HH:mm:ss");  
    
    String formattedDate1 = myDateObj.format(myFormatObj1);  
    String formattedDate2 = myDateObj.format(myFormatObj2);  
    String formattedDate3 = myDateObj.format(myFormatObj3);  
    
    System.out.println("After formatting1: " + formattedDate1);  
    System.out.println("After formatting1: " + formattedDate2);  
    System.out.println("After formatting1: " + formattedDate3);  
    
  }  
}
