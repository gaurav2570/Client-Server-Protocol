import java.io.*;
import java.net.*;

class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client Of Gaurav Chat messanger is running... ");

        Socket sobj = new Socket("localhost",2100);
        System.out.println("Client Gaurav is waiting for server to accept the request...");

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Client Gaurav Chat Messanger started..");

        String str1,str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.println("Enter message for server Bank manager :");
            str2 = br1.readLine();
            System.out.println("Server Bank Manager Says : "+str2);
        }
        System.out.println("Thank you for using java chat messanger..");
        sobj.close();
        ps.close();
        br1.close();
        br2.close();
    }
}