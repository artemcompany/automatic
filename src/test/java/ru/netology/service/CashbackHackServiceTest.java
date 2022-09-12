package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    }
    @Test
    public void testRemain1(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain2(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1800);
        int expected = 200;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain3(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain4(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}