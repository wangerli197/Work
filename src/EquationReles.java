import java.util.Random;
public class EquationReles extends Equation3{
	int first=0;
	int second=0;
	final int chars=0;
	
	public  void init(){//���巽��init
		Random r=new Random();
		first=r.nextInt(101);
		second=r.nextInt(101);
	}
	
	public int getFirst(){//���巽��getFirst
		return first;
	}
	
	public  int getSecond(){//���巽��getSecond
		return second;
	}
	
	public  int getChars(){//���巽��getChars
		return chars;
	}
	
	public String getMe(){//���巽��getMe
		return ""+first+"-"+second;
	}
	
	public  int getAnswer(){
		return first-second;
	}
}


