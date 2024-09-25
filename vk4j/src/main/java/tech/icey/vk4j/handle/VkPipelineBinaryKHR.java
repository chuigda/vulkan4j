package tech.icey.vk4j.handle;

import tech.icey.vk4j.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkPipelineBinaryKHR(MemorySegment segment) {
    public record Buffer(MemorySegment segment) {
        public long size() {
            return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
        }

        public VkPipelineBinaryKHR read() {
            return new VkPipelineBinaryKHR(readRaw());
        }

        public VkPipelineBinaryKHR read(long index) {
            return new VkPipelineBinaryKHR(readRaw(index));
        }

        public MemorySegment readRaw() {
            return readRaw(0);
        }

        public MemorySegment readRaw(long index) {
            return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        }

        public VkPipelineBinaryKHR[] readAll() {
            VkPipelineBinaryKHR[] handles = new VkPipelineBinaryKHR[(int)size()];
            for (int i = 0; i < handles.length; i++) {
                handles[i] = read(i);
            }
            return handles;
        }

        public void write(VkPipelineBinaryKHR value) {
            writeRaw(value.segment());
        }

        public void write(long index, VkPipelineBinaryKHR value) {
            writeRaw(index, value.segment());
        }

        public void writeRaw(MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, 0, value);
        }

        public void writeRaw(long index, MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
        }

        public Buffer offset(long offset) {
            return new Buffer(segment.asSlice(
                offset * ValueLayout.ADDRESS.byteSize(),
                (size() - offset) * ValueLayout.ADDRESS.byteSize()
            ));
        }

        @unsafe
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
