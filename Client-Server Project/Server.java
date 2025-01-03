import java.io.*;
import java.net.*;

class Server
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Server Of Bank Manager Chat messanger is running... ");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server Bank Manager is in the listening mode at port no : 2100");

        Socket sobj = ssobj.accept();
        System.out.println("Client and Server connection is Succesful...");

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Server Bank Manager Chat Messanger started..");

        String str1,str2;

        while((str1 = br1.readLine())!=null)
        {
            System.out.println("Client Gaurav says :"+str1);
            System.out.println("Enter message for client Gaurav :");
            str2 = br2.readLine();
            ps.println(str2);
        }
        System.out.println("Thank you for using java chat messanger..");
        ssobj.close();
        sobj.close();
        ps.close();
        br1.close();
        br2.close();
    }
}