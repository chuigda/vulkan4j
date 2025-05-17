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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorPoolCreateInfo.html"><code>VkDescriptorPoolCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorPoolCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDescriptorPoolCreateFlags flags; // optional
///     uint32_t maxSets;
///     uint32_t poolSizeCount; // optional
///     VkDescriptorPoolSize const* pPoolSizes;
/// } VkDescriptorPoolCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO`
///
/// The {@link VkDescriptorPoolCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDescriptorPoolCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorPoolCreateInfo.html"><code>VkDescriptorPoolCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorPoolCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorPoolCreateInfo allocate(Arena arena) {
        VkDescriptorPoolCreateInfo ret = new VkDescriptorPoolCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DESCRIPTOR_POOL_CREATE_INFO);
        return ret;
    }

    public static VkDescriptorPoolCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorPoolCreateInfo[] ret = new VkDescriptorPoolCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorPoolCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DESCRIPTOR_POOL_CREATE_INFO);
        }
        return ret;
    }

    public static VkDescriptorPoolCreateInfo clone(Arena arena, VkDescriptorPoolCreateInfo src) {
        VkDescriptorPoolCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorPoolCreateInfo[] clone(Arena arena, VkDescriptorPoolCreateInfo[] src) {
        VkDescriptorPoolCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DESCRIPTOR_POOL_CREATE_INFO);
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

    public @enumtype(VkDescriptorPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int maxSets() {
        return segment.get(LAYOUT$maxSets, OFFSET$maxSets);
    }

    public void maxSets(@unsigned int value) {
        segment.set(LAYOUT$maxSets, OFFSET$maxSets, value);
    }

    public @unsigned int poolSizeCount() {
        return segment.get(LAYOUT$poolSizeCount, OFFSET$poolSizeCount);
    }

    public void poolSizeCount(@unsigned int value) {
        segment.set(LAYOUT$poolSizeCount, OFFSET$poolSizeCount, value);
    }

    public @pointer(comment="VkDescriptorPoolSize*") MemorySegment pPoolSizesRaw() {
        return segment.get(LAYOUT$pPoolSizes, OFFSET$pPoolSizes);
    }

    public void pPoolSizesRaw(@pointer(comment="VkDescriptorPoolSize*") MemorySegment value) {
        segment.set(LAYOUT$pPoolSizes, OFFSET$pPoolSizes, value);
    }

    public @Nullable VkDescriptorPoolSize pPoolSizes() {
        MemorySegment s = pPoolSizesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorPoolSize(s);
    }

    public void pPoolSizes(@Nullable VkDescriptorPoolSize value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPoolSizesRaw(s);
    }

    @unsafe public @Nullable VkDescriptorPoolSize[] pPoolSizes(int assumedCount) {
        MemorySegment s = pPoolSizesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorPoolSize.BYTES);
        VkDescriptorPoolSize[] ret = new VkDescriptorPoolSize[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorPoolSize(s.asSlice(i * VkDescriptorPoolSize.BYTES, VkDescriptorPoolSize.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxSets"),
        ValueLayout.JAVA_INT.withName("poolSizeCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorPoolSize.LAYOUT).withName("pPoolSizes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$maxSets = PathElement.groupElement("PATH$maxSets");
    public static final PathElement PATH$poolSizeCount = PathElement.groupElement("PATH$poolSizeCount");
    public static final PathElement PATH$pPoolSizes = PathElement.groupElement("PATH$pPoolSizes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$maxSets = (OfInt) LAYOUT.select(PATH$maxSets);
    public static final OfInt LAYOUT$poolSizeCount = (OfInt) LAYOUT.select(PATH$poolSizeCount);
    public static final AddressLayout LAYOUT$pPoolSizes = (AddressLayout) LAYOUT.select(PATH$pPoolSizes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$maxSets = LAYOUT$maxSets.byteSize();
    public static final long SIZE$poolSizeCount = LAYOUT$poolSizeCount.byteSize();
    public static final long SIZE$pPoolSizes = LAYOUT$pPoolSizes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$maxSets = LAYOUT.byteOffset(PATH$maxSets);
    public static final long OFFSET$poolSizeCount = LAYOUT.byteOffset(PATH$poolSizeCount);
    public static final long OFFSET$pPoolSizes = LAYOUT.byteOffset(PATH$pPoolSizes);
}
