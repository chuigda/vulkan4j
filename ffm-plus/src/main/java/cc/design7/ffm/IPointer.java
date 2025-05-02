package cc.design7.ffm;

import cc.design7.ffm.annotation.ValueBasedCandidate;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.MemorySegment;

/// Represents a pointer to native memory.
@ValueBasedCandidate
public interface IPointer {
    /// The implementation should always provide a not-null {@link MemorySegment}
    /// ({@code segment() != null && !segment.equals(MemorySegment.NULL)}). The segment must be
    /// properly aligned according to the pointee type. To represent null pointer, user
    /// should use a Java {@code null} {@link IPointer}.
    ///
    /// Generally speaking, the segment's size does not need to be multiple of the size of the
    /// pointee type. For example, a {@link cc.design7.ffm.ptr.IntPtr} can point to a segment of
    /// 7 bytes. The trailing bytes can be safely ignored by most algorithms and FFI functions.
    ///
    /// If the memory segment is even not big enough to hold a single element of the pointee type,
    /// the segment is simply considered "empty". This is just like allocating 0 bytes with C/C++
    /// {@code malloc(0)} (on some implementation): the resulting pointer is not null and valid, but
    /// you cannot read or write anything.
    @NotNull MemorySegment segment();
}
