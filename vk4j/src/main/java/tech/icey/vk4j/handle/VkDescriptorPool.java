package tech.icey.vk4j.handle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkDescriptorPool(MemorySegment segment) {
    public record Buffer(MemorySegment segment) {
        public long size() {
            return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
        }

        public VkDescriptorPool read() {
            return new VkDescriptorPool(readRaw());
        }

        public VkDescriptorPool read(long index) {
            return new VkDescriptorPool(readRaw(index));
        }

        public MemorySegment readRaw() {
            return readRaw(0);
        }

        public MemorySegment readRaw(long index) {
            return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        }

        public VkDescriptorPool[] readAll() {
            VkDescriptorPool[] handles = new VkDescriptorPool[(int)size()];
            for (int i = 0; i < handles.length; i++) {
                handles[i] = read(i);
            }
            return handles;
        }

        public void write(VkDescriptorPool value) {
            writeRaw(value.segment());
        }

        public void write(VkDescriptorPool value, long index) {
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
