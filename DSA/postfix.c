#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>


struct abc {
    
    char data;
    struct abc * next;
    
};

struct abc * top=NULL;
 int precedence(char a){
     
     switch(a){
         
         
         case '^': return 3;
                  break;
        case  '*' : return 2;
                   break;
        case '/'  :   return 2;
        case '+': return 1;
                  break;
         case '-': return 1;
                  break;
     }
     
     
     
 }
 
 
 void push(char op){
     
     struct abc * new;
     new=(struct abc *)malloc(sizeof(struct abc ));
     new->data=op;
     new->next=NULL;
     
     
     if(top==NULL){
         
         top=new;
         
     }
     else{
         new->next=top;
         top=new;
     }
 }   
 char pop(){
     char ch;
     struct abc * temp=NULL;
     if(top==NULL){
         printf("stack is empty\n");
     }
     else if(top->next=NULL){
         
         temp=top;
         ch=temp->data;
         top=NULL;
         free(temp);
     }
     else{
         
          temp=top;
         ch=temp->data;
         top=top->next;
         free(temp);
     }
     
     
     return ch;
 }    
     
     
     
 




 
int main(){
    
    char infix[20];
    char postfix[20];
    
    printf("Enter the expression\n");
    scanf("%s",infix);
    
    int i=0,j=0;
    
    while(infix[i]!='\0'){
        
        if(isalnum(infix[i])){
            
            postfix[j]=infix[i];
            j++;
            
        }
        else{
            
            if(top==NULL){
                
                push(infix[i]);
                
            }
            
            else{
                while(top!=NULL && precedence(top->data)>=precedence(infix[i])){
                postfix[j]=pop();
                j++;
                
                }
                
                push(infix[i]);
                
            }
            
            
            
            
            
            
            
        }
        
        
        
        i++;
        
    }
    
    
    while(top!=NULL){
        
        postfix[j]=pop();
        j++;
    }
    postfix[j]='\0';
    printf("the postfix expression is :\n");
    printf("%s",postfix);
  //  ans(postfix);
    
    
    return 0;
}