
public class Amstrong {

	public static void main(String[] args) {
			 int num=153;int sum1=0;
       String num1=Integer.toString(num);
       // to check the number is amstrong or not 
       int count=0;
       for(int i=1;i<=num1.length();i++) {
    	  count+=1;
       }
       System.out.println(count);
       while(num>0) {
    	   int r=num%10;
    		 sum1= (int) (sum1+(Math.pow(r,count)));
    		 num=num/10;
    	
       }
       System.out.println(sum1);
      
       

	}



}
