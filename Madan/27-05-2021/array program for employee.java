import java.util.Scanner;

public class Array {

public static void main(String[] args) {
int [] rollno = new int[5];
String [] name = new String[5];
int [] phno = new int[5];
int i,j,k;

// int result_1 = RollNo.index(0);
Scanner obj = new Scanner(System.in);
System.out.print("Enter value of RollNo:");
for(i=0;i<5;i++) {
rollno[i] = obj.nextInt();
}
System.out.print("Enter value of Name:");
for(j=0;j<5;j++) {
name[j] = obj.next();
}
System.out.print("Enter value of Mobno:");
for(k=0;k<5;k++) {
phno[k] = obj.nextInt();
}
System.out.println("Enter number ");
int n = obj.nextInt();

switch(n)
{
case 1:
System.out.println("Enter the roll number to search:");
int a =obj.nextInt();

for(int y=0;y<5;y++)
{
if(a==rollno[y]) {
// System.out.println(i);

System.out.println("Rollnumber:"+rollno[y]+"\n Name:"+name[y]+"\n Phone Number:"+phno[y]);

break;
}

}
break;
case 2:
System.out.println("Enter the name to search:");
String b= obj.next();
for(int y=0;y<5;y++)
{
if(b.equalsIgnoreCase(name[y])) {
// System.out.println(i);

System.out.println("Rollnumber:"+rollno[y]+"\n Name:"+name[y]+"\n Phone Number:"+phno[y]);

break;
}

}
break;

case 3:
System.out.println("Enter the phone number to search:");
long ph = obj.nextLong();
for(int y=0;y<5;y++)
{
if(ph == phno[y]) {
// System.out.println(i);

System.out.println("Rollnumber:"+rollno[y]+"\n Name:"+name[y]+"\n Phone Number:"+phno[y]);

break;
}

}
break;

default:
System.out.println("Invalid number");
}


}}




