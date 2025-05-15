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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferBindingInfoEXT.html"><code>VkDescriptorBufferBindingInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorBufferBindingInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDeviceAddress address;
///     VkBufferUsageFlags usage; // optional
/// } VkDescriptorBufferBindingInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT`
///
/// The {@link VkDescriptorBufferBindingInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDescriptorBufferBindingInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferBindingInfoEXT.html"><code>VkDescriptorBufferBindingInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorBufferBindingInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorBufferBindingInfoEXT allocate(Arena arena) {
        VkDescriptorBufferBindingInfoEXT ret = new VkDescriptorBufferBindingInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DESCRIPTOR_BUFFER_BINDING_INFO_EXT);
        return ret;
    }

    public static VkDescriptorBufferBindingInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorBufferBindingInfoEXT[] ret = new VkDescriptorBufferBindingInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorBufferBindingInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DESCRIPTOR_BUFFER_BINDING_INFO_EXT);
        }
        return ret;
    }

    public static VkDescriptorBufferBindingInfoEXT clone(Arena arena, VkDescriptorBufferBindingInfoEXT src) {
        VkDescriptorBufferBindingInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorBufferBindingInfoEXT[] clone(Arena arena, VkDescriptorBufferBindingInfoEXT[] src) {
        VkDescriptorBufferBindingInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DESCRIPTOR_BUFFER_BINDING_INFO_EXT);
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

    public @unsigned long address() {
        return segment.get(LAYOUT$address, OFFSET$address);
    }

    public void address(@unsigned long value) {
        segment.set(LAYOUT$address, OFFSET$address, value);
    }

    public @enumtype(VkBufferUsageFlags.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public void usage(@enumtype(VkBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_INT.withName("usage")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$address = PathElement.groupElement("PATH$address");
    public static final PathElement PATH$usage = PathElement.groupElement("PATH$usage");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$address = (OfLong) LAYOUT.select(PATH$address);
    public static final OfInt LAYOUT$usage = (OfInt) LAYOUT.select(PATH$usage);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$address = LAYOUT$address.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$address = LAYOUT.byteOffset(PATH$address);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
}
