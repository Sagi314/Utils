package com.sagi314.util.concretes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OutParameterTest
{
    private OutParameter<Object> out;

    @BeforeEach
    void setUp()
    {
        out = new OutParameter<>();
    }

    @Test
    void get()
    {
        Assertions.assertNull(out.get());

        var object = new Object();
        out.set(object);

        Assertions.assertSame(object, out.get());
    }

    @Test
    void set()
    {
        var object = new Object();
        out.set(object);

        Assertions.assertSame(object, out.get());

        var object2 = new Object();
        out.set(object2);

        Assertions.assertSame(object2, out.get());
    }
}