import java.util.Arrays;
public class MissingNumber{
public static int missingNumber(int [] array){

		int count;
		for( count = 0; count < array.length; count++){
		
			if(array[count] != count + 1 ){

				return count + 1;

}
}
return array.length + 1;
}
		public static void main(String...args){

int [] number ={1,2,3,4};
	
System.out.println(missingNumber(number));

}
}