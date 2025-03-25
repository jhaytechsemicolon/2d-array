import java.util.Arrays;
public class EveOdd{
	public static int[] even(int [] array){


		int counter = 0;
		for(int count = 0; count < array.length; count++){
			if(array[count] % 2 == 0){
				counter++;



}
}
int index = 0;
int [] nums = new int [counter];
 for (int count = 0; count < array.length; count++){
	if(array[count] % 2 == 0){
	nums[index++] = array[count];		


}
}
return nums;
}

public static int[] odd(int [] array){


		int counter = 0;
		for(int count = 0; count < array.length; count++){
			if(array[count] % 2 != 0){
				counter++;



}
}
int index = 0;
int [] nums = new int [counter];
 for (int count = 0; count < array.length; count++){
	if(array[count] % 2 != 0){
	nums[index++] = array[count];		


}
}
return nums;
}


public static void main(String...args){
int [] number = {1,2,3,4,5,6,7,8,9};

System.out.print(Arrays.toString(odd(number)));
	
	}
}