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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetCreateInfoEXT.html"><code>VkIndirectExecutionSetCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectExecutionSetCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkIndirectExecutionSetInfoTypeEXT type; // @link substring="VkIndirectExecutionSetInfoTypeEXT" target="VkIndirectExecutionSetInfoTypeEXT" @link substring="type" target="#type"
///     VkIndirectExecutionSetInfoEXT info; // @link substring="VkIndirectExecutionSetInfoEXT" target="VkIndirectExecutionSetInfoEXT" @link substring="info" target="#info"
/// } VkIndirectExecutionSetCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkIndirectExecutionSetCreateInfoEXT#allocate(Arena)}, {@link VkIndirectExecutionSetCreateInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkIndirectExecutionSetCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetCreateInfoEXT.html"><code>VkIndirectExecutionSetCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectExecutionSetCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectExecutionSetCreateInfoEXT allocate(Arena arena) {
        VkIndirectExecutionSetCreateInfoEXT ret = new VkIndirectExecutionSetCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.INDIRECT_EXECUTION_SET_CREATE_INFO_EXT);
        return ret;
    }

    public static VkIndirectExecutionSetCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetCreateInfoEXT[] ret = new VkIndirectExecutionSetCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectExecutionSetCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.INDIRECT_EXECUTION_SET_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkIndirectExecutionSetCreateInfoEXT clone(Arena arena, VkIndirectExecutionSetCreateInfoEXT src) {
        VkIndirectExecutionSetCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectExecutionSetCreateInfoEXT[] clone(Arena arena, VkIndirectExecutionSetCreateInfoEXT[] src) {
        VkIndirectExecutionSetCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.INDIRECT_EXECUTION_SET_CREATE_INFO_EXT);
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

    public @enumtype(VkIndirectExecutionSetInfoTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkIndirectExecutionSetInfoTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @NotNull VkIndirectExecutionSetInfoEXT info() {
        return new VkIndirectExecutionSetInfoEXT(segment.asSlice(OFFSET$info, LAYOUT$info));
    }

    public void info(@NotNull VkIndirectExecutionSetInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$info, SIZE$info);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        VkIndirectExecutionSetInfoEXT.LAYOUT.withName("info")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$info = PathElement.groupElement("PATH$info");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final StructLayout LAYOUT$info = (StructLayout) LAYOUT.select(PATH$info);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$info = LAYOUT$info.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$info = LAYOUT.byteOffset(PATH$info);
}
