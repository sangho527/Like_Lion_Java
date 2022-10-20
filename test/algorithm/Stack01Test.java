package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {


    @BeforeEach
    void setUp() {
    }


    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);

    }
    @Test
    void pushAndPop(){
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

    }
}