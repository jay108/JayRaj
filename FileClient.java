import java.net.*;
import java.io.*;
class FileClient
{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("localhost",777);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter File Name:");
		String sn=br.readLine();
		String str;
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeBytes(sn + "\n");
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		if(in.readLine().equals("Yes..."))
		{
			while((str=in.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
			s.close();
			dos.close();
			in.close();
		}
		else
		{
			System.out.println("\nFile Not Found..");
		}
	}
}	