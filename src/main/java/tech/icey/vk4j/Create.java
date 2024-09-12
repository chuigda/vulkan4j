package tech.icey.vk4j;

import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.util.Pair;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SequenceLayout;
import java.lang.reflect.Array;
import java.util.function.Function;

public final class Create {
    public static <T, F extends IDataTypeFactory<T>, A extends Function<MemoryLayout, MemorySegment>>
    T create(F factory, A allocator) {
        MemorySegment segment = allocator.apply(factory.layout());
        return factory.create(segment);
    }

    public static <T, F extends IDataTypeFactory<T>>
    T create(F factory, Arena arena) {
        return create(factory, arena::allocate);
    }

    public static
    <T, F extends IDataTypeFactory<T>, A extends Function<MemoryLayout, MemorySegment>>
    Pair<T[], MemorySegment> createArray(F factory, A allocator, int count) {
        MemoryLayout layout = factory.layout();
        SequenceLayout arrayLayout = MemoryLayout.sequenceLayout(count, layout);
        MemorySegment segment = allocator.apply(arrayLayout);

        return impCreateArray(factory, segment, count);
    }

    public static
    <T, F extends IDataTypeFactory<T>, A extends Function2<MemoryLayout, Long, MemorySegment>>
    Pair<T[], MemorySegment> createArray(F factory, A allocator, long count) {
        MemorySegment segment = allocator.apply(factory.layout(), count);
        return impCreateArray(factory, segment, (int) count);
    }

    public static
    <T, F extends IDataTypeFactory<T>>
    Pair<T[], MemorySegment> createArray(F factory, Arena arena, long count) {
        return createArray(factory, arena::allocate, count);
    }

    private static
    <T, F extends IDataTypeFactory<T>> Pair<T[], MemorySegment>
    impCreateArray(F factory, MemorySegment segment, int count) {
        Object array = Array.newInstance(factory.clazz(), count);
        for (int i = 0; i < count; i++) {
            MemorySegment subSegment = segment.asSlice(i * factory.layout().byteSize(), factory.layout());
            Array.set(array, i, factory.create(subSegment));
        }

        @SuppressWarnings("unchecked") T[] result = (T[]) array;
        return new Pair<>(result, segment);
    }
}
