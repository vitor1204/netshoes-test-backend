package com.netshoes.problems.problem1.impl;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SearchVowelTest {

    @Test
    public void shouldReturneAsOutput() {
        String inputStream = "aAbBABacafe";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('e'));
    }

    @Test
    public void shouldReturnMinValueOfCharacter() {
        String inputStream = "aAbBABacafeTE";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('e'));
    }

    @Test
    public void shouldReturnZeroCharacterForSingleVowelStream() {
        String inputStream = "a";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('0'));
    }

    @Test
    public void shouldReturnZeroCharacterForSingleConsonantStream() {

        String inputStream = "c";
        StreamImpl input = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(input);
        assertThat(output, IsEqual.equalTo('0'));
    }

    @Test
    public void shouldReturnZeroForSingleConsonantAndSingleVowel() {
        String inputStream = "ac";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('0'));
    }

    @Test
    public void shouldReturnZero() {
        String inputStream = "xafeAbBABcfIeKI";
        StreamImpl input = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(input);
        assertThat(output, IsEqual.equalTo('0'));
    }

    @Test
    public void shouldReturne() {
        String inputStream = "aAbBABacafesi";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('e'));
    }

    @Test
    public void shouldReturneForThisStream() {
        String inputStream = "aAbBABacafesa";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('e'));
    }

    @Test
    public void shouldReturnI() {
        String inputStream = "afeaAbBABacafIe";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('I'));
    }

    @Test
    public void shouldReturnIWhenStreamContainsSpecialCharacters() {
        String inputStream = "afe)aAb!BA&Ba(cafIe";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('I'));
    }

    @Test
    public void shouldReturnIWhenStreamContainsDuplicatedVowel() {
        String inputStream = "ifAgahA";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('a'));
    }

    @Test
    public void shouldReturnIWhenStreamContainsUpperAndLowerVowel() {
        String inputStream = "ifagAha";
        StreamImpl streamImpl = new StreamImpl(inputStream);
        char output = SearchVowel.firstChar(streamImpl);
        assertThat(output, IsEqual.equalTo('A'));
    }
}