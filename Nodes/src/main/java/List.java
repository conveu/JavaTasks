class ListElement<E>{

 ListElement next;
 E data;

}

 public class List<E>{

  public ListElement<E> head;
  public ListElement<E> tail;


  public void addLast(E data){

  ListElement a = new ListElement();
  a.data = data;

  if (tail == null){
  head = a;
  tail = a;
 }else{
  tail.next = a;
  tail = a;
 }

 }


 /////////////

 void printList(){

  ListElement t = head;
  while(t!=null){
   System.out.print(t.data + " ");
   t = t.next;
  }
 }


  public int count(){
   int i=0;
   ListElement t = head;
   while(t!=null){
    t = t.next;
    i+=1;
   }
   System.out.println();
   System.out.println(i);;
   return(i);
  }
 ///////////////


  public E get(int Index){
   ListElement<E> t = (ListElement<E>) head;
   for(int i=0;i<Index;i++)
    t=t.next;

   //System.out.print(t.data);
   return t.data;
   }

   public boolean isEmpty(){
    return head==null;
  }

   public void remove(int Index){

    if(isEmpty()!=true){
    ListElement t = head;
    if(Index!=1){
    for(int i=0;i<Index-1;i++)
     t=t.next;
    t.next=t.next.next;}
    else {
     head = t.next;
    }
    }
    else throw IndexOutOfBoundsException;
   }



   ///////////////////



  public void add(int Index,E data){
   ListElement t = head;
   ListElement oldelem = new ListElement();
   ListElement newelem = new ListElement();
   if(Index!=1) {
    for (int i = 0; i < Index; i++){
     t = t.next;
    }
    newelem.data=t.data;
    newelem.next=t.next;
    t.next=newelem;
    t.data=data;
   } else {
    newelem.data=head.data;
    newelem.next=head.next;
    head.next=newelem;
    head.data=data;


   }
  }

  }




