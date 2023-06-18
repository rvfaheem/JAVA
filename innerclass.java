import java.util.Scanner;
class Students
{
String name;
int rollno,mark;
Students()
{
Scanner sc=new Scanner(System.in);


System.out.println("Student Details");
System.out.println("Enter Name");
name=sc.next();
System.out.println("Enter RollNo");
rollno=sc.nextInt();
System.out.println("Enter Mark");
mark=sc.nextInt();
}
void display()
{
System.out.println("Student name is "+name);
System.out.println("student rollnoumber is"+rollno);
System.out.println("Student mark is "+mark);
}
class Sports
{
String name;
int points;
Sports()
{
Scanner n=new Scanner(System.in);
System.out.println("Sports name");
name=n.next();
System.out.println("points");
points=n.nextInt();
}
void display()
{
System.out.println("Sports name is:"+name);
System.out.println("Activity Points"+points);

}
}
}
class Main
{
public static void main(String args[])
{
Students a=new Students();a.display();
a1.display();
}
}

Students.Sports a1=a.new Sports();