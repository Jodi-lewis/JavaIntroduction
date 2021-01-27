import java.util.Scanner;

public class JavaIntroduction {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity");
        int quantity = sc.nextInt();

        if (quantity < 100){
            System.out.println("No Discount");
        }else if (quantity >=100 || quantity <=120) {
            System.out.println("You get 10%");
        }else {
            System.out.println("You get 15%");
        }

        }

}
