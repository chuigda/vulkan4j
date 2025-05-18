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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMemoryZirconHandleInfoFUCHSIA.html"><code>VkImportMemoryZirconHandleInfoFUCHSIA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImportMemoryZirconHandleInfoFUCHSIA {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkExternalMemoryHandleTypeFlags handleType; // optional // @link substring="VkExternalMemoryHandleTypeFlags" target="VkExternalMemoryHandleTypeFlags" @link substring="handleType" target="#handleType"
///     zx_handle_t handle; // optional // @link substring="handle" target="#handle"
/// } VkImportMemoryZirconHandleInfoFUCHSIA;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMPORT_MEMORY_ZIRCON_HANDLE_INFO_FUCHSIA`
///
/// The {@code allocate} ({@link VkImportMemoryZirconHandleInfoFUCHSIA#allocate(Arena)}, {@link VkImportMemoryZirconHandleInfoFUCHSIA#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImportMemoryZirconHandleInfoFUCHSIA#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMemoryZirconHandleInfoFUCHSIA.html"><code>VkImportMemoryZirconHandleInfoFUCHSIA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImportMemoryZirconHandleInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public static VkImportMemoryZirconHandleInfoFUCHSIA allocate(Arena arena) {
        VkImportMemoryZirconHandleInfoFUCHSIA ret = new VkImportMemoryZirconHandleInfoFUCHSIA(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMPORT_MEMORY_ZIRCON_HANDLE_INFO_FUCHSIA);
        return ret;
    }

    public static VkImportMemoryZirconHandleInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMemoryZirconHandleInfoFUCHSIA[] ret = new VkImportMemoryZirconHandleInfoFUCHSIA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImportMemoryZirconHandleInfoFUCHSIA(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMPORT_MEMORY_ZIRCON_HANDLE_INFO_FUCHSIA);
        }
        return ret;
    }

    public static VkImportMemoryZirconHandleInfoFUCHSIA clone(Arena arena, VkImportMemoryZirconHandleInfoFUCHSIA src) {
        VkImportMemoryZirconHandleInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportMemoryZirconHandleInfoFUCHSIA[] clone(Arena arena, VkImportMemoryZirconHandleInfoFUCHSIA[] src) {
        VkImportMemoryZirconHandleInfoFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMPORT_MEMORY_ZIRCON_HANDLE_INFO_FUCHSIA);
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

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public @unsigned int handle() {
        return segment.get(LAYOUT$handle, OFFSET$handle);
    }

    public void handle(@unsigned int value) {
        segment.set(LAYOUT$handle, OFFSET$handle, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("handle")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$handleType = PathElement.groupElement("PATH$handleType");
    public static final PathElement PATH$handle = PathElement.groupElement("PATH$handle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final OfInt LAYOUT$handle = (OfInt) LAYOUT.select(PATH$handle);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$handle = LAYOUT$handle.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);
}
