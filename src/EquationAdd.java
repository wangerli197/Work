import java.util.Random;
public class EquationAdd extends Equation3{
	int first=0;
	int second=0;
	final int chars = 1;
	public  void init(){
	Random r = new Random();
	first = r.nextInt(101);
	second = r.nextInt(101);
}
	public int getFirst(){
        return first;
    }

    public  int getSecond(){
	    return second;
    }

    public  int getChars(){
	   return chars;
    }

    public String getMe(){
	   return ""+first+"+" + second;
    }

    public  int getAnswer(){
		return first + second;
	}
}


