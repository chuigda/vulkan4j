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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugMarkerObjectNameInfoEXT.html"><code>VkDebugMarkerObjectNameInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDebugMarkerObjectNameInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDebugReportObjectTypeEXT objectType;
///     uint64_t object;
///     char const* pObjectName;
/// } VkDebugMarkerObjectNameInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT`
///
/// The {@link VkDebugMarkerObjectNameInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDebugMarkerObjectNameInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugMarkerObjectNameInfoEXT.html"><code>VkDebugMarkerObjectNameInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDebugMarkerObjectNameInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDebugMarkerObjectNameInfoEXT allocate(Arena arena) {
        VkDebugMarkerObjectNameInfoEXT ret = new VkDebugMarkerObjectNameInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEBUG_MARKER_OBJECT_NAME_INFO_EXT);
        return ret;
    }

    public static VkDebugMarkerObjectNameInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugMarkerObjectNameInfoEXT[] ret = new VkDebugMarkerObjectNameInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDebugMarkerObjectNameInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEBUG_MARKER_OBJECT_NAME_INFO_EXT);
        }
        return ret;
    }

    public static VkDebugMarkerObjectNameInfoEXT clone(Arena arena, VkDebugMarkerObjectNameInfoEXT src) {
        VkDebugMarkerObjectNameInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugMarkerObjectNameInfoEXT[] clone(Arena arena, VkDebugMarkerObjectNameInfoEXT[] src) {
        VkDebugMarkerObjectNameInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEBUG_MARKER_OBJECT_NAME_INFO_EXT);
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

    public @enumtype(VkDebugReportObjectTypeEXT.class) int objectType() {
        return segment.get(LAYOUT$objectType, OFFSET$objectType);
    }

    public void objectType(@enumtype(VkDebugReportObjectTypeEXT.class) int value) {
        segment.set(LAYOUT$objectType, OFFSET$objectType, value);
    }

    public @unsigned long object() {
        return segment.get(LAYOUT$object, OFFSET$object);
    }

    public void object(@unsigned long value) {
        segment.set(LAYOUT$object, OFFSET$object, value);
    }

    public @pointer(comment="byte*") MemorySegment pObjectNameRaw() {
        return segment.get(LAYOUT$pObjectName, OFFSET$pObjectName);
    }

    public void pObjectNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pObjectName, OFFSET$pObjectName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pObjectName() {
        MemorySegment s = pObjectNameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pObjectName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pObjectNameRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pObjectName")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$objectType = PathElement.groupElement("PATH$objectType");
    public static final PathElement PATH$object = PathElement.groupElement("PATH$object");
    public static final PathElement PATH$pObjectName = PathElement.groupElement("PATH$pObjectName");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$objectType = (OfInt) LAYOUT.select(PATH$objectType);
    public static final OfLong LAYOUT$object = (OfLong) LAYOUT.select(PATH$object);
    public static final AddressLayout LAYOUT$pObjectName = (AddressLayout) LAYOUT.select(PATH$pObjectName);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$objectType = LAYOUT$objectType.byteSize();
    public static final long SIZE$object = LAYOUT$object.byteSize();
    public static final long SIZE$pObjectName = LAYOUT$pObjectName.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$objectType = LAYOUT.byteOffset(PATH$objectType);
    public static final long OFFSET$object = LAYOUT.byteOffset(PATH$object);
    public static final long OFFSET$pObjectName = LAYOUT.byteOffset(PATH$pObjectName);
}
