package algorithm;

import algorithm.stack.Stack01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {
    Stack01 st = new Stack01();

    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(10);
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Integer[] arr = st.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    void isEmpty() {
        Stack01 st = new Stack01();
        assertTrue(st.isEmpty());
        st.push(10);
        assertTrue(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }
    @Test
    void pushAndPop(){
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        st.pop();

    }
}