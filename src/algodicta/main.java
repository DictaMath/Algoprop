package algodicta;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression ="3+x+6777*3/9/8"; 
		boolean var =true; 
		String caractere=""; 
		String expressionFinal=""; 
		String expressionAfter=""; 
		ArrayList<String> formule = new ArrayList<String>(); 
		
		int taille=0; 
		while(var) {
			caractere=expression.substring(taille,taille+1); 
			if(caractere.equals("/")||caractere.equals("*")) {
				
				expressionAfter=fonctionParenthese(expressionAfter); 
				
				formule.add(expressionAfter); 
				formule.add(caractere); 
				expressionAfter=""; 
				
				taille++;
				
			}else {
				if(taille+1==expression.length()) {
					caractere=expression.substring(taille,taille+1);
					expressionAfter = expressionAfter + caractere; 
					expressionAfter=fonctionParenthese(expressionAfter); 
					formule.add(expressionAfter); 
					
					var=false; 
					
				}
			expressionAfter = expressionAfter + caractere; 
			taille++; 
			}
			
		}
		
		for(int i=0; i<formule.size();i++) {
			expressionFinal= expressionFinal+formule.get(i); 
		}
		System.out.print(expressionFinal);

	}
	
	public static String fonctionParenthese(String expression) {
		ArrayList<String> listeSuggestion = new ArrayList<String>(); 
		ArrayList<String> expression2 = new ArrayList<String>(); 
		String expressionFinal=""; 
		int taille =0; 
		boolean var =true ; 
		String cpt =""; 
		int valeur1=0; 
		String caractere="";
		String caractereDapres=""; 
		
		while(var) {
			if(taille==expression.length()) {
				var=false; 
			}
			if(taille<=expression.length()) {
				if(taille+1<expression.length()) {
				caractere=expression.substring(taille,taille+1);
				
				
				
				if(caractere.equals("+") ||caractere.equals("-") ) {
						 
						
						 expression2.add("("+cpt+")");
						
						 cpt=""; 
						 expression2.add(caractere); 
						
						 
						
					}else {
							
					
							
						cpt=cpt+caractere; 
							
						
					
					}
					
				taille++;
				}
				if(taille+1==expression.length()) {
					
					caractere=expression.substring(taille,taille+1); 
					
					 
					 expression2.add("("+cpt+caractere+")");
					
					 
					 taille++;
				}
			}
			else {
			var=false; 
			 System.out.print("()");
		}
		}
		for(int i=0; i<expression2.size();i++) {
			expressionFinal= expressionFinal+expression2.get(i); 
		}
		
		
		return expressionFinal; 
	}

}
