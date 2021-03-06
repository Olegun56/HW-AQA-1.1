package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldCalculateUnder1000() {
        int amount = 600;
        int actual = cashbackHackService.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateOver1000() {
        int amount = 1300;
        int actual = cashbackHackService.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateIfEqualy1000() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}