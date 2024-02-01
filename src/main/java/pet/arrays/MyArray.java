package pet.arrays;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import pet.Settings;

import java.util.Arrays;
import java.util.Random;

@Data
@Slf4j
public class MyArray {

    private long[] array;
    private int elements;

    private final int capacity;


    private final long range = Settings.ARRAY.range();

    MyArray(int capacity){

        array = new long[capacity];
        this.capacity = capacity;
        this.elements = 0;
    }

    //Iterates over array elements
    public int find(long searchElem){

        int i;

        for(i = 0; i < elements; i++ )
            if(array[i] == searchElem)
                break;
        if(i == elements)
            i = -1;
        return i;
    }

    public void insert(long newElem){
        array[elements] = newElem;
        elements++;
    }

    public void display(){
        for(long element : array)
            System.out.print(element+" ");
    }

    //Inserts random values in range defined in Settings enum

    public void fillRandom(){
        for(int i = 0; i < capacity; i++) {
            long n = (long) (Math.random()*range);
            insert(n);
        }
        //log.info("Array was filled with random numbers : "+ Arrays.toString(array));
    }
}
