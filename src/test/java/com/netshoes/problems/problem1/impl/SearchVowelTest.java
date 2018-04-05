package com.netshoes.problems.problem1.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchVowelTest {

    @Test
    public void shouldReturneAsOutput() {
        String inputStream = "aAbBABacafe";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('e', output);
    }

    @Test
    public void shouldReturnMinValueOfCharacter() {
        String inputStream = "aAbBABacafeTE";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('e', output);
    }

    @Test
    public void shouldReturnZeroCharacterForSingleVowelStream() {
        String inputStream = "a";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('0', output);
    }

    @Test
    public void shouldReturnZeroCharacterForSingleConsonantStream() {

        String inputStream = "c";
        StreamImpl input = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(input);
        assertEquals('0', output);
    }

    @Test
    public void shouldReturnZeroForSingleConsonantAndSingleVowel() {
        String inputStream = "ac";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('0', output);
    }

    @Test
    public void shouldReturnZero() {
        String inputStream = "xafeAbBABcfIeKI";
        StreamImpl input = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(input);
        assertEquals('0', output);
    }

    @Test
    public void shouldReturne() {
        String inputStream = "aAbBABacafesi";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('e', output);
    }

    @Test
    public void shouldReturneForThisStream() {
        String inputStream = "aAbBABacafesa";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('e', output);
    }

    @Test
    public void shouldReturnI() {
        String inputStream = "afeaAbBABacafIe";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('I', output);
    }

    @Test
    public void shouldReturnIWhenStreamContainsSpecialCharacters() {
        String inputStream = "afe)aAb!BA&Ba(cafIe";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('I', output);
    }

    @Test
    public void shouldReturnIWhenStreamContainsDuplicatedVowel() {
        String inputStream = "ifAgahA";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('a', output);
    }

    @Test
    public void shouldReturnIWhenStreamContainsUpperAndLowerVowel() {
        String inputStream = "ifagAha";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('A', output);
    }

    @Test(expected = RuntimeException.class)
    public void shouldReturn0WhenEmptyStream() {
        String inputStream = "";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('0', output);
    }

    @Test(expected = RuntimeException.class)
    public void shouldReturn0WhenStreamFilledWithEmptySpaces() {
        String inputStream = "  ";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('0', output);
    }

    @Test(expected = RuntimeException.class)
    public void shouldReturn0WhenStreamFilledWithNoContent() {
        String inputStream = null;
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertEquals('0', output);
    }
}