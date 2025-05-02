package cc.design7.ffm;

import java.lang.foreign.MemorySegment;

public interface IPointer {
    MemorySegment segment();
}
