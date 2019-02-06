//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   int i = a.length();
	   String vowel = "aeiouAEIOU";
	   int z = vowel.length();
	   for(int b=1; b <= z; b++){
		   if (a.substring(0,1).equals(vowel.substring(b-1,b))) {
			  String go = "yes";
			  return go;
		   }
		   if (a.substring(i-1,i).equals(vowel.substring(b-1,b))) {
			  String go = "yes";
			  return go;
		   }
		   
	   }
	   String go = "no";
	   return go;
	}
}