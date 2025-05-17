package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageConstraintsInfoFUCHSIA.html"><code>VkImageConstraintsInfoFUCHSIA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t formatConstraintsCount;
///     VkImageFormatConstraintsInfoFUCHSIA const* pFormatConstraints;
///     VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints;
///     VkImageConstraintsInfoFlagsFUCHSIA flags; // optional
/// } VkImageConstraintsInfoFUCHSIA;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_CONSTRAINTS_INFO_FUCHSIA`
///
/// The {@link VkImageConstraintsInfoFUCHSIA#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImageConstraintsInfoFUCHSIA#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageConstraintsInfoFUCHSIA.html"><code>VkImageConstraintsInfoFUCHSIA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageConstraintsInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageConstraintsInfoFUCHSIA allocate(Arena arena) {
        VkImageConstraintsInfoFUCHSIA ret = new VkImageConstraintsInfoFUCHSIA(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_CONSTRAINTS_INFO_FUCHSIA);
        return ret;
    }

    public static VkImageConstraintsInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageConstraintsInfoFUCHSIA[] ret = new VkImageConstraintsInfoFUCHSIA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageConstraintsInfoFUCHSIA(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMAGE_CONSTRAINTS_INFO_FUCHSIA);
        }
        return ret;
    }

    public static VkImageConstraintsInfoFUCHSIA clone(Arena arena, VkImageConstraintsInfoFUCHSIA src) {
        VkImageConstraintsInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageConstraintsInfoFUCHSIA[] clone(Arena arena, VkImageConstraintsInfoFUCHSIA[] src) {
        VkImageConstraintsInfoFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_CONSTRAINTS_INFO_FUCHSIA);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int formatConstraintsCount() {
        return segment.get(LAYOUT$formatConstraintsCount, OFFSET$formatConstraintsCount);
    }

    public void formatConstraintsCount(@unsigned int value) {
        segment.set(LAYOUT$formatConstraintsCount, OFFSET$formatConstraintsCount, value);
    }

    public @pointer(comment="VkImageFormatConstraintsInfoFUCHSIA*") MemorySegment pFormatConstraintsRaw() {
        return segment.get(LAYOUT$pFormatConstraints, OFFSET$pFormatConstraints);
    }

    public void pFormatConstraintsRaw(@pointer(comment="VkImageFormatConstraintsInfoFUCHSIA*") MemorySegment value) {
        segment.set(LAYOUT$pFormatConstraints, OFFSET$pFormatConstraints, value);
    }

    public @Nullable VkImageFormatConstraintsInfoFUCHSIA pFormatConstraints() {
        MemorySegment s = pFormatConstraintsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImageFormatConstraintsInfoFUCHSIA(s);
    }

    public void pFormatConstraints(@Nullable VkImageFormatConstraintsInfoFUCHSIA value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFormatConstraintsRaw(s);
    }

    @unsafe public @Nullable VkImageFormatConstraintsInfoFUCHSIA[] pFormatConstraints(int assumedCount) {
        MemorySegment s = pFormatConstraintsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkImageFormatConstraintsInfoFUCHSIA.BYTES);
        VkImageFormatConstraintsInfoFUCHSIA[] ret = new VkImageFormatConstraintsInfoFUCHSIA[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkImageFormatConstraintsInfoFUCHSIA(s.asSlice(i * VkImageFormatConstraintsInfoFUCHSIA.BYTES, VkImageFormatConstraintsInfoFUCHSIA.BYTES));
        }
        return ret;
    }

    public VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints() {
        return new VkBufferCollectionConstraintsInfoFUCHSIA(segment.asSlice(OFFSET$bufferCollectionConstraints, LAYOUT$bufferCollectionConstraints));
    }

    public void bufferCollectionConstraints(VkBufferCollectionConstraintsInfoFUCHSIA value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bufferCollectionConstraints, SIZE$bufferCollectionConstraints);
    }

    public @enumtype(VkImageConstraintsInfoFlagsFUCHSIA.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageConstraintsInfoFlagsFUCHSIA.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatConstraintsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageFormatConstraintsInfoFUCHSIA.LAYOUT).withName("pFormatConstraints"),
        VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$formatConstraintsCount = PathElement.groupElement("PATH$formatConstraintsCount");
    public static final PathElement PATH$pFormatConstraints = PathElement.groupElement("PATH$pFormatConstraints");
    public static final PathElement PATH$bufferCollectionConstraints = PathElement.groupElement("PATH$bufferCollectionConstraints");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$formatConstraintsCount = (OfInt) LAYOUT.select(PATH$formatConstraintsCount);
    public static final AddressLayout LAYOUT$pFormatConstraints = (AddressLayout) LAYOUT.select(PATH$pFormatConstraints);
    public static final StructLayout LAYOUT$bufferCollectionConstraints = (StructLayout) LAYOUT.select(PATH$bufferCollectionConstraints);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$formatConstraintsCount = LAYOUT$formatConstraintsCount.byteSize();
    public static final long SIZE$pFormatConstraints = LAYOUT$pFormatConstraints.byteSize();
    public static final long SIZE$bufferCollectionConstraints = LAYOUT$bufferCollectionConstraints.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatConstraintsCount = LAYOUT.byteOffset(PATH$formatConstraintsCount);
    public static final long OFFSET$pFormatConstraints = LAYOUT.byteOffset(PATH$pFormatConstraints);
    public static final long OFFSET$bufferCollectionConstraints = LAYOUT.byteOffset(PATH$bufferCollectionConstraints);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
}
