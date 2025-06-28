package club.doki7.ffm.test.ptr;

import club.doki7.ffm.ptr.CLongPtr;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class TestCLongPtr {
    @Test
    public void testReadWrite() {
        try (Arena arena = Arena.ofConfined()) {
            CLongPtr ptr = CLongPtr.allocate(arena, 5);
            ptr.write(0, 123456789L);
            ptr.write(1, 987654321L);
            ptr.write(2, 114514L);
            ptr.write(3, 1919810L);
            ptr.write(4, 0x07210D00);

            assertEquals(123456789L, ptr.read(0));
            assertEquals(987654321L, ptr.read(1));
            assertEquals(114514L, ptr.read(2));
            assertEquals(1919810L, ptr.read(3));
            assertEquals(0x07210D00L, ptr.read(4));
        }
    }
}
