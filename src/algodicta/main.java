package algodicta;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression ="3444+x+3+5+8/x+2+8+7+8+7+8+8+98"; 
		boolean var =true; 
		String caractere=""; 
		String expressionFinal=""; 
		String expressionAfter=""; 
		ArrayList<ArrayList<String>> listFinal= new ArrayList<ArrayList<String>>();
		ArrayList<String> formule = new ArrayList<String>();
		
		int taille=0; 
		
		while(var) {
			caractere=expression.substring(taille,taille+1); 
			if(caractere.equals("/")||caractere.equals("*")) {
				
				expressionAfter=fonctionParenthese2(expressionAfter,3); 
				
				formule.add(expressionAfter); 
				formule.add(caractere); 
				expressionAfter=""; 
				
				taille++;
				
			}else {
				if(taille+1==expression.length()) {
					caractere=expression.substring(taille,taille+1);
					expressionAfter = expressionAfter + caractere; 
					expressionAfter=fonctionParenthese2(expressionAfter,3); 
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
			
		}
		}
		for(int i=0; i<expression2.size();i++) {
			expressionFinal= expressionFinal+expression2.get(i); 
		}
		
		
		return expressionFinal; 
	}
	
	public static String fonctionParenthese2(String expression, int compteur2) {
		ArrayList<String> listeSuggestion = new ArrayList<String>(); 
		ArrayList<String> expression2 = new ArrayList<String>(); 
		String expressionFinal=""; 
		int taille =0; 
		boolean var =true ; 
		String cpt =""; 
		int valeur1=0; 
		int compteur =0; 
		String caractere="";
		String caractereDapres=""; 
		
		while(var) {
			if(taille==expression.length()) {
				var=false; 
			}
			if(taille<=expression.length()) {
				if(taille+1<expression.length()) {
				caractere=expression.substring(taille,taille+1);
				
				
				
				if((caractere.equals("+") ||caractere.equals("-") ) && compteur==compteur2) {
						 
						
						 expression2.add("("+cpt+")");
						System.out.println(cpt+"je suis la2");
						 cpt=""; 
						 expression2.add(caractere); 
						 //compteur=0;
						
						 
						
					}else {
							
						if((caractere.equals("+") ||caractere.equals("-"))) {
						compteur ++; 
						System.out.println(compteur);
						}
						//System.out.println(cpt);
						cpt=cpt+caractere; 
						System.out.println(cpt+"je suis la");	
						System.out.println(compteur);	
						
					
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
			
		}
		}
		for(int i=0; i<expression2.size();i++) {
			expressionFinal= expressionFinal+expression2.get(i); 
		}
		
		
		return expressionFinal; 
	}
	public static int compteSigne(String expression) {
		int taille=0;
		String caractere="";
		int cpt=0;
		for(int i=0; i<expression.length(); i++) {
			caractere=expression.substring(taille,taille+1);
			if(caractere.equals("+") ||caractere.equals("-")) {
				cpt++;
			}
		taille++;
		}
		return cpt;
	}

}
