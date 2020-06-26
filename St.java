class St
{
   public static void main(String args[])
   {
	Thread s=new Thread("John");
	Boolean k=s.setPriority(11);
	System.out.print(k);
    }
}