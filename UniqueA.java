import java.util.Arrays;
public class UniqueA{
public static int[] unique(int [] array){

		int uniqueNumber = 0;
		for(int count = 0; count < array.length; count++){
			for(int counter = count + 1; counter < array.length; counter ++){
			if(array[count] == array[counter]){
				
				uniqueNumber++;

}
}
}
		int index = 0;
		int [] nums = new int[uniqueNumber];
		for(int count = 0; count < array.length; count++){
			for(int counter = count + 1; counter < array.length; counter ++){
			if(array[count] == array[counter]){
				
				nums[index++] = array[count];


}
}
}
return nums;
}
public static void main(String...args){

int [] number ={1,2,2,3,4,4,5,5,6,7};
	
System.out.println(Arrays.toString(unique(number)));

}
}