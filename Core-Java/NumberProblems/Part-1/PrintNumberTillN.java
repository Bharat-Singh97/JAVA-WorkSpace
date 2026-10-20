import java.util.Scanner;

public class PrintNumberTillN{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the range: " );
int n = sc.nextInt();

int cnt = 1;

while(cnt <= n){
	System.out.println(cnt);

	cnt++;
    }
   }
 }