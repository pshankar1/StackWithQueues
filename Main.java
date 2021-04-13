import java.util.LinkedList;
import java.util.Queue;
public class Main {
    /********

Making a  Stack !
you have to push values and then 
print the popped(removed elements of stack )

  *********/
  public static void main(String[] args){

    StackCreation stacky = new StackCreation();

    stacky.push(5);
    stacky.push(4);
    stacky.push(8);
    System.out.println("Removed Elements with 2 queues making a stack!");
    System.out.print(stacky.pop()+" ");
    System.out.print(stacky.pop()+" ");
    stacky.push(1);
    System.out.print(stacky.pop()+" ");
    System.out.print(stacky.pop()+" ");
    System.out.print(stacky.pop()+" ");
  }



}
class StackCreation{

/*********
Implementing queue to create stack
firstQ=first queue
secondQ=second queue
***********/
  Queue<Integer> firstQ=new LinkedList<>();
  Queue<Integer> secondQ=new LinkedList<>();
 public void push(int e){
   firstQ.add(e);
 } 
 /*********
Checking if it is Empty 
retunr -1 if it is to stop but if not
remove elements of firstQ into secondQ
***********/
 public int pop(){
   if(firstQ.isEmpty()){
     return -1;
   }

   while(firstQ.size()!=1){
     secondQ.add(firstQ.remove());
   }
  /********

puts the queues through adn assigns it to ss and 
assigns first queue to second, and then second to the filler position
then it returns e(element)
  *********/
   int e=firstQ.remove();
   Queue<Integer> ss=firstQ;
   firstQ=secondQ;
   secondQ=ss;
   return e;
 }
}
