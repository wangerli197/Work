import java.util.Random;
public class Exercises4{
	Equation3[] equs = new Equation3[1000];
	public void init(int count){//��ʼ��������ʽcount������ʽ�ĸ���
		for(int i=0;i<count;i++){
			Random r=new Random();
			if(r.nextInt(2)==0)
				equs[i]=new EquationReles();
			else
				equs[i]=new EquationAdd();
				equs[i].init();
			while(true){
				int flag=0;
				for(int j=0;j<i;j++){
					if(equs[i].getFirst()==equs[j].getFirst())//��һ�������
						if(equs[i].getSecond()==equs[j].getSecond())//�ڶ�����Ҳ���
							if(equs[i].getChars()==equs[j].getChars()){//������ͬ
								flag=1;
								break;
							}
					}
					if(equs[i].getAnswer()>100||equs[i].getAnswer()<0){//�жϴ��Ƿ���0��100֮��(��0��100)
						flag=1;
					}
					if(flag==0)//ʽ�ӺϷ�������һ��
						break;
					else
						equs[i].init();//���ʽ�Ӳ��Ϸ���������
				}
			}
	}
			
	public void init(int count,int charsL){//��ʼ��������ʽcount������ʽ���� charsL�������
		for(int i=0;i<count;i++){
			if(charsL==0)
				equs[i]=new EquationReles();
			else
				equs[i]=new EquationAdd();
				equs[i].init();
			while(true){
				int flag=0;
				for(int j=0;j<i;j++){
					if(equs[i].getFirst()==equs[j].getFirst())//��һ�������
						if(equs[i].getSecond()==equs[j].getSecond())//�ڶ�����Ҳ���
							if(equs[i].getChars()==equs[j].getChars()){//������ͬ
								flag=1;
								break;
							}
					}
					if(equs[i].getAnswer()>100||equs[i].getAnswer()<0){//�жϴ��Ƿ���0��100֮��(����0��100)
						flag=1;
					}
					if(flag==0)//ʽ�ӺϷ�������һ��
						break;
					else
						equs[i].init();//���ʽ�Ӳ��Ϸ���������ʽ��
				}
			}
	
	}
	
	public void printAll(){//������еĺϷ�ʽ��
		for(int i=0;i<50;i++){
			System.out.format("%10s",equs[i].getMe());
		}
	}
	public void printAll(int turn){//������е�ʽ�� ÿ�����turn��ʽ��
		for(int i=0;i<50;i++){
			if(turn>0)if(i%turn==0)System.out.print("\n");
				System.out.format("%10s",equs[i].getMe());
		}
	}
	
	public void printAnswer(){//������еĴ�
		for(int i=0;i<50;i++){
			System.out.format("% 4d",equs[i].getAnswer());
		}
	}
	
	public void printAnswer(int turn){//������д� ÿ�����turn����
		for(int i=0;i<50;i++){
			if(turn>0)if(i%turn==0)System.out.print("\n");
				System.out.format("% 4d",equs[i].getAnswer());
		}
	}
}

