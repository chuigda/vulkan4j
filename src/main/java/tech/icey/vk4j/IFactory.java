package tech.icey.vk4j;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

public interface IFactory<T> {
    Class<T> clazz();

    MemoryLayout layout();

    T create(MemorySegment segment);

    T createUninit(MemorySegment segment);
}
