import java.util.*;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter a CP : ");
        int CP = SC.nextInt();

        System.out.print("Enter a SP : ");
        int SP = SC.nextInt();

        if(SP > CP) {
         System.out.print("profit is "+(SP-CP)+"profit percentage is :"+((SP-CP)*100/CP));       
        }

         else if(CP > SP) {
         System.out.print("loss is :"+(CP-SP)+"loss percentage is :"+((CP-SP)*100/CP));       
        }

         else if(CP == SP) {
            System.out.println("No profit No loss");
        }

    }
}