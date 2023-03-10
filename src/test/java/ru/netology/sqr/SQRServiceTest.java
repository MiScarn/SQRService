package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testForSearchingSquares() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessThanLimit() {
        SQRService service = new SQRService();

        int actual = service.calc(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreThanLimit() {
        SQRService service = new SQRService();

        int actual = service.calc(10_000, 11_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
