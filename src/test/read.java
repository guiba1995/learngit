package test;
import java.io.*;


public class read {
	public static void main(String args[])
	{
read r=new read();
long startTime = System.currentTimeMillis();//��ȡ��ǰʱ��

r.singleread();
long endTime = System.currentTimeMillis();
System.out.println("��������ʱ�䣺"+(endTime-startTime)+"ms");
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
    System.out.println("��ȡ����");
    e.printStackTrace();
}
}
}
