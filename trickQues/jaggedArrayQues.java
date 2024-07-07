import java.util.*;
class jaggedArrayQues{
    public static void main(String args[]){
        int array[][]= new int[2][];
        array[0][0]=0;
        array[0][1]=1;
        array[0][2]=2;
        array[1][0]=0;
        array[1][1]=10;
        array[1][2]=20;

        System.out.print(array[0][0]);
        /*In your jaggedArrayQues class, you are getting a NullPointerException because you are trying to access and assign values to elements in an uninitialized subarray of a jagged array. Here's a detailed explanation:

        Initialization of Jagged Array:
        When you create a jagged array with new int[2][], you are creating an array with two elements, each of which can be an array of integers. However, the inner arrays are not initialized yet.

        Accessing Uninitialized Subarrays:
        You attempt to assign values to array[0][0], array[0][1], etc., but array[0] and array[1] are null at this point because they have not been initialized. Attempting to access an element of a null array results in a NullPointerException. */

    }
}