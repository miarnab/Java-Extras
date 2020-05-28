import java.io.*;import java.util.*;
class binaryfile
{public static void main(String args[])throws IOException
{
 InputStreamReader isr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(isr);
 String pname;
 int i,n,qty;
 double price,dicount,netprice,tprice;
 n=Integer.parseInt(br.readLine());
}
 void create()throws IOException
{int n;
  //opening in writing mode
FileOutputStream fos=new FileOutputStream("invoice.dat",true);
DataOutputStream dos=new DataOutputStream(fos);
System.out.println("Input the total number of products");
for(int i=0;i<n;i++)
{
System.out.println("Enter details of the product");
String pname=dos.readLine();
int qty=Integer.parseInt(br.readLine());
double price=Double.parseDouble(br.readLine());
dos.writeUTF(pname);
dos.writeint(qty);
dos.writedouble(price);
}
dos.close();
}
void display()throws IOException
{
n=0;
FileInputStream fis=new FileInputStream("invoice.dat");
DataInputStream dis=new DataInputStream(fis);
Boolean eof=false;
while(!eof)
{
try
{
pname=dis.readUTF();
qty=dis.readint();
price=dis.readdouble();
tprice=price*qty;
if(tprice>12000.00)
discount=(tprice*20.00)/100.00;
else
discount=0.00;
netprice=tprice-discount;
System.out.println("Bill:");
System.out.println("Product name:"+pname);
System.out.println("Quantity="+qty);
System.out.println("Unit price="+price);
System.out.println("Total price="+tprice);
System.out.println("Discount="+discount);
System.out.println("Net price="+netprice);
}//end of try block
catch(EOFException e)
{
System.out.println("This is the end of file");
eof=true;
}
}//end of while loop
dis.close();
}
void modify()
{
n=0;
String pnamec="",pnamen="";
int qtyc=0,qtyn=0;
double pricec=0.00,pricen=0.00;
FileInputStream fis1=new FileInputStream("invoice.dat");
DataInputStream dis1=new DataInputStream(fis);
FileOutputStream fos1=new FileOutputStream("temp.dat");
DataOutputStream dos1=new DataOutputStream(fos1);
System.out.println("Enter the item to be modified:1.name,2.quantity,3.price");
System.out.println("Enter the user's choice");
int ch=Interger.parseInt(br.readLine());
switch(ch)
{
case 1:System.out.println("Enter the name of the product to be changed");
       pnamec=br.readLine();
       System.out.println("Enter the new name of the product");
       pnamen=br.readLine();
       break;
case 2:System.out.println("Enter the quantity of the product to be changed");
       qtyc=br.readLine();
       System.out.println("Enter the new quantity of the product");
       qtyn=br.readLine();
       break;
case 3:System.out.println("Enter the price of the product to be changed");
       pricec=br.readLine();
       System.out.println("Enter the new price of the product");
       pricen=br.readLine();
       break;
default:System.out.println("Wrong choice:");
}
boolean eof=false;
while(!eof)
{
try
{
pname=dis1.readUTF();
qty=dis1.readint();
price=dis1.readDouble();
if(pname.equalsIgnoreCase(pnamec))
pname=pnamen;
if(qty==qtyc)
qty=qtyn;
if(price==pricec)
price=pricen;
dis2.writeUTF(pname);
dis2.writeint(qty);
dis2.writeDouble(price);
}
catch(EOFException e)
{
System.out.println("There is no records:");
eof=true;
}
}
dis1.close();
dis2.close();
File f1=new File("invoice.dat");
f1.delete();
File f2=new File("temp.dat");
boolean rename=f2.renameTo(f1);
if(!rename)
{
System.out.println("File could not be renamed");
System.exit(0);
}
else
{
System.out.println("The file is renamed successfully");
}
}
}
