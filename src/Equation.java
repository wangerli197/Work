import java.util.Random;
public class Equation{
	int first;
	int second;
	int chars;
	
	public void init(){
		Random r=new Random();//生成相应的随机数
		first=r.nextInt(101);
		second=r.nextInt(101);
		chars=r.nextInt(2);
	}
	
	public int getFirst(){//获取生成的第一个数
		return first;
	}
	
	public int getSecond(){//获取成成的第二个数
		return second;
	}
	
	public int getChars(){//获取对应的符号
		return chars;
	}
	
	public String getMe(){//获取生成的算式
		if(chars==0)
			return ""+first+"-" + second;
		else
			return ""+first+"+" + second;
	}
	
	public int getAnswer(){//获取想要的答案
		if(chars==0)
			return first - second;
		else
		    return first + second;
	}
	
}

