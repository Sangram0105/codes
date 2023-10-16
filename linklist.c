#include<stdio.h>
#include<stdlib.h>
struct abc{
    int data;
    struct abc *next;
};
void main(){
struct abc *head;
int n;
printf("Enter the number of nodes \n");
scanf("%d",&n);
head=(struct abc*)malloc(sizeof(struct abc));
printf("enter the data\n");
scanf("%d",&head->data);
head->next=NULL;

insert(head,n);
//display(head);
//insertE(head);
//display(head);
//insertM(head);
//display(head);
DeleteB(head);
display(head);
}
void insert(struct abc * head,int n){
struct abc* new;
struct abc * temp;

 temp = head;
  for (int i = 0; i < n - 1; i++)
    {
      new = (struct abc *) malloc (sizeof (struct abc));
      printf ("Enter data %d\n", i + 2);
      scanf ("%d", &new->data);
      
      new->next = NULL;
      temp->next = new;
      temp = temp->next;
    }
}
void insertM(struct abc*head){
    struct abc *temp;
    struct abc *new;
    struct abc *a;
    int i=1,p;
    temp=head;
    a=head->next;
printf("Enter after which node new node is inset\n");
scanf("%d",&p);
 new = (struct abc *) malloc (sizeof (struct abc));
      printf ("Enter data \n");
      scanf ("%d", &new->data);
      
      new->next = NULL;
while(temp->data!=p){
    
   
        temp=temp->next;
    a=a->next;
}
temp->next=new;
new->next=a;
}
void insertE(struct abc *head){
    struct abc* temp;
    temp=head;
   struct abc *new;
    new = (struct abc *) malloc (sizeof (struct abc));
      printf ("Enter data \n");
      scanf ("%d", &new->data);
      
      new->next = NULL;
      while(temp->next!=NULL){
        temp=temp->next;
      }
      temp->next = new;
}
display(struct abc *head){
    struct abc *temp;
    temp=head;
    while(temp!=NULL){
        printf("the data is %d\n",temp->data);
        temp=temp->next;
    }
}
DeleteB(struct abc *head){
    struct abc *temp;
    temp=head;
   
    temp=temp->next;
    free(temp);
    temp->next=head;
}