package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
        ;
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1800);
        int expected = 200;
        assertEquals(expected, actual);
        ;
    }

    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
        ;
    }

    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
        ;
    }
}
