package com.netshoes.problems.problem1.impl;

import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class SearchVowel {

    // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
	public static void main(String[] args) {
	
		StreamImpl stream = new StreamImpl("aAbBABacafe ", 0);	
		firstChar(stream);
	}
	
    // NAO ALTERAR ESSA ASSINATURA!
    public static char firstChar(Stream input) {
        // TODO sua implementacao! Nesse ponto deve ser feita a adaptacoes necessarias para que os testes executem com sucesso
        
    	char x = '0';
    	char atual = '0';
    	int i = 0;
    	boolean y = false;
    	StreamImpl castInput = (StreamImpl) input;
    	String streamWord =  castInput.getStream().replaceAll(" ",""); //poderia usar o trim também, mas como quero usar a palavra sem espaços em branco
    	char[] caracters = new char[streamWord.length()];
    	
    	
    	while(castInput.hasNext() && i < streamWord.length()) {		
    		
    		atual = castInput.getNext();
    		
    		if (atual == 'A'  ||  atual == 'E' || atual == 'I' || atual == 'O' || atual == 'U' || atual == 'a'  ||
    				atual == 'e' || atual == 'i' || atual == 'o' || atual == 'u') {
    			
	    		for(int i2 = 0; i2 < caracters.length; i2++) {
	    			if (atual == caracters[i2]) {
	    				y = true;	
	    			}
	    		}		
	    		
	    		if(y == false)
	    			 x = atual;
	
	    		caracters[i] = atual;
	    		
	    		i++;
	    		castInput.setPosition(i);
	    		y = false;
    		}
    		
    	}
    	
    	System.out.println(x);
    	
    	return x;
    }
    

}
