package chapter01;

public class Reservation {
 int TicketID;
 Reservation() {
TicketID=80;

}
public void ShowTicket()
{
System.out.println("The Ticket ID is "+ TicketID);
}
public static void main(String ar[])
{
Reservation g= new Reservation();
g.ShowTicket();
}
}