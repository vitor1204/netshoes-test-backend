package com.netshoes.problems.problem1.api;

// NAO ALTERAR ESSA INTERFACE!
public interface Stream {

    /**
     * @return um char com o proximo caractere da stream
     */
    char getNext();

    /**
     * @return <code>true</code> se a stream contem mais elementos<br/>
     * <code>false</code> caso contrario.
     */
    boolean hasNext();
}
