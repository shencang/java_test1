import Text5_interface.Bike;
import Text5_interface.Bus;
import Text5_interface.Person;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       // Test1_grade t1 =new Test1_grade();
        //System.out.println(t1.grade(sc.nextInt()));
       // Text2_display t2 = new Text2_display();
       // t2.display(sc.nextInt());
       // Text3_and t3 =new Text3_and();
      //  System.out.println(  t3.display(5));
       // Rectangle re =new Rectangle(20,10);
      //  System.out.println(re.area());
      //  System.out.println(re.perimeter());
        //Bus b = new Bus();
     //   Bike k = new Bike();
      //  Person p = new Person(b);
      //  p= new Person(k);
        Test6_last t6 =new Test6_last();

        int arr[]=t6.inport();
        System.out.println(t6.findmax(arr)+" "+t6.findmin(arr)+" "+t6.findand(arr)+" "+t6.findaver(arr));




        Date date = new Date();
        System.out.println(date);
    }
}
