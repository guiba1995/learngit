package test;
import java.io.*;


public class read {
	public static void main(String args[])
	{
read r=new read();
long startTime = System.currentTimeMillis();//获取当前时间

r.singleread();
long endTime = System.currentTimeMillis();
System.out.println("程序运行时间："+(endTime-startTime)+"ms");
	}
void singleread()
{
int i;
try{
FileReader fr=new FileReader("./test.txt");
FileWriter fw=new FileWriter("test2.txt");
while ((i = fr.read())!=-1)  
{
	//System.out.println((char)i);
    fw.write((byte)i);
}
fw.close();
fr.close();
}
catch (IOException e) {
    System.out.println("读取错误");
    e.printStackTrace();
}
}
}
