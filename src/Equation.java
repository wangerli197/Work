import java.util.Random;
public class Equation{
	int first;
	int second;
	int chars;
	
	public void init(){
		Random r=new Random();//������Ӧ�������
		first=r.nextInt(101);
		second=r.nextInt(101);
		chars=r.nextInt(2);
	}
	
	public int getFirst(){//��ȡ���ɵĵ�һ����
		return first;
	}
	
	public int getSecond(){//��ȡ�ɳɵĵڶ�����
		return second;
	}
	
	public int getChars(){//��ȡ��Ӧ�ķ���
		return chars;
	}
	
	public String getMe(){//��ȡ���ɵ���ʽ
		if(chars==0)
			return ""+first+"-" + second;
		else
			return ""+first+"+" + second;
	}
	
	public int getAnswer(){//��ȡ��Ҫ�Ĵ�
		if(chars==0)
			return first - second;
		else
		    return first + second;
	}
	
}

