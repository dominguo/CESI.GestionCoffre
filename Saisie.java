package util;

import java.io.*; 
public class Saisie {

   public static String unstring(String msg) // Lire un String 
   { 
      String Strloc = new String();  //<=> Strloc =""; 
      char Carlu='\0'; 
      try { 
    	 System.out.println(msg); 
         while ((Carlu=(char) System.in.read()) !='\n'){
        	 if (Carlu != '\r')  Strloc = Strloc+Carlu; 
         }
      } 
       catch (IOException e) { 
            System.out.println("Erreur de saisie"); 
            System.exit(0); 
       } 
      return Strloc; 
   } // fin de unstring()
   public static byte unbyte()  // Lire un entier de type byte 
   { 
      byte b=0; 
      try {  
         b=Byte.parseByte(unstring("Saisir un Byte")); 
      } 
         catch (NumberFormatException e) { 
            System.out.println("Entier byte incorrect"); 
            System.exit(0); 
         }  
      return b ; 
   } // fin de unbyte()
   public static short unshort()  // Lire un entier short 
   { 
      short s=0; 
      try {  
         s=Short.parseShort(unstring("Saisir un Short")); 
      } 
         catch (NumberFormatException e) { 
            System.out.println("Entier short incorrect"); 
            System.exit(0); 
         }  
      return s ; 
   } // fin de unshort()
   public static int unint()  // Lire un entier 
   { 
      int i=0; 
      long loc=unlong();// un int est un long particulier 
      i=(int)loc;  
      return i ; 
   } // fin de unint()
   public static long unlong()  // Lire un entier long 
   { 
      long L=0; 
      try { 
         L=Integer.parseInt(unstring("Saisir un Long")); 
      } 
         catch (NumberFormatException e) { 
            System.out.println("Entier long incorrect"); 
            System.exit(0); 
         }  
      return L ; 
   } // fin de unlong()
   public  static double undouble()  // Lire un double 
   { 
      double D=0.0; // type r�el par d�faut de Java 
      try { 
         D=Double.valueOf(unstring("Saisir un Double")).doubleValue(); 
      } 
         catch (NumberFormatException e) { 
            System.out.println("R�el double incorrect"); 
            System.exit(0); 
         }  
      return D ; 
   } // fin de undouble()
   public  static float unfloat()  // Lire un float 
   { 
      float F=0.0f; // sinon double par d�faut 
      try { 
         F=Double.valueOf(unstring("Saisir un float")).floatValue(); 
      } 
         catch (NumberFormatException e) { 
            System.out.println("Format num�rique incorrect"); 
            System.exit(0); 
         }  
      return F ; 
   } // fin de unfloat()
   public  static char unchar()  // Lire un caractere 
   { 
      String Strloc=unstring("Chaisir un Char");// un caract�re est un string particulier 
    
      if (Strloc.length()==0) 
         return '\n'; 
      else  
         return Strloc.charAt(0);// on ne prend que le premier caract�re 
   } // fin de unchar()
}
