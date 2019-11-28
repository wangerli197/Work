public class Exercises1{
	public static void main(String[] args){
		Exercises e=new Exercises();
		e.init(50,0);//生成50道的减法
		e.printAll(5);
		e.printAnswer(5);
		e.init(50,1);//生成50道的加法
		e.printAll(5);
		e.printAnswer(5);
		e.init(50);//生成50道的混合运算
		e.printAll(5);
		e.printAnswer(5);
	}
}
