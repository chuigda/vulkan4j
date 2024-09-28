package tech.icey.vk4j;

import java.lang.foreign.MemorySegment;

public interface IPointer {
    MemorySegment segment();
}
