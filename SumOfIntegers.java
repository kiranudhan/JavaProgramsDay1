package Day1Problems;

public class SumOfIntegers {

	public static void main(String args[]) {
		int num,sum=0;
		int count=0;
		for(int i=0;i<args.length;i++) {
			try {
			num=Integer.parseInt(args[i]);
			sum=sum+num;
			}catch(NumberFormatException e) {
				count++;
			}
	     }
		     System.out.println("sum:" +sum);
		     System.out.println("Invalid integers are:"+count);

	}

}
