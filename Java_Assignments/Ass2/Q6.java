import java.util.Scanner;

class Bus_Tickit
{
    boolean[] seat=new boolean[10];


    void viewSeat()
    {
        System.out.println("Available seats are:");
        for(int i=0;i<10;i++)
        {
            if(seat[i]==false)
            {
                System.out.print(i+1+" ");
            }
        }
        System.out.println();
    }

    void cancelSeat(int seatno)
    {
        if(seat[seatno-1]==false)
        {
            System.out.println("Invalid SeatNo to cancel..");
        }
        else
        {
            seat[seatno-1]=false;
            System.out.println("seat cancel successfully...");
        }
        


    }

    void bookSeat(int SeatNo)
    {
      

        if(seat[SeatNo-1]==false)
            {
                System.out.println("Your seat is booked Your seatNo is: "+SeatNo);
                seat[SeatNo-1]=true;
                
            }
        else
        {
            System.out.println("Seat is not Available to book..");
            System.out.println("see the Available seats..");
            this.viewSeat();
        }
        
        
            
     

        

    }
}

public class Q6 {
    public static void main(String[] args) {
        Bus_Tickit b1=new Bus_Tickit();

        Scanner sc=new Scanner(System.in);
        int choice=0;

        
    
        while(choice<4)
        {
            System.out.println("1.View Available seat");
            System.out.println("2.Book a Seat");
            System.out.println("3.Cancel a seat");
            System.out.println("4.Exit..");

            System.out.println("Enter choice: ");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                {
                    b1.viewSeat();
                    break;
                }

                case 2:
                {
                    System.out.println("Enter seat no to Book: ");
                    int SeatNo=sc.nextInt();
                    if(SeatNo<=0 && SeatNo>11)
                    {
                        System.out.println("Enter valid seat No to cance");
                    }
                    else
                    {
                        b1.bookSeat(SeatNo);
                    }
                    
                    break;
                    
                }

                case 3:
                {
                    System.out.println("Enter seat no to cancel: ");
                    int seatno=sc.nextInt();
                    if(seatno<=0 && seatno>11)
                    {
                        System.out.println("Enter valid seat No to cancel");
                    }
                    else
                    {
                        b1.cancelSeat(seatno);
                    }
                    
                    break;
                }

                default:
                    break;
            }

        }
    }
}
