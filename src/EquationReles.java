import java.util.Random;
public class EquationReles extends Equation3{
	int first=0;
	int second=0;
	final int chars=0;
	
	public  void init(){//定义方法init
		Random r=new Random();
		first=r.nextInt(101);
		second=r.nextInt(101);
	}
	
	public int getFirst(){//定义方法getFirst
		return first;
	}
	
	public  int getSecond(){//定义方法getSecond
		return second;
	}
	
	public  int getChars(){//定义方法getChars
		return chars;
	}
	
	public String getMe(){//定义方法getMe
		return ""+first+"-"+second;
	}
	
	public  int getAnswer(){
		return first-second;
	}
}


