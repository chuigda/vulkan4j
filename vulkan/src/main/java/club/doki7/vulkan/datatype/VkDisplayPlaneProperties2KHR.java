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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlaneProperties2KHR.html"><code>VkDisplayPlaneProperties2KHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayPlaneProperties2KHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDisplayPlanePropertiesKHR displayPlaneProperties; // @link substring="VkDisplayPlanePropertiesKHR" target="VkDisplayPlanePropertiesKHR" @link substring="displayPlaneProperties" target="#displayPlaneProperties"
/// } VkDisplayPlaneProperties2KHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR`
///
/// The {@code allocate} ({@link VkDisplayPlaneProperties2KHR#allocate(Arena)}, {@link VkDisplayPlaneProperties2KHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDisplayPlaneProperties2KHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlaneProperties2KHR.html"><code>VkDisplayPlaneProperties2KHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayPlaneProperties2KHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkDisplayPlaneProperties2KHR allocate(Arena arena) {
        VkDisplayPlaneProperties2KHR ret = new VkDisplayPlaneProperties2KHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DISPLAY_PLANE_PROPERTIES_2_KHR);
        return ret;
    }

    public static VkDisplayPlaneProperties2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlaneProperties2KHR[] ret = new VkDisplayPlaneProperties2KHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPlaneProperties2KHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DISPLAY_PLANE_PROPERTIES_2_KHR);
        }
        return ret;
    }

    public static VkDisplayPlaneProperties2KHR clone(Arena arena, VkDisplayPlaneProperties2KHR src) {
        VkDisplayPlaneProperties2KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPlaneProperties2KHR[] clone(Arena arena, VkDisplayPlaneProperties2KHR[] src) {
        VkDisplayPlaneProperties2KHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DISPLAY_PLANE_PROPERTIES_2_KHR);
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

    public @NotNull VkDisplayPlanePropertiesKHR displayPlaneProperties() {
        return new VkDisplayPlanePropertiesKHR(segment.asSlice(OFFSET$displayPlaneProperties, LAYOUT$displayPlaneProperties));
    }

    public void displayPlaneProperties(@NotNull VkDisplayPlanePropertiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPlaneProperties, SIZE$displayPlaneProperties);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayPlanePropertiesKHR.LAYOUT.withName("displayPlaneProperties")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$displayPlaneProperties = PathElement.groupElement("displayPlaneProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$displayPlaneProperties = (StructLayout) LAYOUT.select(PATH$displayPlaneProperties);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$displayPlaneProperties = LAYOUT$displayPlaneProperties.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayPlaneProperties = LAYOUT.byteOffset(PATH$displayPlaneProperties);
}
