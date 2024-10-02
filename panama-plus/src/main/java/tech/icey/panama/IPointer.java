package tech.icey.panama;

import java.lang.foreign.MemorySegment;

public interface IPointer {
    MemorySegment segment();
}
