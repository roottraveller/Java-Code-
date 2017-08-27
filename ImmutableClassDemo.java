import java.util.*;
import javax.annotation.*;
/*
 * Make class final -> No subclass possible
 * Make all instance veriable final and private
 */
@Immutable
//https://stackoverflow.com/questions/37087809/how-to-find-out-if-a-class-is-immutable
final class ImmutableClass {
	private final int dummyInt;
	private final String dummyName;
	
	ImmutableClass() {
		this.dummyInt = new Random().nextInt(); 
		this.dummyName = "MY STRING"; //(new ImmutableClass()).getClass();
	}
	
	ImmutableClass (int dummyIntIN, String dummyNameIN) {
		this.dummyInt  = dummyIntIN;
		this.dummyName = dummyNameIN;
	}
	
	//NO setter methods for Immutable class
	
	public int getInt(){
		return dummyInt;
	}
	
	public String getString() {
		return dummyName;
	}
}

public class ImmutableClassDemo {
	public static void main(String[] args){
		ImmutableClass obj = new ImmutableClass();
		System.out.println(obj.getClass() + "  " + obj.getInt() + "  " + obj.getString());
	}
}
