class Array{
  
  int a[];
  int size;
  int Top1,Top2;
  
  Array(int s){
    size=s;
	Top1=-1;
	Top2=s-50;
	a=new int[size];
  
  }
  
  void push1(int a4){
     a[++Top1]=a4;
  
  }
   void push2(int a1){
      
    a[++Top2]=a1;
  }
  
  int pop1(){
  
  int r=a[Top1];
  Top1--;
  return r;
  
  }
  int pop2(){
  
  int r1=a[Top2];
  Top2--;
  return r1;
  
  }
  

public static void main(String [] args){

Array a=new Array(100);
a.push1(5); 
a.push2(10); 
a.push2(15); 
a.push1(11); 
a.push2(7); 
a.push2(40);

System.out.println("Popped element from stack1 is "+a.pop1());
System.out.println("Popped element from stack1 is "+a.pop2());
}
}