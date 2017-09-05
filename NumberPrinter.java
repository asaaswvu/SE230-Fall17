import java.util.LinkedList;
import java.util.Random;
import java.util.*;

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

        Collections.sort(ll); // sorts the linked list in ascending order

	for(int i = 0; i<ll.size(); i++){

		System.out.println(ll.get(i));
	}
       
    }




    public static void main(String [] args){
        new NumberPrinter();	
    }

}
