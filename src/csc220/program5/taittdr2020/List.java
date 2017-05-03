//Name:Donovan Taitt
//Date: 5/3/2017
//Class: This "List" class is my personal class that contains a remove method and
//addBeforeNextMethod which gives the character it's movement and allows the user 
//to "remove" a point on the character's path.  
package csc220.program5.taittdr2020;

// @author taittdr2020
import csc220.list.AddIterator;
import csc220.list.Node;
import csc220.program5.taittdr2020.List;

public class List<E> extends csc220.list.List<E> { 
       
   @Override
   public AddIterator<E> addIterator(){return new ListAddIterator<>();}
   
   
   //  This nested class replaces the one in csc220.list.List
   protected class ListAddIterator<T extends E> extends csc220.list.List<E>.ListAddIterator<E> {
       
       private static final boolean DEBUGGING = true;
      
        protected Node<E> prevNode = null;
        
        @Override
        public E next() {
            prevNode = nextNode;
            return super.next();
        }

        // For debugging purposes.
        private void printNodes(String s) {
            if (!DEBUGGING)
                return;
            System.out.print(s);
            if (prevNode != null) {
                //System.out.print(" --previous data = " + prevNode.data);
            }
            if (nextNode != null) {
                //System.out.print("\nNEXT NODE -" + nextNode.data + "\nFIRST NODE -" + first.data + "\nPREV NODE -" + prevNode.data + "\nLAST NODE -" + last.data);   //100, 50 xy     
            }
            if( nextNode == null){
                System.out.println(" it's null ");
            }
            System.out.println("");
        }
        
        @Override 
        public void addBeforeNext(E e) {
            printNodes ("(taittdr2020)Add Under Construction");
            Node<E> tmp = new Node<>();
            tmp.data = e;
            
            if (nextNode != null) {
                if(first.data.equals(nextNode.data)){    
                    first.next = tmp;
                    tmp.next = nextNode;
                }
                else{ 
                    prevNode.next = tmp; 
                    tmp.next = nextNode;
                }
            }else{ 
                prevNode.next = tmp;
                tmp.next = nextNode;
            }
        }
        
        @Override
        public void remove() {
            printNodes("(taittdr2020)Remove under construction");
//            Node<E> temp = new Node<>();
//            while(temp != prevNode) {
//                temp = prevNode;
//            }
//            if(first == prevNode) {
//                first = nextNode;
//                prevNode = null;
//            }
//            if(prevNode == nextNode) {
//                temp.next = nextNode;
//                prevNode = null;
//            }
//            
//            if (last == prevNode) {
//                last = nextNode;
//                prevNode = null;
//            }
        if (prevNode != first && prevNode != null){
            Node<E> tmp = first;
            while (tmp.next != prevNode){
                tmp = tmp.next;
            }
                tmp.next = nextNode;
        }
        else {
            prevNode = prevNode.next;
            first = prevNode;
        }
        prevNode = null;
        
        }
     }
   
   
}

