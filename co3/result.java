import java.util.Scanner;
class sports{
    String sport;
    int Rating;
    sports(String spo, int ra){
        sport = spo;
        Rating = ra;
    }

}
class student extends sports{
    String Grade;
    double Overall_per;
    student(String spo, int ra,String gd, double per ){
        super(spo, ra);
        Grade = gd;
        Overall_per = per;
    }
}
public class result extends student {
    result(String spo, int ra,String gd, double per ){
        super(spo, ra, gd, per);
    }
    void display(){
        System.out.println("\nSports Details of Student");
        System.out.println("Sport :"+sport);
        System.out.println("Rating :"+Rating);
        System.out.println("\nAcademic Details of Student");
        System.out.println("Academic Grade :"+Grade);
        System.out.println("Overall percentage :"+Overall_per);
    }
    
    public static void main(String[] args) {
    System.out.println("Name: SARANYA MOHAN\n Regno: SJC22MCA-2049 \n Course Code:20MCA132\n Date: 7/06/2023");
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter the Sports Details of Student");
        System.out.println("\n Sport: ");
        String a =sc.next();
        System.out.println("\n Sport Rating  out of 10: ");
        int b =sc.nextInt();
        System.out.println("\nEnter the Sports Details of Student");
        System.out.println("\n Academic Grade: ");
        String c =sc.next();
        System.out.println("\n Overall percentage: ");
        double d =sc.nextDouble();
        sc.close();
        result obj= new result(a,b,c,d);
        obj.display();
    }
}
