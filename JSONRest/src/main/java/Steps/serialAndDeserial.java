package Steps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
	
	 int i=10,j=20;
	 
	 
}

public class serialAndDeserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Test t1 = new Test();
		
		//Serializing 
		FileOutputStream fos = new FileOutputStream("test.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(t1);
		
		//De-serializing
		FileInputStream fis = new FileInputStream("test.txt");
		
		ObjectInputStream is = new ObjectInputStream(fis);
		
		Test t2 = (Test)is.readObject();
		
		System.out.println(t2.i+" "+t2.j);
		
		
		
	}

}
