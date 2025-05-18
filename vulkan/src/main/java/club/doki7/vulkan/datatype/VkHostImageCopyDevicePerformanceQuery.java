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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkHostImageCopyDevicePerformanceQuery.html"><code>VkHostImageCopyDevicePerformanceQuery</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkHostImageCopyDevicePerformanceQuery {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 optimalDeviceAccess; // @link substring="optimalDeviceAccess" target="#optimalDeviceAccess"
///     VkBool32 identicalMemoryLayout; // @link substring="identicalMemoryLayout" target="#identicalMemoryLayout"
/// } VkHostImageCopyDevicePerformanceQuery;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY`
///
/// The {@link VkHostImageCopyDevicePerformanceQuery#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkHostImageCopyDevicePerformanceQuery#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkHostImageCopyDevicePerformanceQuery.html"><code>VkHostImageCopyDevicePerformanceQuery</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkHostImageCopyDevicePerformanceQuery(@NotNull MemorySegment segment) implements IPointer {
    public static VkHostImageCopyDevicePerformanceQuery allocate(Arena arena) {
        VkHostImageCopyDevicePerformanceQuery ret = new VkHostImageCopyDevicePerformanceQuery(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY);
        return ret;
    }

    public static VkHostImageCopyDevicePerformanceQuery[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkHostImageCopyDevicePerformanceQuery[] ret = new VkHostImageCopyDevicePerformanceQuery[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkHostImageCopyDevicePerformanceQuery(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY);
        }
        return ret;
    }

    public static VkHostImageCopyDevicePerformanceQuery clone(Arena arena, VkHostImageCopyDevicePerformanceQuery src) {
        VkHostImageCopyDevicePerformanceQuery ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkHostImageCopyDevicePerformanceQuery[] clone(Arena arena, VkHostImageCopyDevicePerformanceQuery[] src) {
        VkHostImageCopyDevicePerformanceQuery[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY);
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

    public @unsigned int optimalDeviceAccess() {
        return segment.get(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess);
    }

    public void optimalDeviceAccess(@unsigned int value) {
        segment.set(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess, value);
    }

    public @unsigned int identicalMemoryLayout() {
        return segment.get(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout);
    }

    public void identicalMemoryLayout(@unsigned int value) {
        segment.set(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalDeviceAccess"),
        ValueLayout.JAVA_INT.withName("identicalMemoryLayout")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$optimalDeviceAccess = PathElement.groupElement("PATH$optimalDeviceAccess");
    public static final PathElement PATH$identicalMemoryLayout = PathElement.groupElement("PATH$identicalMemoryLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$optimalDeviceAccess = (OfInt) LAYOUT.select(PATH$optimalDeviceAccess);
    public static final OfInt LAYOUT$identicalMemoryLayout = (OfInt) LAYOUT.select(PATH$identicalMemoryLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$optimalDeviceAccess = LAYOUT$optimalDeviceAccess.byteSize();
    public static final long SIZE$identicalMemoryLayout = LAYOUT$identicalMemoryLayout.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$optimalDeviceAccess = LAYOUT.byteOffset(PATH$optimalDeviceAccess);
    public static final long OFFSET$identicalMemoryLayout = LAYOUT.byteOffset(PATH$identicalMemoryLayout);
}
