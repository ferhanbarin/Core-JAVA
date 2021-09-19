package day39_Overriding;

public class Overriding {
	
	
	// Parent class'daki bir METHOD'u child class'a göre özellestirerek kullanmanin adidir.
	 
	/*
	  OVERRIDING KURALLARI
	 
	  1) Overriding creat edilirken "Method Signature" (name+parameters) kesinlikle degistirilemez.
	 
	  2) Overriding creat edilirken "Access Modifier" belirli kurallara göre degistirilebilir.
	 
	  3) Overriding creat edilirken "Return Type" belirli kurallara göre degistirilebilir.
	 
	  4) Overriding creat edilirken "Method Body" %99 degisir. Ama degistirilmezse CTE vermez. - Amelelik olur :) - Overriding amaci body creat etmektir.
	  
	  5) Overriding creat edilirken "Parent - Child" relationship sarttir. Inheritance olmadan Overriding olamaz.
	  
	  6) "Overridden Method" parent class'daki methoddur.(Ezilen method) 
	  	 "Overriding Method" child class'daki methoddur.(Ezen)
	  	 
	  7) "Overriding Method" (child'in) Acces Modifier'i ya "Overridden Method" (parent) ile ayni ya da daha genis olmalidir.
	  	  NOT: Evlat babanin erisimini daraltamaz ama genisletebilir.  -  SubAccMod >= SuperAccMod
	  	  
	  8) "Overriding Method" (child'in) return type void ise "Overridden Method" (parent) return type void olmali. Kendinden olmayani kabul etmez.
	  
	  9) "Overriding Method" (child'in) return type Wrapper class'dan ise "Overridden Method" (parent) return type Wrapper class'dan olmali. Kendinden olmayani kabul etmez.
	  
	  10) "Overriding Method" (child'in) return type ile "Overridden Method" (parent) return arasinda is-A (child -> parent relationship) iliskisi olmalidir.
	  
	  11) Static method'lar "@Override" edilemezler. 
	  
	  12) Private method'lar overriding edilemezler. --> Neden: Cünkü private.
	  
	  13) Final method'lar overriding edilemezler. --> Neden: FINAL: son hali artik degistirilemez de ondan.
	  
	  14) "Polymorphism" INTERVIEW --> "Overloading" ve "Overriding" olusan yapiya denir.
	   	   
	   	   "Overloading" --> public void yemek(){...}
	   	   					 public void yemek(String tatli){...}
		 	  				 public void yemek(String tatli, int ücret){...}
		 	  				 
		 	  				 
		   "Overridding" --> public void icmek(){syso(gazoz)}
		   					 public void icmek(){syso(dark ve sek bir kahve)}
		   					 public void icmek(){syso(ücret)}
		   					 
		   "Overloading" ile "Overriding" arasindaki farklar:
		   
		   1) "Overloading" de method signature(name+parametre) degistirilir. (parametre degisir)
		   	  "Overriding" de method signature(name+parametre) asla degistirilemez.
		   	  
		   2) "Overloading" de inheritance gerekmez.
		   	  "Overriding" de inheritance olmadan "Overriding" yapilmaz.
		   	  
		   3) "Overloading" de body genellikle degistirilmeden kullanilir.
		   	  "Overriding" de body hemen hemen her zaman degistirilir.
		   	  
		   4) Static method'lar "Overriding" edilemezler. Ama "Overloading" edilebilirler.
		   	  Private method'lar "Overriding" edilemezler. Ama "Overloading" edilebilirler.
		   	  
		   5) Overloading Compile Time Polymorphism'dir. -> Static
		   	  Overriding Run Time Polymorphism'dir. -> Dinamik
		   
		   
	 */

}
