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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleIdentifierEXT.html"><code>VkShaderModuleIdentifierEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkShaderModuleIdentifierEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t identifierSize;
///     uint8_t identifier;
/// } VkShaderModuleIdentifierEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT`
///
/// The {@link VkShaderModuleIdentifierEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkShaderModuleIdentifierEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleIdentifierEXT.html"><code>VkShaderModuleIdentifierEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkShaderModuleIdentifierEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkShaderModuleIdentifierEXT allocate(Arena arena) {
        VkShaderModuleIdentifierEXT ret = new VkShaderModuleIdentifierEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SHADER_MODULE_IDENTIFIER_EXT);
        return ret;
    }

    public static VkShaderModuleIdentifierEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderModuleIdentifierEXT[] ret = new VkShaderModuleIdentifierEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkShaderModuleIdentifierEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SHADER_MODULE_IDENTIFIER_EXT);
        }
        return ret;
    }

    public static VkShaderModuleIdentifierEXT clone(Arena arena, VkShaderModuleIdentifierEXT src) {
        VkShaderModuleIdentifierEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkShaderModuleIdentifierEXT[] clone(Arena arena, VkShaderModuleIdentifierEXT[] src) {
        VkShaderModuleIdentifierEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SHADER_MODULE_IDENTIFIER_EXT);
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

    public @unsigned int identifierSize() {
        return segment.get(LAYOUT$identifierSize, OFFSET$identifierSize);
    }

    public void identifierSize(@unsigned int value) {
        segment.set(LAYOUT$identifierSize, OFFSET$identifierSize, value);
    }

    public @unsigned byte identifier() {
        return segment.get(LAYOUT$identifier, OFFSET$identifier);
    }

    public void identifier(@unsigned byte value) {
        segment.set(LAYOUT$identifier, OFFSET$identifier, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        ValueLayout.JAVA_BYTE.withName("identifier")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$identifierSize = PathElement.groupElement("PATH$identifierSize");
    public static final PathElement PATH$identifier = PathElement.groupElement("PATH$identifier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$identifierSize = (OfInt) LAYOUT.select(PATH$identifierSize);
    public static final OfByte LAYOUT$identifier = (OfByte) LAYOUT.select(PATH$identifier);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$identifierSize = LAYOUT$identifierSize.byteSize();
    public static final long SIZE$identifier = LAYOUT$identifier.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$identifierSize = LAYOUT.byteOffset(PATH$identifierSize);
    public static final long OFFSET$identifier = LAYOUT.byteOffset(PATH$identifier);
}
