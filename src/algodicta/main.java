package algodicta;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression ="3+x+6+7/4+x+5+88"; 
		boolean var =true; 
		String caractere=""; 
		String expressionFinal=""; 
		String expressionAfter=""; 
		ArrayList<String> formule = new ArrayList<String>(); 
		//expressionAfter= fonctionParenthese(expressionAfter); 
		//System.out.print(expressionAfter);
		int taille=0; 
		while(var) {
			caractere=expression.substring(taille,taille+1); 
			if(caractere.equals("/")||caractere.equals("*")) {
				System.out.println(expressionAfter+" Avant ");
				expressionAfter=fonctionParenthese(expressionAfter); 
				System.out.println(expressionAfter+" Après");
				formule.add(expressionAfter); 
				formule.add(caractere); 
				expressionAfter=""; 
				//break; 
				taille++;
				
			}else {
				if(taille+1==expression.length()) {
					caractere=expression.substring(taille,taille+1);
					expressionAfter = expressionAfter + caractere; 
					System.out.println(expressionAfter+" Avant2 ");
					expressionAfter=fonctionParenthese(expressionAfter); 
					System.out.println(expressionAfter+" Après2");
					formule.add(expressionAfter); 
					//formule.add(caractere);
					var=false; 
					
				}
				
			//System.out.print(expressionAfter+"bbbld");
			//System.out.println(taille);
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
		String 
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
						 
						 String newcaractere= expression2.get(expression2.size()-1); 
						
						 expression2.remove(expression2.size()-1); 
						 expression2.add("("+newcaractere+")");
						 
						 expression2.add(caractere); 
						//break; 
						 
						
					}else {
					
						if(taille+2<expression.length()) {
							caractereDapres= expression.substring(taille+1,taille+2);
							if(!caractereDapres.equals("+") ||!caractereDapres.equals("-") ) {
								cpt=cpt+caractere; 
							}
						}
					expression2.add(caractere); 
					}
					//System.out.println("la taille est"+taille);
				taille++; 
				}
				if(taille+1==expression.length()) {
					
					caractere=expression.substring(taille,taille+1); 
					
					//System.out.println(caractere+"BLIBLI"); 
					 expression2.add("("+caractere+")");
					
					 //expression2.add(caractere); 
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
		
		//System.out.println(expressionFinal);
		
		return expressionFinal; 
	}

}
