package ru.kpfu.itis.denyspatsera.work.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.kpfu.itis.denyspatsera.work.TwoStackQueue;

import static org.junit.jupiter.api.Assertions.*;

public class TwoStackQueueTest {

    private TwoStackQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new TwoStackQueue<>();
    }

    @Test
    void testIsEmptyOnNewQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void testPushAndPeek() {
        queue.push(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.peek());
    }

    @Test
    void testPushAndPop() {
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testPopOrder() {
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
    }

    @Test
    void testPeekAfterPop() {
        queue.push(1);
        queue.push(2);
        queue.pop();
        assertEquals(2, queue.peek());
    }

    @Test
    void testIsEmptyAfterPop() {
        queue.push(1);
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testExceptionOnPopWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> {
            queue.pop();
        });
    }

    @Test
    void testExceptionOnPeekWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> {
            queue.peek();
        });
    }
}
