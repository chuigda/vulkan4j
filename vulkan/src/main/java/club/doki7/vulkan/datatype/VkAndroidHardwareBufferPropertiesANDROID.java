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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAndroidHardwareBufferPropertiesANDROID.html"><code>VkAndroidHardwareBufferPropertiesANDROID</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAndroidHardwareBufferPropertiesANDROID {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkDeviceSize allocationSize;
///     uint32_t memoryTypeBits;
/// } VkAndroidHardwareBufferPropertiesANDROID;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID`
///
/// The {@link VkAndroidHardwareBufferPropertiesANDROID#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAndroidHardwareBufferPropertiesANDROID#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAndroidHardwareBufferPropertiesANDROID.html"><code>VkAndroidHardwareBufferPropertiesANDROID</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAndroidHardwareBufferPropertiesANDROID(@NotNull MemorySegment segment) implements IPointer {
    public static VkAndroidHardwareBufferPropertiesANDROID allocate(Arena arena) {
        VkAndroidHardwareBufferPropertiesANDROID ret = new VkAndroidHardwareBufferPropertiesANDROID(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID);
        return ret;
    }

    public static VkAndroidHardwareBufferPropertiesANDROID[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAndroidHardwareBufferPropertiesANDROID[] ret = new VkAndroidHardwareBufferPropertiesANDROID[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAndroidHardwareBufferPropertiesANDROID(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID);
        }
        return ret;
    }

    public static VkAndroidHardwareBufferPropertiesANDROID clone(Arena arena, VkAndroidHardwareBufferPropertiesANDROID src) {
        VkAndroidHardwareBufferPropertiesANDROID ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAndroidHardwareBufferPropertiesANDROID[] clone(Arena arena, VkAndroidHardwareBufferPropertiesANDROID[] src) {
        VkAndroidHardwareBufferPropertiesANDROID[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID);
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

    public @unsigned long allocationSize() {
        return segment.get(LAYOUT$allocationSize, OFFSET$allocationSize);
    }

    public void allocationSize(@unsigned long value) {
        segment.set(LAYOUT$allocationSize, OFFSET$allocationSize, value);
    }

    public @unsigned int memoryTypeBits() {
        return segment.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);
    }

    public void memoryTypeBits(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("allocationSize"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$allocationSize = PathElement.groupElement("PATH$allocationSize");
    public static final PathElement PATH$memoryTypeBits = PathElement.groupElement("PATH$memoryTypeBits");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$allocationSize = (OfLong) LAYOUT.select(PATH$allocationSize);
    public static final OfInt LAYOUT$memoryTypeBits = (OfInt) LAYOUT.select(PATH$memoryTypeBits);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$allocationSize = LAYOUT$allocationSize.byteSize();
    public static final long SIZE$memoryTypeBits = LAYOUT$memoryTypeBits.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$allocationSize = LAYOUT.byteOffset(PATH$allocationSize);
    public static final long OFFSET$memoryTypeBits = LAYOUT.byteOffset(PATH$memoryTypeBits);
}
