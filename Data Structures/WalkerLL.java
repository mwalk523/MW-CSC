public class WalkerLL
{
   String data;
   WalkerLL link;
   WalkerLL head = null;
   WalkerLL tptr;
 
   public WalkerLL (String initData, WalkerLL initLink)
   {
      data = initData;
      link = initLink;
   }
 
   public WalkerLL (String iData)
   {
      data = iData;
      link = null;
   }
}

