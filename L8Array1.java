import java.util.Scanner;
public class L8Array1 {
//   // Java Program to find sum of elements in a given array
// // 	static int arr[] = { 12, 3, 4, 15 };

// // 	// method for sum of elements in an array
// // 	static int sum()
// // 	{
// // 		int sum = 0; // initialize sum
// // 		int i;

// // 		// Iterate through all elements and add them to sum
// // 		for (i = 0; i < arr.length; i++)
// // 			sum += arr[i];

// // 		return sum;
// // 	}

// // 	// Driver method
// // 	public static void main(String[] args)
// // 	{
// // 		System.out.println("Sum of given array is "
// // 						+ sum());
// // 	}
// // }



// //Read an array of length N and print the max of all the elements

// public static void main(String[] args) {
// 	Scanner scn = new Scanner(System.in);
// 	int n = scn.nextInt();
//   int arr[] = new int[n];

  

//   for(int i=0; i<n; i++) {
//     arr[i]= scn.nextInt();
  
//   }


//   int max= Integer.MIN_VALUE;

//   for(int i=0; i<n; i++) {
//     if(arr[i]>max) {
//       max=arr[i];
//     } else {

//     }
//   }
//   System.out.println(max);
// }
// }



public static void main(String[] args) {
  int a=10;
  int b=20;
  swap(a,b);
  System.out.println(a);
  System.out.print(b);
}
public static void swap(int a, int b) {
  int temp =a;
  a=b;
  b=temp;
}
}