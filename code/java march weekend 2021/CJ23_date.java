// import java.time.LocalDate;
// public class CJ23_date
// {
//     public static void main(String[] agrs)
//     {
//         System.out.println("date time print");
//         LocalDate ldt1 = LocalDate.now();
//         System.out.print(ldt1);
//     }
// }





























// import java.time.LocalDate;
// import java.time.LocalDateTime;

// public class CJ23_date
// {
//     public static void main(String[] agrs)
//     {
//         System.out.println("date time print");
//         LocalDate ld1 = LocalDate.now();
//         System.out.println(ld1);
//         LocalDateTime ldt1 = LocalDateTime.now();
//         System.out.println(ldt1);
        
//     }
// }













































// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class CJ23_date
// {
//     public static void main(String[] agrs)
//     {
        
//         LocalDate ld1 = LocalDate.now();
//         System.out.println(" before "+ld1);
        
//         LocalDateTime ldt1 = LocalDateTime.now();
//         System.out.println(" before "+ldt1);
        
//         DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
//         String dtf1values= dtf1.format(ldt1);
//         System.out.println(" after "+dtf1values);

//     }
// }




























// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class CJ23_date
// {
//     public static void main(String[] agrs)
//     {
        
//         LocalDate ld1 = LocalDate.now();
//         System.out.println(" before "+ld1);
        
//         LocalDateTime ldt1 = LocalDateTime.now();
//         System.out.println(" before "+ldt1);
        
//         DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy-dd-MMM HH:mm:ss");
        
//         String dtf1values= dtf1.format(ldt1);
//         System.out.println(" after "+dtf1values);

//     }
// }




























import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CJ23_date
{
    public static void main(String[] agrs)
    {
        
        LocalDate ld1 = LocalDate.now();
        System.out.println(" before "+ld1);
        
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(" before "+ldt1);
        
        // DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy-dd-MMM HH:mm:ss");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E, MMMM-dd-yyyy HH:mm:ss");
        
        String dtf1values= dtf1.format(ldt1);
        System.out.println(" after "+dtf1values);

    }
}







