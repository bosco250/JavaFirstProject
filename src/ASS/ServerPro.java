package ASS;
import java.io.*;
import java.net.*;
public class ServerPro {

	public static void main(String[] args) {
		try {
		ServerSocket ss=new ServerSocket(5655);
		System.out.println("Server Started");
		Socket soc=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		String operator=br.readLine();
		PrintStream p=new PrintStream(soc.getOutputStream());
		
		int result = compute(a, b, operator);
        p.println(result);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
 public static int compute(int num1,int num2,String op) {
	 switch (op){
	 case "+": return num1+num2 ;
	 case "*": return num1*num2 ;
	 case "/": return num1/num2 ;
	 case "%": return num1%num2 ;
	 default: return 0;
	}
 }
}
