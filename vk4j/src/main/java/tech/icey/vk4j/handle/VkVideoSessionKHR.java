package tech.icey.vk4j.handle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkVideoSessionKHR(MemorySegment segment) {
    public record Buffer(MemorySegment segment) {
        public long size() {
            return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
        }

        public VkVideoSessionKHR read() {
            return new VkVideoSessionKHR(readRaw());
        }

        public VkVideoSessionKHR read(long index) {
            return new VkVideoSessionKHR(readRaw(index));
        }

        public MemorySegment readRaw() {
            return readRaw(0);
        }

        public MemorySegment readRaw(long index) {
            return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        }

        public VkVideoSessionKHR[] readAll() {
            VkVideoSessionKHR[] handles = new VkVideoSessionKHR[(int)size()];
            for (int i = 0; i < handles.length; i++) {
                handles[i] = read(i);
            }
            return handles;
        }

        public void write(VkVideoSessionKHR value) {
            writeRaw(value.segment());
        }

        public void write(VkVideoSessionKHR value, long index) {
            writeRaw(value.segment(), index);
        }

        public void writeRaw(MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, 0, value);
        }

        public void writeRaw(MemorySegment value, long index) {
            segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
        }

        public Buffer reinterpret(long newSize) {
            return new Buffer(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
        }

        public static Buffer allocate(Arena arena) {
            return allocate(arena, 1);
        }

        public static Buffer allocate(Arena arena, long size) {
            return new Buffer(arena.allocate(ValueLayout.ADDRESS, size));
        }
    }
}
