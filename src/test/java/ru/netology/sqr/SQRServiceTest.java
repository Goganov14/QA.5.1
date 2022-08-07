package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
    void shouldCalculateRandomNumber() {
        SQRService service = new SQRService();
        int min = 1263;
        int max = 6903;
        int expected = 48;
        int actual = service.quaqua(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLimits() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 9801;
        int expected = 90;
        int actual = service.quaqua(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAllNumbers() {
        SQRService service = new SQRService();
        int min = 1;
        int max = 1000000000;
        int expected = 90;
        int actual = service.quaqua(min, max);
        assertEquals(expected, actual);
    }

}
