package Testing.Apples;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleTest {

    Apple apple = new Apple();

    @Test
    public void getApple() {
        assertEquals("apple",apple.getApple());
    }
}