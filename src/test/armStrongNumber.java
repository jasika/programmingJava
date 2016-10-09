package test;
// 135= (1*1*1*1)+(3*3*3)+(5*5*5)
public class armStrongNumber {
	
public static void main(String [] args){
	System.out.println(isArmStrong(153));
	
}
/*
public static boolean isArmStrong(int n){
	int num =0;	
	while(n!=0){
		n=n%10;
		num = num+(n*n*n);
		
	}
	
	return true;
	
}*/

public static boolean isArmStrong(int num){
int n,sum=0;
int org;
org=num;
while(num!=0)
{
	System.out.println("sum** "+sum+" org "+org);
n = num%10;
sum = sum+(n*n*n);
num=num/10;
}
System.out.println("sum "+sum+" org "+org);
if (sum==org)
return true;
else
return false;


}

}
