/*
Print the following pattern for the given N number of rows..
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
*/

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=i; j>0; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	
// OR
    /*
    int currRow=1;
		while(currRow<=n){
			int currCol=currRow;
			while(currCol>0){
				System.out.print(currCol);
				currCol--;
			}
			System.out.println();
			currRow++;
		}
    */
		
	}

}
