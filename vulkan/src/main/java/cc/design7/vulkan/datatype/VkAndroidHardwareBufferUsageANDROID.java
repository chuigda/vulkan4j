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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAndroidHardwareBufferUsageANDROID.html"><code>VkAndroidHardwareBufferUsageANDROID</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAndroidHardwareBufferUsageANDROID {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint64_t androidHardwareBufferUsage;
/// } VkAndroidHardwareBufferUsageANDROID;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID`
///
/// The {@link VkAndroidHardwareBufferUsageANDROID#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAndroidHardwareBufferUsageANDROID#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAndroidHardwareBufferUsageANDROID.html"><code>VkAndroidHardwareBufferUsageANDROID</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAndroidHardwareBufferUsageANDROID(@NotNull MemorySegment segment) implements IPointer {
    public static VkAndroidHardwareBufferUsageANDROID allocate(Arena arena) {
        VkAndroidHardwareBufferUsageANDROID ret = new VkAndroidHardwareBufferUsageANDROID(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ANDROID_HARDWARE_BUFFER_USAGE_ANDROID);
        return ret;
    }

    public static VkAndroidHardwareBufferUsageANDROID[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAndroidHardwareBufferUsageANDROID[] ret = new VkAndroidHardwareBufferUsageANDROID[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAndroidHardwareBufferUsageANDROID(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ANDROID_HARDWARE_BUFFER_USAGE_ANDROID);
        }
        return ret;
    }

    public static VkAndroidHardwareBufferUsageANDROID clone(Arena arena, VkAndroidHardwareBufferUsageANDROID src) {
        VkAndroidHardwareBufferUsageANDROID ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAndroidHardwareBufferUsageANDROID[] clone(Arena arena, VkAndroidHardwareBufferUsageANDROID[] src) {
        VkAndroidHardwareBufferUsageANDROID[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ANDROID_HARDWARE_BUFFER_USAGE_ANDROID);
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

    public @unsigned long androidHardwareBufferUsage() {
        return segment.get(LAYOUT$androidHardwareBufferUsage, OFFSET$androidHardwareBufferUsage);
    }

    public void androidHardwareBufferUsage(@unsigned long value) {
        segment.set(LAYOUT$androidHardwareBufferUsage, OFFSET$androidHardwareBufferUsage, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("androidHardwareBufferUsage")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$androidHardwareBufferUsage = PathElement.groupElement("PATH$androidHardwareBufferUsage");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$androidHardwareBufferUsage = (OfLong) LAYOUT.select(PATH$androidHardwareBufferUsage);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$androidHardwareBufferUsage = LAYOUT$androidHardwareBufferUsage.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$androidHardwareBufferUsage = LAYOUT.byteOffset(PATH$androidHardwareBufferUsage);
}
