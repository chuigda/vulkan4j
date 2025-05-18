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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsObjectTagInfoEXT.html"><code>VkDebugUtilsObjectTagInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDebugUtilsObjectTagInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkObjectType objectType; // @link substring="VkObjectType" target="VkObjectType" @link substring="objectType" target="#objectType"
///     uint64_t objectHandle; // @link substring="objectHandle" target="#objectHandle"
///     uint64_t tagName; // @link substring="tagName" target="#tagName"
///     size_t tagSize; // @link substring="tagSize" target="#tagSize"
///     void const* pTag; // @link substring="pTag" target="#pTag"
/// } VkDebugUtilsObjectTagInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT`
///
/// The {@code allocate} ({@link VkDebugUtilsObjectTagInfoEXT#allocate(Arena)}, {@link VkDebugUtilsObjectTagInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDebugUtilsObjectTagInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsObjectTagInfoEXT.html"><code>VkDebugUtilsObjectTagInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDebugUtilsObjectTagInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDebugUtilsObjectTagInfoEXT allocate(Arena arena) {
        VkDebugUtilsObjectTagInfoEXT ret = new VkDebugUtilsObjectTagInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEBUG_UTILS_OBJECT_TAG_INFO_EXT);
        return ret;
    }

    public static VkDebugUtilsObjectTagInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsObjectTagInfoEXT[] ret = new VkDebugUtilsObjectTagInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDebugUtilsObjectTagInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEBUG_UTILS_OBJECT_TAG_INFO_EXT);
        }
        return ret;
    }

    public static VkDebugUtilsObjectTagInfoEXT clone(Arena arena, VkDebugUtilsObjectTagInfoEXT src) {
        VkDebugUtilsObjectTagInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugUtilsObjectTagInfoEXT[] clone(Arena arena, VkDebugUtilsObjectTagInfoEXT[] src) {
        VkDebugUtilsObjectTagInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEBUG_UTILS_OBJECT_TAG_INFO_EXT);
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

    public @enumtype(VkObjectType.class) int objectType() {
        return segment.get(LAYOUT$objectType, OFFSET$objectType);
    }

    public void objectType(@enumtype(VkObjectType.class) int value) {
        segment.set(LAYOUT$objectType, OFFSET$objectType, value);
    }

    public @unsigned long objectHandle() {
        return segment.get(LAYOUT$objectHandle, OFFSET$objectHandle);
    }

    public void objectHandle(@unsigned long value) {
        segment.set(LAYOUT$objectHandle, OFFSET$objectHandle, value);
    }

    public @unsigned long tagName() {
        return segment.get(LAYOUT$tagName, OFFSET$tagName);
    }

    public void tagName(@unsigned long value) {
        segment.set(LAYOUT$tagName, OFFSET$tagName, value);
    }

    public @unsigned long tagSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$tagSize);
    }

    public void tagSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$tagSize, value);
    }

    public @pointer(comment="void*") MemorySegment pTag() {
        return segment.get(LAYOUT$pTag, OFFSET$pTag);
    }

    public void pTag(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pTag, OFFSET$pTag, value);
    }

    public void pTag(@Nullable IPointer pointer) {
        pTag(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        NativeLayout.C_SIZE_T.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$objectType = PathElement.groupElement("PATH$objectType");
    public static final PathElement PATH$objectHandle = PathElement.groupElement("PATH$objectHandle");
    public static final PathElement PATH$tagName = PathElement.groupElement("PATH$tagName");
    public static final PathElement PATH$tagSize = PathElement.groupElement("PATH$tagSize");
    public static final PathElement PATH$pTag = PathElement.groupElement("PATH$pTag");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$objectType = (OfInt) LAYOUT.select(PATH$objectType);
    public static final OfLong LAYOUT$objectHandle = (OfLong) LAYOUT.select(PATH$objectHandle);
    public static final OfLong LAYOUT$tagName = (OfLong) LAYOUT.select(PATH$tagName);
    public static final AddressLayout LAYOUT$pTag = (AddressLayout) LAYOUT.select(PATH$pTag);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$objectType = LAYOUT$objectType.byteSize();
    public static final long SIZE$objectHandle = LAYOUT$objectHandle.byteSize();
    public static final long SIZE$tagName = LAYOUT$tagName.byteSize();
    public static final long SIZE$tagSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pTag = LAYOUT$pTag.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$objectType = LAYOUT.byteOffset(PATH$objectType);
    public static final long OFFSET$objectHandle = LAYOUT.byteOffset(PATH$objectHandle);
    public static final long OFFSET$tagName = LAYOUT.byteOffset(PATH$tagName);
    public static final long OFFSET$tagSize = LAYOUT.byteOffset(PATH$tagSize);
    public static final long OFFSET$pTag = LAYOUT.byteOffset(PATH$pTag);
}
