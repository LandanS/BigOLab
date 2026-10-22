import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        ArrayList< Integer > data = new ArrayList<>();

        data.add( 13 );
        data.add( 3 );
        data.add( 32 );

        // sort so the smallest number is first
        Collections.sort( data );

        for ( Integer n : data ) {
            System.out.println( "Item: " + n );
        }
    }
}