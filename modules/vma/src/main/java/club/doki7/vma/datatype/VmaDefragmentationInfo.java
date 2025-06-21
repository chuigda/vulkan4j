package club.doki7.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vma.bitmask.*;
import club.doki7.vma.handle.*;
import club.doki7.vma.enumtype.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;
import static club.doki7.vulkan.VkConstants.*;

/// Parameters for defragmentation.
///
/// To be used with function vmaBeginDefragmentation().
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaDefragmentationInfo {
///     VmaDefragmentationFlags flags; // @link substring="VmaDefragmentationFlags" target="VmaDefragmentationFlags" @link substring="flags" target="#flags"
///     VmaPool pool; // optional // @link substring="VmaPool" target="VmaPool" @link substring="pool" target="#pool"
///     VkDeviceSize maxBytesPerPass; // @link substring="maxBytesPerPass" target="#maxBytesPerPass"
///     uint32_t maxAllocationsPerPass; // @link substring="maxAllocationsPerPass" target="#maxAllocationsPerPass"
///     PFN_vmaCheckDefragmentationBreakFunction pfnBreakCallback; // optional // @link substring="pfnBreakCallback" target="#pfnBreakCallback"
///     void* pBreakCallbackUserData; // optional // @link substring="pBreakCallbackUserData" target="#pBreakCallbackUserData"
/// } VmaDefragmentationInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #flags} Use combination of {@code VmaDefragmentationFlagBits}.</li>
/// <li>{@link #pool} Custom pool to be defragmented.
///
/// If null then default pools will undergo defragmentation process.
/// </li>
/// <li>{@link #maxBytesPerPass} Maximum numbers of bytes that can be copied during single pass, while moving allocations to different places.
///
/// `0` means no limit.
/// </li>
/// <li>{@link #maxAllocationsPerPass} Maximum number of allocations that can be moved during single pass to a different place.
///
/// `0` means no limit.
/// </li>
/// <li>{@link #pfnBreakCallback} Optional custom callback for stopping vmaBeginDefragmentation().
///
/// Have to return true for breaking current defragmentation pass.
/// </li>
/// <li>{@link #pBreakCallbackUserData} Optional data to pass to custom callback for stopping pass of defragmentation.</li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaDefragmentationInfo(@NotNull MemorySegment segment) implements IVmaDefragmentationInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaDefragmentationInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaDefragmentationInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaDefragmentationInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaDefragmentationInfo, Iterable<VmaDefragmentationInfo> {
        public long size() {
            return segment.byteSize() / VmaDefragmentationInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaDefragmentationInfo at(long index) {
            return new VmaDefragmentationInfo(segment.asSlice(index * VmaDefragmentationInfo.BYTES, VmaDefragmentationInfo.BYTES));
        }

        public void write(long index, @NotNull VmaDefragmentationInfo value) {
            MemorySegment s = segment.asSlice(index * VmaDefragmentationInfo.BYTES, VmaDefragmentationInfo.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VmaDefragmentationInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaDefragmentationInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaDefragmentationInfo.BYTES,
                (end - start) * VmaDefragmentationInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaDefragmentationInfo.BYTES));
        }

        public VmaDefragmentationInfo[] toArray() {
            VmaDefragmentationInfo[] ret = new VmaDefragmentationInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VmaDefragmentationInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VmaDefragmentationInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaDefragmentationInfo.BYTES;
            }

            @Override
            public VmaDefragmentationInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaDefragmentationInfo ret = new VmaDefragmentationInfo(segment.asSlice(0, VmaDefragmentationInfo.BYTES));
                segment = segment.asSlice(VmaDefragmentationInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaDefragmentationInfo allocate(Arena arena) {
        return new VmaDefragmentationInfo(arena.allocate(LAYOUT));
    }

    public static VmaDefragmentationInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaDefragmentationInfo.Ptr(segment);
    }

    public static VmaDefragmentationInfo clone(Arena arena, VmaDefragmentationInfo src) {
        VmaDefragmentationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(VmaDefragmentationFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public VmaDefragmentationInfo flags(@EnumType(VmaDefragmentationFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @Nullable VmaPool pool() {
        MemorySegment s = segment.asSlice(OFFSET$pool, SIZE$pool);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VmaPool(s);
    }

    public VmaDefragmentationInfo pool(@Nullable VmaPool value) {
        segment.set(LAYOUT$pool, OFFSET$pool, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long maxBytesPerPass() {
        return segment.get(LAYOUT$maxBytesPerPass, OFFSET$maxBytesPerPass);
    }

    public VmaDefragmentationInfo maxBytesPerPass(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$maxBytesPerPass, OFFSET$maxBytesPerPass, value);
        return this;
    }

    public @Unsigned int maxAllocationsPerPass() {
        return segment.get(LAYOUT$maxAllocationsPerPass, OFFSET$maxAllocationsPerPass);
    }

    public VmaDefragmentationInfo maxAllocationsPerPass(@Unsigned int value) {
        segment.set(LAYOUT$maxAllocationsPerPass, OFFSET$maxAllocationsPerPass, value);
        return this;
    }

    public @Pointer(comment="PFN_vmaCheckDefragmentationBreakFunction") @NotNull MemorySegment pfnBreakCallback() {
        return segment.get(LAYOUT$pfnBreakCallback, OFFSET$pfnBreakCallback);
    }

    public VmaDefragmentationInfo pfnBreakCallback(@Pointer(comment="PFN_vmaCheckDefragmentationBreakFunction") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pfnBreakCallback, OFFSET$pfnBreakCallback, value);
        return this;
    }

    public VmaDefragmentationInfo pfnBreakCallback(@Nullable IPointer pointer) {
        pfnBreakCallback(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment pBreakCallbackUserData() {
        return segment.get(LAYOUT$pBreakCallbackUserData, OFFSET$pBreakCallbackUserData);
    }

    public VmaDefragmentationInfo pBreakCallbackUserData(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pBreakCallbackUserData, OFFSET$pBreakCallbackUserData, value);
        return this;
    }

    public VmaDefragmentationInfo pBreakCallbackUserData(@Nullable IPointer pointer) {
        pBreakCallbackUserData(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pool"),
        ValueLayout.JAVA_LONG.withName("maxBytesPerPass"),
        ValueLayout.JAVA_INT.withName("maxAllocationsPerPass"),
        ValueLayout.ADDRESS.withName("pfnBreakCallback"),
        ValueLayout.ADDRESS.withName("pBreakCallbackUserData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pool = PathElement.groupElement("pool");
    public static final PathElement PATH$maxBytesPerPass = PathElement.groupElement("maxBytesPerPass");
    public static final PathElement PATH$maxAllocationsPerPass = PathElement.groupElement("maxAllocationsPerPass");
    public static final PathElement PATH$pfnBreakCallback = PathElement.groupElement("pfnBreakCallback");
    public static final PathElement PATH$pBreakCallbackUserData = PathElement.groupElement("pBreakCallbackUserData");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pool = (AddressLayout) LAYOUT.select(PATH$pool);
    public static final OfLong LAYOUT$maxBytesPerPass = (OfLong) LAYOUT.select(PATH$maxBytesPerPass);
    public static final OfInt LAYOUT$maxAllocationsPerPass = (OfInt) LAYOUT.select(PATH$maxAllocationsPerPass);
    public static final AddressLayout LAYOUT$pfnBreakCallback = (AddressLayout) LAYOUT.select(PATH$pfnBreakCallback);
    public static final AddressLayout LAYOUT$pBreakCallbackUserData = (AddressLayout) LAYOUT.select(PATH$pBreakCallbackUserData);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pool = LAYOUT$pool.byteSize();
    public static final long SIZE$maxBytesPerPass = LAYOUT$maxBytesPerPass.byteSize();
    public static final long SIZE$maxAllocationsPerPass = LAYOUT$maxAllocationsPerPass.byteSize();
    public static final long SIZE$pfnBreakCallback = LAYOUT$pfnBreakCallback.byteSize();
    public static final long SIZE$pBreakCallbackUserData = LAYOUT$pBreakCallbackUserData.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pool = LAYOUT.byteOffset(PATH$pool);
    public static final long OFFSET$maxBytesPerPass = LAYOUT.byteOffset(PATH$maxBytesPerPass);
    public static final long OFFSET$maxAllocationsPerPass = LAYOUT.byteOffset(PATH$maxAllocationsPerPass);
    public static final long OFFSET$pfnBreakCallback = LAYOUT.byteOffset(PATH$pfnBreakCallback);
    public static final long OFFSET$pBreakCallbackUserData = LAYOUT.byteOffset(PATH$pBreakCallbackUserData);
}
