import java.util.Arrays;
public class TwoD{
public static int[][] rearrange(int [][] array){


		int [][] nums = new int[3][2];
		for(int count = 0; count < array.length; count++){
			for(int counter = 0; counter < array[count].length; counter ++){
			nums[counter][count] = array[count][counter];
				

}
}

return nums;
}

public static void main(String...args){

int [][] number ={
			{1,2,3},
			{4,5,4}
				};
int [][] result = rearrange(number);
for(int [] row: result){



System.out.println(Arrays.toString(row));
}
}
}