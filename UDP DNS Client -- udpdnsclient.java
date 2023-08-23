import java.io.*;
 import java.net.*; 
public class udpdnsclient{ public static void main(String args[])throws IOException
{ BufferedReaderbr = new BufferedReader(new InputStreamReader(System.in));
DatagramSocketclientsocket = new DatagramSocket(); InetAddressipaddress;
 if (args.length == 0)
ipaddress = InetAddress.getLocalHost();
 else ipaddress = InetAddress.getByName(args[0]);
byte[] senddata = new byte[1024]; byte[] receivedata = new byte[1024];
 int portaddr = 1362; System.out.print("Enter the hostname : "); 
String sentence = br.readLine(); Senddata = sentence.getBytes(); DatagramPacket pack = new DatagramPacket(senddata,senddata.length, ipaddress,portaddr); 
clientsocket.send(pack); 
DatagramPacketrecvpack =new DatagramPacket(receivedata,receivedata.length); clientsocket.receive(recvpack); String modified = new String(recvpack.getData());
System.out.println("IP Address: " + modified); 
clientsocket.close(); }}
