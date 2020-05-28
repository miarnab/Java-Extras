class A{
    public static void main(String[]args){
        String s=new String("abc");
        System.out.print("s="+s);
        System.gc();
        s=null;
        System.out.print("s="+s);
    }
}