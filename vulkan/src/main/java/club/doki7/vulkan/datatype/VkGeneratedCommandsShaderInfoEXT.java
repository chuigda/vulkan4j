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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsShaderInfoEXT.html"><code>VkGeneratedCommandsShaderInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkGeneratedCommandsShaderInfoEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t shaderCount;
///     VkShaderEXT const* pShaders;
/// } VkGeneratedCommandsShaderInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT`
///
/// The {@link VkGeneratedCommandsShaderInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkGeneratedCommandsShaderInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsShaderInfoEXT.html"><code>VkGeneratedCommandsShaderInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGeneratedCommandsShaderInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkGeneratedCommandsShaderInfoEXT allocate(Arena arena) {
        VkGeneratedCommandsShaderInfoEXT ret = new VkGeneratedCommandsShaderInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.GENERATED_COMMANDS_SHADER_INFO_EXT);
        return ret;
    }

    public static VkGeneratedCommandsShaderInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeneratedCommandsShaderInfoEXT[] ret = new VkGeneratedCommandsShaderInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeneratedCommandsShaderInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.GENERATED_COMMANDS_SHADER_INFO_EXT);
        }
        return ret;
    }

    public static VkGeneratedCommandsShaderInfoEXT clone(Arena arena, VkGeneratedCommandsShaderInfoEXT src) {
        VkGeneratedCommandsShaderInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeneratedCommandsShaderInfoEXT[] clone(Arena arena, VkGeneratedCommandsShaderInfoEXT[] src) {
        VkGeneratedCommandsShaderInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.GENERATED_COMMANDS_SHADER_INFO_EXT);
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

    public @unsigned int shaderCount() {
        return segment.get(LAYOUT$shaderCount, OFFSET$shaderCount);
    }

    public void shaderCount(@unsigned int value) {
        segment.set(LAYOUT$shaderCount, OFFSET$shaderCount, value);
    }

    public @pointer(target=VkShaderEXT.class) MemorySegment pShadersRaw() {
        return segment.get(LAYOUT$pShaders, OFFSET$pShaders);
    }

    public void pShadersRaw(@pointer(target=VkShaderEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pShaders, OFFSET$pShaders, value);
    }

    /// Note: the returned {@link VkShaderEXT.Ptr} does not have correct {@link VkShaderEXT.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkShaderEXT.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkShaderEXT.Ptr pShaders() {
        MemorySegment s = pShadersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkShaderEXT.Ptr(s);
    }

    public void pShaders(@Nullable VkShaderEXT.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShadersRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pShaders")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderCount = PathElement.groupElement("PATH$shaderCount");
    public static final PathElement PATH$pShaders = PathElement.groupElement("PATH$pShaders");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderCount = (OfInt) LAYOUT.select(PATH$shaderCount);
    public static final AddressLayout LAYOUT$pShaders = (AddressLayout) LAYOUT.select(PATH$pShaders);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderCount = LAYOUT$shaderCount.byteSize();
    public static final long SIZE$pShaders = LAYOUT$pShaders.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCount = LAYOUT.byteOffset(PATH$shaderCount);
    public static final long OFFSET$pShaders = LAYOUT.byteOffset(PATH$pShaders);
}
