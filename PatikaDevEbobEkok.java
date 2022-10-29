
import java.util.Scanner;

public class PatikaDevEbobEkok {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the first number :");
        int num1=scan.nextInt();
        System.out.print("Please enter the second number :");
        int num2=scan.nextInt();
        
        int ebob = 1,ekok;
        System.out.print(num1+" Bölenleri :");
                
        for(int i=1;i<=num1;i++){
            if(num1%i==0){
               System.out.print(i+" ");
            } 
           
        }
         System.out.println("");
        System.out.print(num2+" Bölenleri :");
        for(int i=1;i<=num2;i++){
            if(num2%i==0){
                System.out.print(i+" ");
            }
        }
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1 % i == 0 && num2 % i ==0){
                ebob=i;
            }
           
        }
        System.out.println("");
         ekok=(num1*num2)/ebob;
         System.out.println(num1+" ve "+num2+" sayılarının Ebobu :"+ebob);
         System.out.println(num1+" ve "+num2+" sayılarının Ekoku :"+ekok);
        
       
        
        
        
    }   
}
        
