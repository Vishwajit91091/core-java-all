package optionalclasses;

import java.util.Optional;

public class OptionalClasses
{
	//using to deal with NullPointerExceptions in java programs
	
	void meth1()
	{
		String arr[]=new String[5];
		arr[1]="Kishan";
		arr[2]="Java";
		//System.out.println(arr[0].toUpperCase()); //NPE 
		Optional<String> o=Optional.ofNullable(arr[0]);
		System.out.println("===>"+o);
		if(o.isPresent()) {
			System.out.println("Data Is Present");
			System.out.println(o.get());
		}
		else {
			System.out.println("Data Is Not Present");
		}
		
	}

	public static void main(String[] args) 
	{

		new OptionalClasses().meth1();
	}

}
