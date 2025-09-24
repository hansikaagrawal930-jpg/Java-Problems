import java.util.Scanner;
public class AgeGroupClassification {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age >= 0 && age <= 12){
           
          System.out.println("child");
        }
        else if (age >= 13 && age <= 19){
            System.out.println("Teenager");
        }
        else if (age >= 20 && age <= 59){
            System.out.println("Adult");
        }
        else if (age>=60){
            System.out.println("Senior");
        }
        else{
            System.err.println("Invalid age");
        }

    }
    
}
