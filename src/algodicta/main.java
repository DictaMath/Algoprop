package algodicta;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression ="3444+x+6/x+2+8"; 
		boolean var =true; 
		String caractere=""; 
		String expressionFinal=""; 
		String expressionAfter=""; 
		ArrayList<String> suggestion =  new ArrayList<String>();
		ArrayList<ArrayList<String>> listFinal= new ArrayList<ArrayList<String>>();
		ArrayList<String> signeExpression = new ArrayList<String>();
		ArrayList<String> formule2 = new ArrayList<String>();
		int nombreDeSigne = compteSigne(expression); 
		int tailleExpression=0; 
		
		int taille=0; 
		while(tailleExpression!=nombreDeSigne) {
		
			while(var) {
				caractere=expression.substring(taille,taille+1); 
				if(caractere.equals("/")||caractere.equals("*")) {
					ArrayList<String> formule = new ArrayList<String>();
					
					int cpt3=compteSigne(expressionAfter);
					String expressionBefore= expressionAfter; 
					for(int k=0; k<cpt3+1; k++) {
						expressionAfter=fonctionParenthese2(expressionBefore,k); 
						
						formule.add(expressionAfter); 
						
					}
					/*for(int k=0; k<formule.size(); k++) {
						 System.out.println(formule.get(k)); 
					}*/
					signeExpression.add(caractere); 
					expressionAfter=""; 
					//System.out.println(formule.size());
					listFinal.add(formule); 
					//System.out.println(listFinal.get(listFinal.size()-1).size());
					
					//
					//System.out.println(listFinal.get(listFinal.size()-1).size());
					tailleExpression = tailleExpression+cpt3;
					taille++;
					
				}else {
					if(taille+1==expression.length()) {
						ArrayList<String> formule = new ArrayList<String>();
						caractere=expression.substring(taille,taille+1);
						expressionAfter = expressionAfter + caractere; 
						String expressionBefore= expressionAfter; 
						int cpt5 =compteSigne(expressionAfter);
						
						for(int k=0; k<cpt5+1; k++) {
							expressionAfter=fonctionParenthese2(expressionBefore,k); 
							formule.add(expressionAfter); 
						}
						/*for(int k=0; k<formule.size(); k++) {
							 System.out.println(formule.get(k)); 
						}*/
						tailleExpression = tailleExpression+cpt5;
						listFinal.add(formule);
						
						var=false; 
						//formule.clear();
						
					}
				expressionAfter = expressionAfter + caractere; 
				taille++; 
				}
				//formule.clear();
				
			}
			//System.out.println(listFinal.get(0).size());
			//System.out.println(listFinal.get(1).size());
			
			
			
	
		}
		/*for(int i=0; i<listFinal.size();i++) {
			for ( int j=0; j<listFinal.get(i).size(); j++) {
				System.out.println(listFinal.get(i).get(j));
				
			}
		}*/
		suggestion= combinaison(listFinal, signeExpression); 
		for ( int j=0; j<suggestion.size(); j++) {
			System.out.println(suggestion.get(j));
			
		}
		
		
		
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
						//System.out.println(cpt+"je suis la2");
						 cpt=""; 
						 expression2.add(caractere); 
						 //compteur=0;
						
						 
						
					}else {
							
						if((caractere.equals("+") ||caractere.equals("-"))) {
						compteur ++; 
						//System.out.println(compteur);
						}
						//System.out.println(cpt);
						cpt=cpt+caractere; 
						//System.out.println(cpt+"je suis la");	
						//System.out.println(compteur);	
						
					
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
	
	public static ArrayList<String> combinaison( ArrayList<ArrayList<String>> newlist, ArrayList<String> signe){
		ArrayList<String> listfinal = new ArrayList<String>(); 
		if(newlist.size()==1) {
			for(int k=0; k<newlist.get(0).size(); k++) {
				listfinal.add(newlist.get(0).get(k)); 
			}
		}else {
			if(newlist.size()==2) {
				for(int k=0; k<newlist.get(0).size(); k++) {
					for(int n=0; n<newlist.get(1).size(); n++) {
						listfinal.add(newlist.get(0).get(k)+""+signe.get(0)+newlist.get(1).get(n)); 
							 
					} 
				}
			}
				
			
			
		}
			
		
		return listfinal; 
	}
	
	

}
