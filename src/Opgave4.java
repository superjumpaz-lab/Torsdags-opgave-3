public class Opgave4 {

    int calculateAverage(int[] numbers){
        int sum = 0;
        int average = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            average = sum / numbers.length;
        }
        return average;
    }

    /*int calculate(int[] numbers){
        int sum = 0;
        int average = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
     */

    int findMax(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

    int findMin(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

    int countAboveAverage(int[] numbers){
        int count = 0;
        int aboveAverage = calculateAverage(numbers);
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > aboveAverage){
                count++;
            }
        }
        return count;
    }

    void printAllStats(int[] numbers){
        System.out.println("The average number is: " + calculateAverage(numbers));
        System.out.println("The highest number is: " + findMax(numbers));
        System.out.println("The lowest number is: " + findMin(numbers));
        System.out.println("Numbers over average: " + countAboveAverage(numbers));
    }







    void main(){
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        printAllStats(numbers);


    }











}
