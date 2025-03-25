import java.util.Arrays;
public class LotteryTicketSum{

public static void main(String...args){
      int [] [] lotteryCard = { {20,15,7},
                                {8,7,19},
                                {7,13,47}
           };
int totalSum = 0;
 for (int i = 0; i < 3 ; i++){
int sum = 0;


   for (int j = 0; j < 3; j ++){
      sum += lotteryCard[i][j];
    totalSum += sum;
 }
System.out.println("sum of column " + (i + 1) + ": " + sum);

}
System.out.println("total sum of array is: " + totalSum);

   }
}
