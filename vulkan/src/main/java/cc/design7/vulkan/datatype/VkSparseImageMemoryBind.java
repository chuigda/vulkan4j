package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageMemoryBind.html"><code>VkSparseImageMemoryBind</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSparseImageMemoryBind {
///     VkImageSubresource subresource;
///     VkOffset3D offset;
///     VkExtent3D extent;
///     VkDeviceMemory memory; // optional
///     VkDeviceSize memoryOffset;
///     VkSparseMemoryBindFlags flags; // optional
/// } VkSparseImageMemoryBind;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageMemoryBind.html"><code>VkSparseImageMemoryBind</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSparseImageMemoryBind(@NotNull MemorySegment segment) implements IPointer {
    public static VkSparseImageMemoryBind allocate(Arena arena) {
        VkSparseImageMemoryBind ret = new VkSparseImageMemoryBind(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkSparseImageMemoryBind[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryBind[] ret = new VkSparseImageMemoryBind[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSparseImageMemoryBind(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkSparseImageMemoryBind clone(Arena arena, VkSparseImageMemoryBind src) {
        VkSparseImageMemoryBind ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageMemoryBind[] clone(Arena arena, VkSparseImageMemoryBind[] src) {
        VkSparseImageMemoryBind[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public VkImageSubresource subresource() {
        return new VkImageSubresource(segment.asSlice(OFFSET$subresource, LAYOUT$subresource));
    }

    public void subresource(VkImageSubresource value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresource, SIZE$subresource);
    }

    public VkOffset3D offset() {
        return new VkOffset3D(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public void offset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, SIZE$offset);
    }

    public VkExtent3D extent() {
        return new VkExtent3D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
    }

    public @Nullable VkDeviceMemory memory() {
        MemorySegment s = segment.asSlice(OFFSET$memory, SIZE$memory);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void memory(@Nullable VkDeviceMemory value) {
        segment.set(LAYOUT$memory, OFFSET$memory, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public @enumtype(VkSparseMemoryBindFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseMemoryBindFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkImageSubresource.LAYOUT.withName("subresource"),
        VkOffset3D.LAYOUT.withName("offset"),
        VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$subresource = PathElement.groupElement("PATH$subresource");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$extent = PathElement.groupElement("PATH$extent");
    public static final PathElement PATH$memory = PathElement.groupElement("PATH$memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("PATH$memoryOffset");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final StructLayout LAYOUT$subresource = (StructLayout) LAYOUT.select(PATH$subresource);
    public static final StructLayout LAYOUT$offset = (StructLayout) LAYOUT.select(PATH$offset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final OfLong LAYOUT$memoryOffset = (OfLong) LAYOUT.select(PATH$memoryOffset);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long SIZE$subresource = LAYOUT$subresource.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$subresource = LAYOUT.byteOffset(PATH$subresource);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
}
