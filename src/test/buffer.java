package test;

import java.io.*;


public class buffer {
	public static void main(String args[])
	{
       buffer b=new buffer();
       long startTime = System.currentTimeMillis();
       b.bufferread();
       long endTime = System.currentTimeMillis();
       System.out.println("ʹ�û���������ʱ�䣺"+(endTime-startTime)+"ms");
       

	}
	 void bufferread() {
	        String line = null;
	        try {
	            FileReader fr = new FileReader("./test.txt");
	            BufferedReader br = new BufferedReader(fr);
	            FileWriter fw=new FileWriter("test1.txt");
	            BufferedWriter bw = new BufferedWriter(fw);
	            while ((line = br.readLine()) != null) {
	           bw.write(line);
	           bw.newLine();
	            }
	            bw.flush();
	            bw.close();
	            br.close();
	            fw.close();
	            br.close();
	            fr.close();
	        } catch (IOException e) {
	            System.out.println("��ȡ����");
	            e.printStackTrace();
	        }
	    }


}
