package E_Voting;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class myObjectOutputStream extends ObjectOutputStream{
	
	myObjectOutputStream() throws IOException{
		super();
	}
	myObjectOutputStream(OutputStream o) throws IOException{
	        super(o);
	    }
	 
	public void writeStreamHeader() throws IOException{
	        return;
	    }
}