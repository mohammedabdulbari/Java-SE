
package urldemo;

import java.io.*;
import java.net.*;
public class URLDemo 
{

   
    public static void main(String[] args) throws Exception
    {
        String url = "https://google.com";
String filePath = "Google2.html";
 
URL urlObj = new URL(url);
URLConnection urlCon = urlObj.openConnection();
 
InputStream inputStream = urlCon.getInputStream();
BufferedInputStream reader = new BufferedInputStream(inputStream);
 
BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(filePath));
 
byte[] buffer = new byte[reader.available()];
System.out.println(reader.available());
int bytesRead = -1;
 reader.read(buffer);
 writer.write(buffer);
 int x;
while ((x=reader.read()) != -1) {
    writer.write(x);
}
 
writer.close();
reader.close();
        
    }
    
}
