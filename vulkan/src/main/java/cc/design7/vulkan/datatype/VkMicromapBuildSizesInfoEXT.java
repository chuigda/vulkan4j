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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapBuildSizesInfoEXT.html"><code>VkMicromapBuildSizesInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMicromapBuildSizesInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDeviceSize micromapSize;
///     VkDeviceSize buildScratchSize;
///     VkBool32 discardable;
/// } VkMicromapBuildSizesInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT`
///
/// The {@link VkMicromapBuildSizesInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkMicromapBuildSizesInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapBuildSizesInfoEXT.html"><code>VkMicromapBuildSizesInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMicromapBuildSizesInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkMicromapBuildSizesInfoEXT allocate(Arena arena) {
        VkMicromapBuildSizesInfoEXT ret = new VkMicromapBuildSizesInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MICROMAP_BUILD_SIZES_INFO_EXT);
        return ret;
    }

    public static VkMicromapBuildSizesInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMicromapBuildSizesInfoEXT[] ret = new VkMicromapBuildSizesInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMicromapBuildSizesInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MICROMAP_BUILD_SIZES_INFO_EXT);
        }
        return ret;
    }

    public static VkMicromapBuildSizesInfoEXT clone(Arena arena, VkMicromapBuildSizesInfoEXT src) {
        VkMicromapBuildSizesInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMicromapBuildSizesInfoEXT[] clone(Arena arena, VkMicromapBuildSizesInfoEXT[] src) {
        VkMicromapBuildSizesInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MICROMAP_BUILD_SIZES_INFO_EXT);
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

    public @unsigned long micromapSize() {
        return segment.get(LAYOUT$micromapSize, OFFSET$micromapSize);
    }

    public void micromapSize(@unsigned long value) {
        segment.set(LAYOUT$micromapSize, OFFSET$micromapSize, value);
    }

    public @unsigned long buildScratchSize() {
        return segment.get(LAYOUT$buildScratchSize, OFFSET$buildScratchSize);
    }

    public void buildScratchSize(@unsigned long value) {
        segment.set(LAYOUT$buildScratchSize, OFFSET$buildScratchSize, value);
    }

    public @unsigned int discardable() {
        return segment.get(LAYOUT$discardable, OFFSET$discardable);
    }

    public void discardable(@unsigned int value) {
        segment.set(LAYOUT$discardable, OFFSET$discardable, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("micromapSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize"),
        ValueLayout.JAVA_INT.withName("discardable")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$micromapSize = PathElement.groupElement("PATH$micromapSize");
    public static final PathElement PATH$buildScratchSize = PathElement.groupElement("PATH$buildScratchSize");
    public static final PathElement PATH$discardable = PathElement.groupElement("PATH$discardable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$micromapSize = (OfLong) LAYOUT.select(PATH$micromapSize);
    public static final OfLong LAYOUT$buildScratchSize = (OfLong) LAYOUT.select(PATH$buildScratchSize);
    public static final OfInt LAYOUT$discardable = (OfInt) LAYOUT.select(PATH$discardable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$micromapSize = LAYOUT$micromapSize.byteSize();
    public static final long SIZE$buildScratchSize = LAYOUT$buildScratchSize.byteSize();
    public static final long SIZE$discardable = LAYOUT$discardable.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$micromapSize = LAYOUT.byteOffset(PATH$micromapSize);
    public static final long OFFSET$buildScratchSize = LAYOUT.byteOffset(PATH$buildScratchSize);
    public static final long OFFSET$discardable = LAYOUT.byteOffset(PATH$discardable);
}
