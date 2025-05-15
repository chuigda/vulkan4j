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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMemoryHostPointerInfoEXT.html"><code>VkImportMemoryHostPointerInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImportMemoryHostPointerInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkExternalMemoryHandleTypeFlags handleType;
///     void* pHostPointer;
/// } VkImportMemoryHostPointerInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT`
///
/// The {@link VkImportMemoryHostPointerInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImportMemoryHostPointerInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMemoryHostPointerInfoEXT.html"><code>VkImportMemoryHostPointerInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImportMemoryHostPointerInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkImportMemoryHostPointerInfoEXT allocate(Arena arena) {
        VkImportMemoryHostPointerInfoEXT ret = new VkImportMemoryHostPointerInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMPORT_MEMORY_HOST_POINTER_INFO_EXT);
        return ret;
    }

    public static VkImportMemoryHostPointerInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMemoryHostPointerInfoEXT[] ret = new VkImportMemoryHostPointerInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImportMemoryHostPointerInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMPORT_MEMORY_HOST_POINTER_INFO_EXT);
        }
        return ret;
    }

    public static VkImportMemoryHostPointerInfoEXT clone(Arena arena, VkImportMemoryHostPointerInfoEXT src) {
        VkImportMemoryHostPointerInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportMemoryHostPointerInfoEXT[] clone(Arena arena, VkImportMemoryHostPointerInfoEXT[] src) {
        VkImportMemoryHostPointerInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMPORT_MEMORY_HOST_POINTER_INFO_EXT);
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

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public @pointer(comment="void*") MemorySegment pHostPointer() {
        return segment.get(LAYOUT$pHostPointer, OFFSET$pHostPointer);
    }

    public void pHostPointer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pHostPointer, OFFSET$pHostPointer, value);
    }

    public void pHostPointer(IPointer pointer) {
        pHostPointer(pointer.segment());
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("pHostPointer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$handleType = PathElement.groupElement("PATH$handleType");
    public static final PathElement PATH$pHostPointer = PathElement.groupElement("PATH$pHostPointer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final AddressLayout LAYOUT$pHostPointer = (AddressLayout) LAYOUT.select(PATH$pHostPointer);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$pHostPointer = LAYOUT$pHostPointer.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$pHostPointer = LAYOUT.byteOffset(PATH$pHostPointer);
}
