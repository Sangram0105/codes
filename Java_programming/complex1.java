import java.util.*;
public class aaa {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
float num1,num2,num3,num4;
int ch ;
        complex cal =new complex();

       do{
           System.out.println("Enter Your choice :-");
           System.out.println("1.ADDITION\n2.SUB\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT\n");
           ch =sc.nextInt();

           switch(ch){
case 1 :  System.out.println("Enter first number:-\n");
         System.out.println("Enter real part :-\n");
         num1 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num2 =sc.nextFloat();
         System.out.println("Enter SECOND  number:-\n");
         System.out.println("Enter real part :-\n");
         num3 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num4 =sc.nextFloat();
         complex o1=new complex(num1,num2);
         complex o2=new complex(num3,num4);
         cal.addnumber(o1,o2);
         break;
         case 2 :  System.out.println("Enter first number:-\n");
         System.out.println("Enter real part :-\n");
         num1 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num2 =sc.nextFloat();
         System.out.println("Enter SECOND  number:-\n");
         System.out.println("Enter real part :-\n");
         num3 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num4 =sc.nextFloat();
         complex o3=new complex(num1,num2);
         complex o4=new complex(num3,num4);
         cal.sustraction(o3,o4);
         break;
         
         case 3 :  System.out.println("Enter first number:-\n");
         System.out.println("Enter real part :-\n");
         num1 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num2 =sc.nextFloat();
         System.out.println("Enter SECOND  number:-\n");
         System.out.println("Enter real part :-\n");
         num3 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num4 =sc.nextFloat();
         complex o5=new complex(num1,num2);
         complex o6=new complex(num3,num4);
         cal.multiplication(o5,o6); 
         break;  
         case 4 :  System.out.println("Enter first number:-\n");
         System.out.println("Enter real part :-\n");
         num1 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num2 =sc.nextFloat();
         System.out.println("Enter SECOND  number:-\n");
         System.out.println("Enter real part :-\n");
         num3 =sc.nextFloat();
         System.out.println("Enter imag part :-\n");
         num4 =sc.nextFloat();
         complex o7=new complex(num1,num2);
         complex o8=new complex(num3,num4);
         cal.division(o7,o8);        
         break;
           }
       }while(ch!=5);

    }
}

class complex{

float imag,real;

complex(){
    this.imag=0;
    this.real=0;
}
    complex (float imag ,float real){
        this.imag =imag ;
        this.real =real;

    }


    void addnumber(complex o1,complex o2){
         float r,i;
         r=o1.real+o2.real;
         i=o1.imag+o2.imag;

         System.out.println("The Addition is : -"+r+ " + "+i+"i" );
    }

    void sustraction(complex o1,complex o2){
        float r,i;
        r=o1.real-o2.real;
        i=o1.imag-o2.imag;

        System.out.println("The Addition is : -"+r+ " - "+i+"i" );
   }
   
   void multiplication(complex o1,complex o2){
    float r,i;
  r=o1.real*o2.real-o1.imag*o2.imag;
  i=o1.imag*o2.real+o1.real*o2.imag;
    System.out.println("The Addition is : -"+r+ " + "+i+"i" );
}

void division(complex o1,complex o2){
    float r,i;
  r=(o1.real*o2.real+o1.imag*o2.imag)/(o2.real*o2.real)+(o2.imag*o2.imag);
  i=(o1.imag*o2.real+o1.real*o2.imag)/(o2.real*o2.real)+(o2.imag*o2.imag);
    System.out.println("The Addition is : -"+r+ " + "+i+"i" );
}




}