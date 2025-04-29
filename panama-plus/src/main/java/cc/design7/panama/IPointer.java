package cc.design7.panama;

import java.lang.foreign.MemorySegment;

public interface IPointer {
    MemorySegment segment();
}
