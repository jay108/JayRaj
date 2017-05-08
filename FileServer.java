import java.net.*;
import java.io.*;
class FileServer
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(777);
		Socket s=ss.accept();
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		BufferedReader file=null;
			String str=in.readLine();
			File f=new File(str);
			
			boolean flag;
			if(f.exists())
			{
				flag=true;
				dos.writeBytes("Yes...");
				FileReader fr=new FileReader(f);
				file=new BufferedReader(fr);
				while((str=file.readLine())!=null)
				{
					dos.writeBytes(str + "\n");
				}
			}
			else
			{
				flag=false;
				dos.writeBytes("\nNo......yaar");
			}
	}
}