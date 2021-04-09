package homework.lesson;

public class HomeWorkYouSumNoInt {

    public static void main(String[] args){

        // mass {1,2,3}
        // console {1}
        // console {1,3,6}

        int [] numbers = new int [3];//mass {1,2,3}
        
        for(int i = 0; i < numbers.length; i++){// mass number
            numbers[i] = i+1;
        }

        System.out.println(numbers[0]);// 1 st elemet mass
        
        for(int j = 0 ;j < numbers.length ;j++){
            int result = numbers[j];
            System.out.println(result);
            for(int i = j+1; i < numbers.length;i++){
                result = result + numbers[i];
                j = numbers.length -1;
                System.out.println(result);
            }
        }


    }
}
