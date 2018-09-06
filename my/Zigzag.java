import java.util.Scanner;
class Zigzag{
private static int ZigZag(int[] array){
	int count=0;
        if(array.length == 1){
            return 1;
        }
        int[] diff = new int[array.length-1];
        for(int i = 1; i < array.length; i++){
            diff[i-1] = array[i] - array[i-1];
        }
        int[] Memo = new int[diff.length];
        Memo[0] = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < diff.length; i++){
            if(diff[i] > 0){
                for(int j = 0; j < i; j++){
                    if(diff[j] < 0){
                        max = Math.max(max, Memo[j]);
                    }
                   
                }
                 count+=1;
            }else if(diff[i] < 0){
                    for(int j = 0; j < i; j++){
                        if(diff[j] > 0){
                            max = Math.max(max, Memo[j]);
                        }
                        
                    }
                     count+=1;
             }else{
                   max = 0;
            }
            Memo[i] = max + 1;
         }
         if(count==max){
         	System.out.println("Zigzag sequence");
         }
         else{
         	System.out.println("Longest Zigzag sequence is :"+max);
         }
        return max;

     }
public static void main(String[] args) {
	//int A[] = { 7,4,9,2,10,8,9,3,17,6,28,3,26,12,15,1,3};
	Scanner scan = new Scanner(System.in);
 
		System.out.print("Enter Number of element in array: ");
		int numOfFriends = scan.nextInt();
		int arrayOfNames[] = new int[numOfFriends];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter element " + (i+1) + " : ");
		        arrayOfNames[i] = scan.nextInt();
		}
    ZigZag(arrayOfNames); 
}
}