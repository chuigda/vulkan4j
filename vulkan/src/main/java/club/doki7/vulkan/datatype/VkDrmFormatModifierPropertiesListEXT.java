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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrmFormatModifierPropertiesListEXT.html"><code>VkDrmFormatModifierPropertiesListEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDrmFormatModifierPropertiesListEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t drmFormatModifierCount; // optional // @link substring="drmFormatModifierCount" target="#drmFormatModifierCount"
///     VkDrmFormatModifierPropertiesEXT* pDrmFormatModifierProperties; // optional // @link substring="VkDrmFormatModifierPropertiesEXT" target="VkDrmFormatModifierPropertiesEXT" @link substring="pDrmFormatModifierProperties" target="#pDrmFormatModifierProperties"
/// } VkDrmFormatModifierPropertiesListEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT`
///
/// The {@code allocate} ({@link VkDrmFormatModifierPropertiesListEXT#allocate(Arena)}, {@link VkDrmFormatModifierPropertiesListEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDrmFormatModifierPropertiesListEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrmFormatModifierPropertiesListEXT.html"><code>VkDrmFormatModifierPropertiesListEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrmFormatModifierPropertiesListEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDrmFormatModifierPropertiesListEXT allocate(Arena arena) {
        VkDrmFormatModifierPropertiesListEXT ret = new VkDrmFormatModifierPropertiesListEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT);
        return ret;
    }

    public static VkDrmFormatModifierPropertiesListEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrmFormatModifierPropertiesListEXT[] ret = new VkDrmFormatModifierPropertiesListEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrmFormatModifierPropertiesListEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT);
        }
        return ret;
    }

    public static VkDrmFormatModifierPropertiesListEXT clone(Arena arena, VkDrmFormatModifierPropertiesListEXT src) {
        VkDrmFormatModifierPropertiesListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrmFormatModifierPropertiesListEXT[] clone(Arena arena, VkDrmFormatModifierPropertiesListEXT[] src) {
        VkDrmFormatModifierPropertiesListEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT);
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

    public @unsigned int drmFormatModifierCount() {
        return segment.get(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount);
    }

    public void drmFormatModifierCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount, value);
    }

    public @Nullable VkDrmFormatModifierPropertiesEXT pDrmFormatModifierProperties() {
        MemorySegment s = pDrmFormatModifierPropertiesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDrmFormatModifierPropertiesEXT(s);
    }

    public void pDrmFormatModifierProperties(@Nullable VkDrmFormatModifierPropertiesEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDrmFormatModifierPropertiesRaw(s);
    }

    @unsafe public @Nullable VkDrmFormatModifierPropertiesEXT[] pDrmFormatModifierProperties(int assumedCount) {
        MemorySegment s = pDrmFormatModifierPropertiesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDrmFormatModifierPropertiesEXT.BYTES);
        VkDrmFormatModifierPropertiesEXT[] ret = new VkDrmFormatModifierPropertiesEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDrmFormatModifierPropertiesEXT(s.asSlice(i * VkDrmFormatModifierPropertiesEXT.BYTES, VkDrmFormatModifierPropertiesEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDrmFormatModifierPropertiesEXT.class) MemorySegment pDrmFormatModifierPropertiesRaw() {
        return segment.get(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties);
    }

    public void pDrmFormatModifierPropertiesRaw(@pointer(target=VkDrmFormatModifierPropertiesEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDrmFormatModifierPropertiesEXT.LAYOUT).withName("pDrmFormatModifierProperties")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$drmFormatModifierCount = PathElement.groupElement("PATH$drmFormatModifierCount");
    public static final PathElement PATH$pDrmFormatModifierProperties = PathElement.groupElement("PATH$pDrmFormatModifierProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$drmFormatModifierCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierCount);
    public static final AddressLayout LAYOUT$pDrmFormatModifierProperties = (AddressLayout) LAYOUT.select(PATH$pDrmFormatModifierProperties);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$drmFormatModifierCount = LAYOUT$drmFormatModifierCount.byteSize();
    public static final long SIZE$pDrmFormatModifierProperties = LAYOUT$pDrmFormatModifierProperties.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifierCount = LAYOUT.byteOffset(PATH$drmFormatModifierCount);
    public static final long OFFSET$pDrmFormatModifierProperties = LAYOUT.byteOffset(PATH$pDrmFormatModifierProperties);
}
