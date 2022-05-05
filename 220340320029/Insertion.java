import java.util.*;
class Insertion{


static void sort(int a[], int s2){

   int s1=s2-1;
   
 int s=s1;
    
	int temp=a[s];
	  int b=s1-1;
	  while(b>=0 && a[b]>temp){
	   a[b+1]=a[b];
	   b--;
	   for(int i=0;i<s2;i++)
	   System.out.print(a[i]+" ");
        System.out.println("");
	    }
		a[b+1]=temp;
		for( int i1=0;i1<s2;i1++)
		System.out.print(a[i1]+" "); 


}


   

public static void main(String [] args){

  int n=5;
  int []a1={2,4,6,8,3};
  sort(a1,5);
}


}