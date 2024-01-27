#include<stdio.h>
#include<stdlib.h>
#define n 3

int queue[n];

int r=-1;
int f=-1;
 


void print(){
    int temp;
temp=f;

while(temp!=r){

printf("the value is %d\n",queue[temp]);
temp++;

}

printf("the value is %d\n",queue[temp]);


}

void dequeue(){

if(f==-1){
printf("Empty\n");

}
else{


if(f==r){

f=r=-1;


}

else{

f=(f+1)%n;

}

}


}
void  enqueue(){
    
int element;
printf("Enter the data\n");
scanf("%d",&element);



if((f==0 && r==n-1)||(r+1)%n==f){

printf("FULL\n");
}

else if(r==-1){
      
      
      f=r=0;
      queue[r]=element;
     



}

else{
      r=(r+1)%n;

      queue[r]=element;
     

}
}

void main(){


 int ch;


 do{
     printf("enter your choice");
     printf("\n1.Enqueue\n2.Dequeue\n3.Print\n4.Exit\n");

     scanf("%d",&ch);
switch(ch){

case 1 :
         enqueue();
         break;

case 2 :
         dequeue();
         break;

case 3 :
         print();
         break;







}

 }while(ch!=4);


}

