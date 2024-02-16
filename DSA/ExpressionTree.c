#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>
struct abc {
    struct abc *left,*right;
    char data;
};
//  struct abc *root=NULL;
struct abc * stack[20];
int top=-1;

void inorder(struct abc *root){

    if(root==NULL){
        return;
    }
    else{
        if(root!=NULL){
            inorder(root->left);

        }
        printf("%c",root->data);
        inorder(root->right);
    }
}
void inordert(struct abc *root){
struct abc * stack[10];
int top=-1;
struct abc *current=root;

    while(current!=NULL || top!=-1){

        while(current!=NULL){
            stack[++top]=current;
            current=current->left;

        }
        current =stack[top--];
        printf("%c ",current->data);
        current=current->right;
    }
}
void push(struct abc *root){
    top++;
    stack[top]=root;

}
struct abc *pop(){

return stack[top--];

}
void operand(char a){

    struct abc *root=NULL;

    root=(struct abc *)malloc(sizeof(struct abc ));
    root->data=a;
    root->left=NULL;
    root->right=NULL;

    push(root);
}



void operator(char a){
 struct abc *root=NULL;

    root=(struct abc *)malloc(sizeof(struct abc ));
    root->data=a;
    root->left=NULL;
    root->right=NULL;

    root->left=pop();
    root->right=pop();

    push(root);
}
void main(){
  char postfix[20];
    printf("ENter the postfix exprission :-\n");
    scanf("%s",postfix);
int i=0;
    while(postfix[i]!='\0'){


        if(isalnum(postfix[i])){

            operand(postfix[i]);

        }
        else{
            operator(postfix[i]);
        }
    i++;
    }

printf("The Expression is :-\n");
inordert(stack[top]);
}

