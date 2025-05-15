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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlaneCapabilities2KHR.html"><code>VkDisplayPlaneCapabilities2KHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayPlaneCapabilities2KHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkDisplayPlaneCapabilitiesKHR capabilities;
/// } VkDisplayPlaneCapabilities2KHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR`
///
/// The {@link VkDisplayPlaneCapabilities2KHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDisplayPlaneCapabilities2KHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlaneCapabilities2KHR.html"><code>VkDisplayPlaneCapabilities2KHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayPlaneCapabilities2KHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkDisplayPlaneCapabilities2KHR allocate(Arena arena) {
        VkDisplayPlaneCapabilities2KHR ret = new VkDisplayPlaneCapabilities2KHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DISPLAY_PLANE_CAPABILITIES_2_KHR);
        return ret;
    }

    public static VkDisplayPlaneCapabilities2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlaneCapabilities2KHR[] ret = new VkDisplayPlaneCapabilities2KHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPlaneCapabilities2KHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DISPLAY_PLANE_CAPABILITIES_2_KHR);
        }
        return ret;
    }

    public static VkDisplayPlaneCapabilities2KHR clone(Arena arena, VkDisplayPlaneCapabilities2KHR src) {
        VkDisplayPlaneCapabilities2KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPlaneCapabilities2KHR[] clone(Arena arena, VkDisplayPlaneCapabilities2KHR[] src) {
        VkDisplayPlaneCapabilities2KHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DISPLAY_PLANE_CAPABILITIES_2_KHR);
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

    public VkDisplayPlaneCapabilitiesKHR capabilities() {
        return new VkDisplayPlaneCapabilitiesKHR(segment.asSlice(OFFSET$capabilities, LAYOUT$capabilities));
    }

    public void capabilities(VkDisplayPlaneCapabilitiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$capabilities, SIZE$capabilities);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayPlaneCapabilitiesKHR.LAYOUT.withName("capabilities")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$capabilities = PathElement.groupElement("PATH$capabilities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$capabilities = (StructLayout) LAYOUT.select(PATH$capabilities);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$capabilities = LAYOUT$capabilities.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$capabilities = LAYOUT.byteOffset(PATH$capabilities);
}
