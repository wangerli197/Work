import java.util.Random;
public class calcuation{
	static Random r=new Random();
	static int addOrLess(){									//��������� 0��Ϊ+ 1��Ϊ-
		int addOrLess=r.nextInt(2);
		return addOrLess;
	}
	/**
	�����Ժ����������������ȡֵ��Χ��һ����������������������д��������ͬ�ĺ���
	*/
	static int firstCount(){								//���ɵ�һ������
		int firstCount=r.nextInt(101);
		return firstCount;
	}
	static int secondCount(){								//���ɵڶ�������
		int secondCount=r.nextInt(101);
		return secondCount;
	}
	static void creater(int[] chars,int[] first,int[] second,String[] strings,int count){	//������ʽ
		while(true){				
			String linString="";							//��ʱ�ַ�����¼��ǰ���ɵ���ʽ
			chars[count]=addOrLess();
			first[count]=firstCount();
			second[count]=secondCount();					
			linString+=first[count];			
			if(chars[count]==0){							//�ж���ʽ�Ƿ�����100���������Ӽ���
				if(first[count]+second[count]>100)
					continue;
				linString+="+";
				
			}else{
				if(first[count]-second[count]<0)
					continue;
				linString+="-";
			}
			linString+=second[count];
			int flag=0;
			for(int k=0;k<count;k++){						//�ж�ʽ����û���ظ�
				if(strings[k].equals(linString)){
					flag=1;
					break;
				}
			}
			if(flag==1)continue;else{
				strings[count]=linString;
			}
			count++;
			if(count==50)break;							//����50������
		}
	}
	static void printer(int[] chars,int[] first,int[] second,String[] strings,int count){	//���
		for(int k=0;k<10;k++){
			for(int j=0;j<5;j++){
				System.out.format("  ��%2d����ʽ:%7s",k*5+j+1,strings[k*5+j]);
			}
			System.out.println("");
		}
		System.out.format("\n\n");
		for(int k=0;k<10;k++){
			for(int j=0;j<5;j++){
				int answer=0;
				if(chars[k*5+j]==0){						
					answer=first[k*5+j]+second[k*5+j];
				}else{
					answer=first[k*5+j]-second[k*5+j];
				}
				System.out.format("  ��%2d���:%3d",k*5+j+1,answer);
			}
			System.out.println("");
		}
	}
	public static void main(String[] arge){							//������
		int [] chars=new int[50];							//��¼����
		int [] first=new int[50];							//��¼��һ��������
		int [] second=new int[50];							//��¼�ڶ���������
		String [] strings=new String[50];						//��¼��ʽ
		int count=0;									//��¼�����˼�����ʽ
		creater(chars,first,second,strings,count);
		printer(chars,first,second,strings,count);
	}
}

