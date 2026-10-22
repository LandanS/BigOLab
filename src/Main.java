import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        ArrayList<Float> source_data = new ArrayList<>();

        // First need to create a PRNG engine
        Random prng = new Random();

        // generate 1000 elements between -1000 and 1000
        int N = 1000;
        for (int i=0; i<N; ++i) {
            source_data.add( prng.nextFloat(-1000.0F, 1000.0F) );
        }

        // verify the correct number of random values were added
        boolean isCorrect = source_data.size() == N;
        System.out.println( "Correct count: " + isCorrect );

        // bonus: guess the average is close to 0
        double sum = 0;
        for ( Float n : source_data ) {
            sum += n;
        }
        double avg = sum / source_data.size();

        //checks avg
        boolean isAvgCorrect = Math.abs( avg ) < 50;
        System.out.println( "Average: " + avg );
        System.out.println( "Average close to 0: " + isAvgCorrect );

    }
}