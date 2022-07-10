import java.util.Scanner;
class MissingNumberFinder {
public static void main(String[] args) {
try (Scanner in = new Scanner(System.in)) {

    System.out.println("Enter array size");
    int size = in .nextInt();
    int[] arr = new int[size-1];
    System.out.println("Enter array numbers between 1 and " + size);
    for(int i=0;i<size-1;i++)
    arr[i] = in.nextInt();
    System.out.println(missingNumberFinder(arr, size));
}
}
static int missingNumberFinder(int arr[], int n) {
// write your code here
int sum = 0;
int arraysum = 0; 
int result = 0;

for(int i=1;i<n+1;i++)
 {
     sum = sum + i;
 }
 
 for(int i=1;i<n;i++)
{
    arraysum = arraysum + arr[i-1];
}
  
result = sum - arraysum; 
 
return result;
}
}