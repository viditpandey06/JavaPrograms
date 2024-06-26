
import java.io.*;
import java.net.Socket;

class MyClient {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("192.168.0.100", 3333); // Replace "localhost" with the IP address of the server
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = br.readLine();
            dos.writeUTF(str);
            dos.flush();
            str2 = dis.readUTF();
            System.out.println("Server says: " + str2);
        }
        dos.close();
        s.close();
    }
}
