public class Exercises{
	Equation[] equs = new Equation[50];
	public void init(){//��ʼ�����е���ʮ����ʽ
		for(int i=0;i<50;i++){
			equs[i] = new Equation();
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
				if(flag==0)//ʽ�ӺϷ�������һ��ʽ��
					break;
				else
					equs[i].init();//���ʽ�Ӳ��Ϸ���������
				}
			}
		}
	
	public void printAll(){//������кϷ���ʽ��
		for(int i=0;i<50;i++){
			System.out.print("  " + equs[i].getMe());
		}
	}
	
	public void printAll(int turn){//������еĺϷ�ʽ�� ÿ�����turn��ʽ��
		for(int i=0;i<50;i++){
			if(turn>0)if(i%turn==0)System.out.print("\n");
				System.out.print("  "+equs[i].getMe());
			}
	}
	
	public void printAnswer(){//������еĴ�
		for(int i=0;i<50;i++){
			System.out.print("%  "+equs[i].getAnswer());
		}
	}
	
	public void printAnswer(int turn){//������еĴ� ÿ�����turn����
		for(int i=0;i<50;i++){
			if(turn>0)if(i%turn==0)System.out.print("\n");
				System.out.print("  " + equs[i].getAnswer());
		}
	}
	
}

