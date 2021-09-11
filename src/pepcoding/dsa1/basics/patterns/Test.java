package pepcoding.dsa1.basics.patterns;

 enum Months {
JAN(0),FEB(1),MARCH(2);
	 private int value;
	  Months(int value){
		 this.value = value;
	 }
	 
	 public int getValue() {
		 return this.value;
	 }
	
}
 
 public class Test{
	 public static void main(String[] args) {
		System.out.println(Months.JAN);
		System.out.println(Months.JAN.name());
		System.out.println(Months.JAN.getValue());
	}
 }
