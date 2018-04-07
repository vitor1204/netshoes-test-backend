package com.netshoes.problems.problem1.impl;


import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class StreamImpl implements Stream {
	
	// TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
	private String stream;
	private int position;
	
	// Nao alterar esse construtor!
    public StreamImpl(String stream) { 
    	this.stream = stream;
    	
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
    }
	
    public StreamImpl(String stream, int position) { 
    	this.stream = stream.toUpperCase();
    	this.position = position;
    	
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
    }

    public String getStream() {
		return stream.toUpperCase();
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
    public char getNext() {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.		
        return stream.charAt(this.position);
    }

    @Override
    public boolean hasNext() {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
    	boolean ret = true;
    	
    	if( (this.position + 1) > this.stream.length()) {
    		ret = false;
    	}
    	
        return ret;
    }
}
