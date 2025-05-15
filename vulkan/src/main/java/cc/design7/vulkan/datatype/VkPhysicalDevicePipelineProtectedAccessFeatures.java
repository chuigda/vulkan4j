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

/// Represents a pointer to a {@code VkPhysicalDevicePipelineProtectedAccessFeatures} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineProtectedAccessFeatures.html">VkPhysicalDevicePipelineProtectedAccessFeatures</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevicePipelineProtectedAccessFeatures(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePipelineProtectedAccessFeatures {
        sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures allocate(Arena arena) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineProtectedAccessFeatures[] ret = new VkPhysicalDevicePipelineProtectedAccessFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePipelineProtectedAccessFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures clone(Arena arena, VkPhysicalDevicePipelineProtectedAccessFeatures src) {
        VkPhysicalDevicePipelineProtectedAccessFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures[] clone(Arena arena, VkPhysicalDevicePipelineProtectedAccessFeatures[] src) {
        VkPhysicalDevicePipelineProtectedAccessFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineProtectedAccess")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pipelineProtectedAccess = PathElement.groupElement("PATH$pipelineProtectedAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineProtectedAccess = (OfInt) LAYOUT.select(PATH$pipelineProtectedAccess);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineProtectedAccess = LAYOUT$pipelineProtectedAccess.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineProtectedAccess = LAYOUT.byteOffset(PATH$pipelineProtectedAccess);

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

    public @unsigned int pipelineProtectedAccess() {
        return segment.get(LAYOUT$pipelineProtectedAccess, OFFSET$pipelineProtectedAccess);
    }

    public void pipelineProtectedAccess(@unsigned int value) {
        segment.set(LAYOUT$pipelineProtectedAccess, OFFSET$pipelineProtectedAccess, value);
    }

}
