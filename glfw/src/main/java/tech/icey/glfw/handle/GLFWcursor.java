package tech.icey.glfw.handle;

import tech.icey.panama.IPointer;
import tech.icey.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record GLFWcursor(MemorySegment segment) implements IPointer {
    public record Buffer(MemorySegment segment) {
        public long size() {
            return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
        }

        public GLFWcursor read() {
            return new GLFWcursor(readRaw());
        }

        public GLFWcursor read(long index) {
            return new GLFWcursor(readRaw(index));
        }

        public MemorySegment readRaw() {
            return segment.get(ValueLayout.ADDRESS, 0);
        }

        public MemorySegment readRaw(long index) {
            return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        }

        public GLFWcursor[] readAll() {
            GLFWcursor[] result = new GLFWcursor[(int) size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = read(i);
            }
            return result;
        }

        public void write(GLFWcursor value) {
            writeRaw(value.segment());
        }

        public void write(long index, GLFWcursor value) {
            writeRaw(index, value.segment());
        }

        private void writeRaw(MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, 0, value);
        }
        
        private void writeRaw(long index, MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
        }

        public Buffer offset(long offset) {
            return new Buffer(segment.asSlice(offset * ValueLayout.ADDRESS.byteSize()));
        }

        @unsafe
        public Buffer reinterpret(long newSize) {
            return new Buffer(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
        }
        
        public static Buffer allocate(Arena arena) {{
            return new Buffer(arena.allocate(ValueLayout.ADDRESS));
        }}

        public static Buffer allocate(Arena arena, long size) {{
            return new Buffer(arena.allocate(ValueLayout.ADDRESS, size));
        }}
    }
}