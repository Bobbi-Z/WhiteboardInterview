/**
 * given an array of integers, create a method to return the sum of all sub arrays
 * i.e. givenArray = {1, 3, 5, 4}
 * 1
 * 1+3
 * 1+3+5
 * 1+3+5+4
 * 3
 * 3+5
 * 3+5+4
 * 5
 * 5+4
 * 4
 * = 68
 */

public class QOne {

    public static Integer addingSubstrings(Integer[] givenArray){
        int sum = 0;
        int start;
        for (int indexA = 0; indexA < givenArray.length; indexA++){
            start = 0;
            for(int indexB = indexA; indexB < givenArray.length; indexB++){
              start += (givenArray[indexB] * (givenArray.length - indexB));

            }
            sum += start;



        }
        return sum;
    }
}
