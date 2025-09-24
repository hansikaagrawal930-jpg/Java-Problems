import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("The largest number is:" + num1);
        }
        else if(num2 > num1){
            System.out.println("The largest number is:" + num2);
        }
        else{
            System.out.println("Both are equal");
        }
        sc.close();
    }
    
}
