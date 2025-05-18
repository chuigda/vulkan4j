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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDrmPropertiesEXT.html"><code>VkPhysicalDeviceDrmPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceDrmPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 hasPrimary; // @link substring="hasPrimary" target="#hasPrimary"
///     VkBool32 hasRender; // @link substring="hasRender" target="#hasRender"
///     int64_t primaryMajor; // @link substring="primaryMajor" target="#primaryMajor"
///     int64_t primaryMinor; // @link substring="primaryMinor" target="#primaryMinor"
///     int64_t renderMajor; // @link substring="renderMajor" target="#renderMajor"
///     int64_t renderMinor; // @link substring="renderMinor" target="#renderMinor"
/// } VkPhysicalDeviceDrmPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT`
///
/// The {@link VkPhysicalDeviceDrmPropertiesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceDrmPropertiesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDrmPropertiesEXT.html"><code>VkPhysicalDeviceDrmPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceDrmPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceDrmPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceDrmPropertiesEXT ret = new VkPhysicalDeviceDrmPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceDrmPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDrmPropertiesEXT[] ret = new VkPhysicalDeviceDrmPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDrmPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceDrmPropertiesEXT clone(Arena arena, VkPhysicalDeviceDrmPropertiesEXT src) {
        VkPhysicalDeviceDrmPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDrmPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceDrmPropertiesEXT[] src) {
        VkPhysicalDeviceDrmPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
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

    public @unsigned int hasPrimary() {
        return segment.get(LAYOUT$hasPrimary, OFFSET$hasPrimary);
    }

    public void hasPrimary(@unsigned int value) {
        segment.set(LAYOUT$hasPrimary, OFFSET$hasPrimary, value);
    }

    public @unsigned int hasRender() {
        return segment.get(LAYOUT$hasRender, OFFSET$hasRender);
    }

    public void hasRender(@unsigned int value) {
        segment.set(LAYOUT$hasRender, OFFSET$hasRender, value);
    }

    public long primaryMajor() {
        return segment.get(LAYOUT$primaryMajor, OFFSET$primaryMajor);
    }

    public void primaryMajor(long value) {
        segment.set(LAYOUT$primaryMajor, OFFSET$primaryMajor, value);
    }

    public long primaryMinor() {
        return segment.get(LAYOUT$primaryMinor, OFFSET$primaryMinor);
    }

    public void primaryMinor(long value) {
        segment.set(LAYOUT$primaryMinor, OFFSET$primaryMinor, value);
    }

    public long renderMajor() {
        return segment.get(LAYOUT$renderMajor, OFFSET$renderMajor);
    }

    public void renderMajor(long value) {
        segment.set(LAYOUT$renderMajor, OFFSET$renderMajor, value);
    }

    public long renderMinor() {
        return segment.get(LAYOUT$renderMinor, OFFSET$renderMinor);
    }

    public void renderMinor(long value) {
        segment.set(LAYOUT$renderMinor, OFFSET$renderMinor, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasPrimary"),
        ValueLayout.JAVA_INT.withName("hasRender"),
        ValueLayout.JAVA_LONG.withName("primaryMajor"),
        ValueLayout.JAVA_LONG.withName("primaryMinor"),
        ValueLayout.JAVA_LONG.withName("renderMajor"),
        ValueLayout.JAVA_LONG.withName("renderMinor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$hasPrimary = PathElement.groupElement("PATH$hasPrimary");
    public static final PathElement PATH$hasRender = PathElement.groupElement("PATH$hasRender");
    public static final PathElement PATH$primaryMajor = PathElement.groupElement("PATH$primaryMajor");
    public static final PathElement PATH$primaryMinor = PathElement.groupElement("PATH$primaryMinor");
    public static final PathElement PATH$renderMajor = PathElement.groupElement("PATH$renderMajor");
    public static final PathElement PATH$renderMinor = PathElement.groupElement("PATH$renderMinor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$hasPrimary = (OfInt) LAYOUT.select(PATH$hasPrimary);
    public static final OfInt LAYOUT$hasRender = (OfInt) LAYOUT.select(PATH$hasRender);
    public static final OfLong LAYOUT$primaryMajor = (OfLong) LAYOUT.select(PATH$primaryMajor);
    public static final OfLong LAYOUT$primaryMinor = (OfLong) LAYOUT.select(PATH$primaryMinor);
    public static final OfLong LAYOUT$renderMajor = (OfLong) LAYOUT.select(PATH$renderMajor);
    public static final OfLong LAYOUT$renderMinor = (OfLong) LAYOUT.select(PATH$renderMinor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$hasPrimary = LAYOUT$hasPrimary.byteSize();
    public static final long SIZE$hasRender = LAYOUT$hasRender.byteSize();
    public static final long SIZE$primaryMajor = LAYOUT$primaryMajor.byteSize();
    public static final long SIZE$primaryMinor = LAYOUT$primaryMinor.byteSize();
    public static final long SIZE$renderMajor = LAYOUT$renderMajor.byteSize();
    public static final long SIZE$renderMinor = LAYOUT$renderMinor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hasPrimary = LAYOUT.byteOffset(PATH$hasPrimary);
    public static final long OFFSET$hasRender = LAYOUT.byteOffset(PATH$hasRender);
    public static final long OFFSET$primaryMajor = LAYOUT.byteOffset(PATH$primaryMajor);
    public static final long OFFSET$primaryMinor = LAYOUT.byteOffset(PATH$primaryMinor);
    public static final long OFFSET$renderMajor = LAYOUT.byteOffset(PATH$renderMajor);
    public static final long OFFSET$renderMinor = LAYOUT.byteOffset(PATH$renderMinor);
}
