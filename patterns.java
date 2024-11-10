import java.util.*;
class patterns{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.print("Enter the number of astriek to print : ");
        s = sc.nextInt();
        for(int i=1;i<=s;i++){
            if(i==1){
                System.out.println("*");
            }
        else if(i==s){
            for(int j=1;j<=s;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        else{
            System.out.print("*");
            for(int j=1;j<=2*(i-1)-1;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
}
