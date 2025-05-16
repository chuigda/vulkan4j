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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.html"><code>VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 enableYDegamma;
///     VkBool32 enableCbCrDegamma;
/// } VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM`
///
/// The {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.html"><code>VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocate(Arena arena) {
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ret = new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
        return ret;
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] ret = new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
        }
        return ret;
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM clone(Arena arena, VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM src) {
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] clone(Arena arena, VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] src) {
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
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

    public @unsigned int enableYDegamma() {
        return segment.get(LAYOUT$enableYDegamma, OFFSET$enableYDegamma);
    }

    public void enableYDegamma(@unsigned int value) {
        segment.set(LAYOUT$enableYDegamma, OFFSET$enableYDegamma, value);
    }

    public @unsigned int enableCbCrDegamma() {
        return segment.get(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma);
    }

    public void enableCbCrDegamma(@unsigned int value) {
        segment.set(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enableYDegamma"),
        ValueLayout.JAVA_INT.withName("enableCbCrDegamma")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$enableYDegamma = PathElement.groupElement("PATH$enableYDegamma");
    public static final PathElement PATH$enableCbCrDegamma = PathElement.groupElement("PATH$enableCbCrDegamma");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$enableYDegamma = (OfInt) LAYOUT.select(PATH$enableYDegamma);
    public static final OfInt LAYOUT$enableCbCrDegamma = (OfInt) LAYOUT.select(PATH$enableCbCrDegamma);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$enableYDegamma = LAYOUT$enableYDegamma.byteSize();
    public static final long SIZE$enableCbCrDegamma = LAYOUT$enableCbCrDegamma.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$enableYDegamma = LAYOUT.byteOffset(PATH$enableYDegamma);
    public static final long OFFSET$enableCbCrDegamma = LAYOUT.byteOffset(PATH$enableCbCrDegamma);
}
