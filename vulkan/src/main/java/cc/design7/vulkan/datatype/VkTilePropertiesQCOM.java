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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTilePropertiesQCOM.html"><code>VkTilePropertiesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkTilePropertiesQCOM {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkExtent3D tileSize;
///     VkExtent2D apronSize;
///     VkOffset2D origin;
/// } VkTilePropertiesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM`
///
/// The {@link VkTilePropertiesQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkTilePropertiesQCOM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTilePropertiesQCOM.html"><code>VkTilePropertiesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkTilePropertiesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkTilePropertiesQCOM allocate(Arena arena) {
        VkTilePropertiesQCOM ret = new VkTilePropertiesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.TILE_PROPERTIES_QCOM);
        return ret;
    }

    public static VkTilePropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTilePropertiesQCOM[] ret = new VkTilePropertiesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkTilePropertiesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.TILE_PROPERTIES_QCOM);
        }
        return ret;
    }

    public static VkTilePropertiesQCOM clone(Arena arena, VkTilePropertiesQCOM src) {
        VkTilePropertiesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkTilePropertiesQCOM[] clone(Arena arena, VkTilePropertiesQCOM[] src) {
        VkTilePropertiesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.TILE_PROPERTIES_QCOM);
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

    public VkExtent3D tileSize() {
        return new VkExtent3D(segment.asSlice(OFFSET$tileSize, LAYOUT$tileSize));
    }

    public void tileSize(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$tileSize, SIZE$tileSize);
    }

    public VkExtent2D apronSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$apronSize, LAYOUT$apronSize));
    }

    public void apronSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$apronSize, SIZE$apronSize);
    }

    public VkOffset2D origin() {
        return new VkOffset2D(segment.asSlice(OFFSET$origin, LAYOUT$origin));
    }

    public void origin(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$origin, SIZE$origin);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent3D.LAYOUT.withName("tileSize"),
        VkExtent2D.LAYOUT.withName("apronSize"),
        VkOffset2D.LAYOUT.withName("origin")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$tileSize = PathElement.groupElement("PATH$tileSize");
    public static final PathElement PATH$apronSize = PathElement.groupElement("PATH$apronSize");
    public static final PathElement PATH$origin = PathElement.groupElement("PATH$origin");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$tileSize = (StructLayout) LAYOUT.select(PATH$tileSize);
    public static final StructLayout LAYOUT$apronSize = (StructLayout) LAYOUT.select(PATH$apronSize);
    public static final StructLayout LAYOUT$origin = (StructLayout) LAYOUT.select(PATH$origin);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$tileSize = LAYOUT$tileSize.byteSize();
    public static final long SIZE$apronSize = LAYOUT$apronSize.byteSize();
    public static final long SIZE$origin = LAYOUT$origin.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tileSize = LAYOUT.byteOffset(PATH$tileSize);
    public static final long OFFSET$apronSize = LAYOUT.byteOffset(PATH$apronSize);
    public static final long OFFSET$origin = LAYOUT.byteOffset(PATH$origin);
}
