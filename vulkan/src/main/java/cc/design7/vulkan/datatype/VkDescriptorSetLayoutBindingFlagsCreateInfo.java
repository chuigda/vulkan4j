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
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutBindingFlagsCreateInfo.html"><code>VkDescriptorSetLayoutBindingFlagsCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorSetLayoutBindingFlagsCreateInfo {
///     VkStructureType sType;
///     void const* pNext;
///     uint32_t bindingCount;
///     VkDescriptorBindingFlags const* pBindingFlags;
/// } VkDescriptorSetLayoutBindingFlagsCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO`
///
/// The {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutBindingFlagsCreateInfo.html"><code>VkDescriptorSetLayoutBindingFlagsCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorSetLayoutBindingFlagsCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo allocate(Arena arena) {
        VkDescriptorSetLayoutBindingFlagsCreateInfo ret = new VkDescriptorSetLayoutBindingFlagsCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO);
        return ret;
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutBindingFlagsCreateInfo[] ret = new VkDescriptorSetLayoutBindingFlagsCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO);
        }
        return ret;
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo clone(Arena arena, VkDescriptorSetLayoutBindingFlagsCreateInfo src) {
        VkDescriptorSetLayoutBindingFlagsCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo[] clone(Arena arena, VkDescriptorSetLayoutBindingFlagsCreateInfo[] src) {
        VkDescriptorSetLayoutBindingFlagsCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int bindingCount() {
        return segment.get(LAYOUT$bindingCount, OFFSET$bindingCount);
    }

    public void bindingCount(@unsigned int value) {
        segment.set(LAYOUT$bindingCount, OFFSET$bindingCount, value);
    }

    public @pointer(target=VkDescriptorBindingFlags.class) MemorySegment pBindingFlagsRaw() {
        return segment.get(LAYOUT$pBindingFlags, OFFSET$pBindingFlags);
    }

    public void pBindingFlagsRaw(@pointer(target=VkDescriptorBindingFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pBindingFlags, OFFSET$pBindingFlags, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkDescriptorBindingFlags.class) IntPtr pBindingFlags() {
        MemorySegment s = pBindingFlagsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pBindingFlags(@Nullable @enumtype(VkDescriptorBindingFlags.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindingFlagsRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pBindingFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$bindingCount = PathElement.groupElement("PATH$bindingCount");
    public static final PathElement PATH$pBindingFlags = PathElement.groupElement("PATH$pBindingFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$bindingCount = (OfInt) LAYOUT.select(PATH$bindingCount);
    public static final AddressLayout LAYOUT$pBindingFlags = (AddressLayout) LAYOUT.select(PATH$pBindingFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$bindingCount = LAYOUT$bindingCount.byteSize();
    public static final long SIZE$pBindingFlags = LAYOUT$pBindingFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$bindingCount = LAYOUT.byteOffset(PATH$bindingCount);
    public static final long OFFSET$pBindingFlags = LAYOUT.byteOffset(PATH$pBindingFlags);
}
