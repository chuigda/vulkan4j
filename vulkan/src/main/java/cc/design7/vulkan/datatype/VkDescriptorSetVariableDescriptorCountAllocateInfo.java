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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetVariableDescriptorCountAllocateInfo.html"><code>VkDescriptorSetVariableDescriptorCountAllocateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorSetVariableDescriptorCountAllocateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t descriptorSetCount; // optional
///     uint32_t const* pDescriptorCounts;
/// } VkDescriptorSetVariableDescriptorCountAllocateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO`
///
/// The {@link VkDescriptorSetVariableDescriptorCountAllocateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDescriptorSetVariableDescriptorCountAllocateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetVariableDescriptorCountAllocateInfo.html"><code>VkDescriptorSetVariableDescriptorCountAllocateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorSetVariableDescriptorCountAllocateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo allocate(Arena arena) {
        VkDescriptorSetVariableDescriptorCountAllocateInfo ret = new VkDescriptorSetVariableDescriptorCountAllocateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO);
        return ret;
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetVariableDescriptorCountAllocateInfo[] ret = new VkDescriptorSetVariableDescriptorCountAllocateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorSetVariableDescriptorCountAllocateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO);
        }
        return ret;
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo clone(Arena arena, VkDescriptorSetVariableDescriptorCountAllocateInfo src) {
        VkDescriptorSetVariableDescriptorCountAllocateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo[] clone(Arena arena, VkDescriptorSetVariableDescriptorCountAllocateInfo[] src) {
        VkDescriptorSetVariableDescriptorCountAllocateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO);
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

    public @unsigned int descriptorSetCount() {
        return segment.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);
    }

    public void descriptorSetCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);
    }

    public @pointer(comment="int*") MemorySegment pDescriptorCountsRaw() {
        return segment.get(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts);
    }

    public void pDescriptorCountsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pDescriptorCounts() {
        MemorySegment s = pDescriptorCountsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDescriptorCounts(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorCountsRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDescriptorCounts")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("PATH$descriptorSetCount");
    public static final PathElement PATH$pDescriptorCounts = PathElement.groupElement("PATH$pDescriptorCounts");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSetCount = (OfInt) LAYOUT.select(PATH$descriptorSetCount);
    public static final AddressLayout LAYOUT$pDescriptorCounts = (AddressLayout) LAYOUT.select(PATH$pDescriptorCounts);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorSetCount = LAYOUT$descriptorSetCount.byteSize();
    public static final long SIZE$pDescriptorCounts = LAYOUT$pDescriptorCounts.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pDescriptorCounts = LAYOUT.byteOffset(PATH$pDescriptorCounts);
}
