package com.hyuki.refbook;

import org.junit.After;
import org.junit.Before;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StandardOutputTest {
    private PrintStream savedOut;
    private ByteArrayOutputStream actual;

    @Before public void setUp() {
        savedOut = System.out;
        actual = new ByteArrayOutputStream();
        System.setOut(new PrintStream(new BufferedOutputStream(actual)));
    }

    @After public void tearDown() {
        System.setOut(savedOut);
    }

    protected String getActualOutput() {
        System.out.flush();
        return actual.toString();
    }

    protected String getExpectedOutput(String... strs) {
        ByteArrayOutputStream expected = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(new BufferedOutputStream(expected));
        for (String s : strs) {
            out.println(s);
        }
        out.flush();
        return expected.toString();
    }
}
