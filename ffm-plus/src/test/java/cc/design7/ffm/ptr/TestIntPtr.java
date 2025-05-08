package cc.design7.ffm.ptr;

import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntPtr {
    @Test
    void test() {
        try (Arena arena = Arena.ofConfined()) {
            IntPtr pInt = IntPtr.allocate(arena);
            assertEquals(1, pInt.size());

            pInt.write(42);
            assertEquals(42, pInt.read());
            assertEquals(42, pInt.read(0));
        }
    }
}
