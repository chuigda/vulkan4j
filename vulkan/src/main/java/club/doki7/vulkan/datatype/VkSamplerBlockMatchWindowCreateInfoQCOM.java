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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerBlockMatchWindowCreateInfoQCOM.html"><code>VkSamplerBlockMatchWindowCreateInfoQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSamplerBlockMatchWindowCreateInfoQCOM {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkExtent2D windowExtent;
///     VkBlockMatchWindowCompareModeQCOM windowCompareMode;
/// } VkSamplerBlockMatchWindowCreateInfoQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM`
///
/// The {@link VkSamplerBlockMatchWindowCreateInfoQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSamplerBlockMatchWindowCreateInfoQCOM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerBlockMatchWindowCreateInfoQCOM.html"><code>VkSamplerBlockMatchWindowCreateInfoQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSamplerBlockMatchWindowCreateInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkSamplerBlockMatchWindowCreateInfoQCOM allocate(Arena arena) {
        VkSamplerBlockMatchWindowCreateInfoQCOM ret = new VkSamplerBlockMatchWindowCreateInfoQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
        return ret;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerBlockMatchWindowCreateInfoQCOM[] ret = new VkSamplerBlockMatchWindowCreateInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
        }
        return ret;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM clone(Arena arena, VkSamplerBlockMatchWindowCreateInfoQCOM src) {
        VkSamplerBlockMatchWindowCreateInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM[] clone(Arena arena, VkSamplerBlockMatchWindowCreateInfoQCOM[] src) {
        VkSamplerBlockMatchWindowCreateInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
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

    public VkExtent2D windowExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$windowExtent, LAYOUT$windowExtent));
    }

    public void windowExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$windowExtent, SIZE$windowExtent);
    }

    public @enumtype(VkBlockMatchWindowCompareModeQCOM.class) int windowCompareMode() {
        return segment.get(LAYOUT$windowCompareMode, OFFSET$windowCompareMode);
    }

    public void windowCompareMode(@enumtype(VkBlockMatchWindowCompareModeQCOM.class) int value) {
        segment.set(LAYOUT$windowCompareMode, OFFSET$windowCompareMode, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("windowExtent"),
        ValueLayout.JAVA_INT.withName("windowCompareMode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$windowExtent = PathElement.groupElement("PATH$windowExtent");
    public static final PathElement PATH$windowCompareMode = PathElement.groupElement("PATH$windowCompareMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$windowExtent = (StructLayout) LAYOUT.select(PATH$windowExtent);
    public static final OfInt LAYOUT$windowCompareMode = (OfInt) LAYOUT.select(PATH$windowCompareMode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$windowExtent = LAYOUT$windowExtent.byteSize();
    public static final long SIZE$windowCompareMode = LAYOUT$windowCompareMode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$windowExtent = LAYOUT.byteOffset(PATH$windowExtent);
    public static final long OFFSET$windowCompareMode = LAYOUT.byteOffset(PATH$windowCompareMode);
}
