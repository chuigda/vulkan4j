package cc.design7.ffm;

import org.jetbrains.annotations.NotNull;

import java.lang.foreign.MemorySegment;

public interface IPointer {
    /// The implementation should always provide a not-null {@link MemorySegment}
    /// ({@code segment() != null && !segment.equals(MemorySegment.NULL)}). The segment must be
    /// properly aligned according to the type of the pointer. To represent null pointer, user
    /// should use a Java {@code null} {@link IPointer}.
    ///
    /// The size of returned segment does not need to be multiple of the size of the pointee type.
    @NotNull MemorySegment segment();
}
