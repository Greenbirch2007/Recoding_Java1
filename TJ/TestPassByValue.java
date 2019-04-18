public class TestPassByValue{
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		System.out.println(num1+num2);
		
		
		//调用swap方法
		
		swap(num1,num2);
		System.out.println(num1+num2);
	}
	
	public static void swap(int n1, int n2) {
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping n1 is " + n1+n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println(n1+n2);
	}
}
