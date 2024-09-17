package tech.icey.vk4j;

import java.lang.foreign.MemorySegment;

public interface IHandle {
    MemorySegment segment();
}
