#include<stdio.h>
#include<stdlib.h>
int i=-1;
struct abc 
{
    int data ;
    struct abc *next;
};


void main(){
    int n,c;
    struct abc *top;
    printf("Enter the number of nodes\n ");
    scanf("%d",&n);
    top=(struct abc*)malloc(sizeof(struct abc));
    printf("enter the data\n");
    scanf("%d",&top->data);
    top->next=NULL;

    
    push(n,top);

  // printf("after pop\n");
    pop(top);
   // printf("%d\n",c);
    peak(top);
}
void push(int n,struct abc * top){
       struct abc *new;
       int y=n-1;
      /* if()
       {
        printf("Overflow\n");
       }
       else{
        new=(struct abc *)malloc(sizeof(struct abc ));
        printf("Enter the data\n");
        scanf("%d",&new->data);
       new->next=NULL;
       top->next=new;
       if(top==NULL){
        new=top;
        i++;
       }
       else{
        new->next=top;
        new=top;
        i++;
       }

       }*/
       while(y--){

new=(struct abc *)malloc(sizeof(struct abc ));
        printf("Enter the data\n");
        scanf("%d",&new->data);
       new->next=NULL;
       top->next=new;
        if(top==NULL){
        new=top;
        
       }
       else{
        new->next=top;
        new=top;
    
       }
       }
       
      
       
}
void  pop(struct abc * top){
    struct abc *temp;
    temp=top;
    int b;
    if(temp==NULL){
        printf("underflow\n");

    }
    else{
        b=temp->data;
       temp= temp->next;
       free(temp);
       

    }
    printf(" the poped data is %d\n",b);
    
    
}
void peak(struct abc * top){
    struct abc*temp;
    temp=top;
  
    while(temp->next=NULL){
        printf(" the peak data is  %d\n",temp->data);
    }
    
}