package question1;

public class generic<g> {
	   private g value;

	   public generic(g value) {
	      this.value = value;
	   }

	   public g getValue() {
	      return value;
	   }

	   public static void main(String[] args) {
		   generic<Integer> gen = new generic<>(10);
		   // generics enable us to assign any type values, i.e; first we used return type as integer
	      System.out.println("Integer value: " + gen.getValue());
	      

	      generic<String> gen2 = new generic<>("Hello");
	      // here we used return type as string
	      System.out.println("String value: " + gen2.getValue());
	   }
	}
