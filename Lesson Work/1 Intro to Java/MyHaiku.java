class MyHaiku
{
   public static void main (String [] args)
   {
   int i = 0;
    while (i < 3)
    {
      
      String haiku = "How much can I fit";
      if (i == 1)
      {
         haiku = "Into a Haiku format";
      }
      if (i == 2)
      {
         haiku = "Oh no I'm out of";
      }
      i++;
      System.out.println(haiku);
    }  
      
   }
}