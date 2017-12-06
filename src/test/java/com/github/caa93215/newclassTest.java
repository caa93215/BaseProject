package com.github.caa93215;

import org.junit.Test;

import static org.junit.Assert.*;

public class newclassTest {
    @Test
    public void getType() throws Exception {
        newclass triangle = new newclass(5,10,5);
        Strung result = triangle.getType();
    }

}
