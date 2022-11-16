package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"src/test/resources/ResultTest.csv"})
    public void shouldFindSquare(String test, int lowBorder, int highBorder, int expected) {

        SQRService service = new SQRService();

        int actual = service.specifiedRange(lowBorder, highBorder);

        assertEquals(expected, actual);
    }
}