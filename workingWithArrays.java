import java.util.Arrays;

public class workingWithArrays {
    public static void main(String[] args) {
        char vowel[] = new char[5];

        // a e i o u
        vowel[0] = 'a';
        vowel[1] = 'e';
        vowel[2] = 'i';
        vowel[3] = 'o';
        vowel[4] = 'u';

        System.out.println(vowel);
        System.out.println(Arrays.toString(vowel));

        // sorting arrays
        char toSortArrays[] = {'z', 't', 'f', 'c', 'e', 'y', 'b'};

        // using Arrays.sort() method
        Arrays.sort(toSortArrays);
        System.out.println("Using sort() method");
        System.out.println(Arrays.toString(toSortArrays));

        // sort only some of the values in an array
        char toSortArrays1[] = {'z', 't', 'f', 'c', 'e', 'y', 'b'};
        int startIndex = 2;
        int endIndex = 6;
        Arrays.sort(toSortArrays1, startIndex, endIndex);
        System.out.println("sorted some valus by index");
        System.out.println(Arrays.toString(toSortArrays1));

        int number[] = {1, 2, 3, 4, 5};

        int copyOfNumbers[] = Arrays.copyOf(number, number.length);

        Arrays.fill(number, 9);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(copyOfNumbers));

        int arraysOfNum[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0; i < arraysOfNum.length; i++){
            System.out.println(arraysOfNum[i]); 
            sum += arraysOfNum[i];          
        }
       
            System.out.println(sum);

            int table = 5;

            for (int mul = 1; mul <= 10; mul++){
                System.out.printf("%d X %d = %d \n", table, mul, table * mul);
            }

            int anotherArray[] = {1, 2, 3, 4, 5};

            for(int anotherNumber : anotherArray){
                System.out.println(anotherNumber);
            }

    }
    
}
