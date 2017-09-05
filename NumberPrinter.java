import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

class NumberPrinter{

    LinkedList<Integer> ll;

    NumberPrinter(){
        Random rand = new Random();
        ll = new LinkedList<Integer>();
        
        for(int i=0; i<10; i++){
            ll.add(rand.nextInt(100) + 1);
        }

        doStuff();
    }

    private void doStuff(){

        Random rand = new Random();
        LinkedList <Integer>myLinkedList = new LinkedList<>();
        for(int i=0; i<10; i++){
            myLinkedList.add(rand.nextInt(100) + 1);
            Collections.sort(myLinkedList);
            System.out.println(myLinkedList.toString());
        }
    }




    public static void main(String [] args){
        new NumberPrinter();	
    }

}
