import java.util.Arrays;
public class LotteryTicketLargestNumber{

public static void main(String...args){
      int [] [] lotteryCard = { {20,15,7},
                                {8,7,19},
                                {7,13,47}
           };
for (int i =0; i <3; i++){
   int max = lotteryCard[i][0];
 for(int j = 1; j <3; j++){
     if  (lotteryCard[i][j] > max){

  max = lotteryCard[i][j];
 }
}
System.out.println(max);
}
   }
}
