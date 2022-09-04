
import java.util.*;
public class week {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        // System.out.println("Enter number");
        switch(number){
            case 1: System.out.println("It's Sunday");
                    break;
            case 2: System.out.println("It's Monday");
                    break;
            case 3: System.out.println("It's Tuesday");
                    break;
            case 4: System.out.println("It's Wednesday");
                    break;
            case 5: System.out.println("It's Thursday");
                    break;
            case 6:System.out.println("It's Friday");
                    break;
            case 7: System.out.println("It's Saturday");
                    break;
            default : System.out.println("Its weekend");
            
        }
    }
}
