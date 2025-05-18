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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineMultisampleStateCreateInfo.html"><code>VkPipelineMultisampleStateCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineMultisampleStateCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineMultisampleStateCreateFlags flags; // optional // @link substring="VkPipelineMultisampleStateCreateFlags" target="VkPipelineMultisampleStateCreateFlags" @link substring="flags" target="#flags"
///     VkSampleCountFlags rasterizationSamples; // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="rasterizationSamples" target="#rasterizationSamples"
///     VkBool32 sampleShadingEnable; // @link substring="sampleShadingEnable" target="#sampleShadingEnable"
///     float minSampleShading; // @link substring="minSampleShading" target="#minSampleShading"
///     VkSampleMask const* pSampleMask; // optional // @link substring="pSampleMask" target="#pSampleMask"
///     VkBool32 alphaToCoverageEnable; // @link substring="alphaToCoverageEnable" target="#alphaToCoverageEnable"
///     VkBool32 alphaToOneEnable; // @link substring="alphaToOneEnable" target="#alphaToOneEnable"
/// } VkPipelineMultisampleStateCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkPipelineMultisampleStateCreateInfo#allocate(Arena)}, {@link VkPipelineMultisampleStateCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineMultisampleStateCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineMultisampleStateCreateInfo.html"><code>VkPipelineMultisampleStateCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineMultisampleStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineMultisampleStateCreateInfo allocate(Arena arena) {
        VkPipelineMultisampleStateCreateInfo ret = new VkPipelineMultisampleStateCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
        return ret;
    }

    public static VkPipelineMultisampleStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineMultisampleStateCreateInfo[] ret = new VkPipelineMultisampleStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineMultisampleStateCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineMultisampleStateCreateInfo clone(Arena arena, VkPipelineMultisampleStateCreateInfo src) {
        VkPipelineMultisampleStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineMultisampleStateCreateInfo[] clone(Arena arena, VkPipelineMultisampleStateCreateInfo[] src) {
        VkPipelineMultisampleStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineMultisampleStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineMultisampleStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkSampleCountFlags.class) int rasterizationSamples() {
        return segment.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);
    }

    public void rasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);
    }

    public @unsigned int sampleShadingEnable() {
        return segment.get(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable);
    }

    public void sampleShadingEnable(@unsigned int value) {
        segment.set(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable, value);
    }

    public float minSampleShading() {
        return segment.get(LAYOUT$minSampleShading, OFFSET$minSampleShading);
    }

    public void minSampleShading(float value) {
        segment.set(LAYOUT$minSampleShading, OFFSET$minSampleShading, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pSampleMask() {
        MemorySegment s = pSampleMaskRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pSampleMask(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleMaskRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pSampleMaskRaw() {
        return segment.get(LAYOUT$pSampleMask, OFFSET$pSampleMask);
    }

    public void pSampleMaskRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pSampleMask, OFFSET$pSampleMask, value);
    }

    public @unsigned int alphaToCoverageEnable() {
        return segment.get(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable);
    }

    public void alphaToCoverageEnable(@unsigned int value) {
        segment.set(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable, value);
    }

    public @unsigned int alphaToOneEnable() {
        return segment.get(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable);
    }

    public void alphaToOneEnable(@unsigned int value) {
        segment.set(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("sampleShadingEnable"),
        ValueLayout.JAVA_FLOAT.withName("minSampleShading"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSampleMask"),
        ValueLayout.JAVA_INT.withName("alphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("alphaToOneEnable")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("PATH$rasterizationSamples");
    public static final PathElement PATH$sampleShadingEnable = PathElement.groupElement("PATH$sampleShadingEnable");
    public static final PathElement PATH$minSampleShading = PathElement.groupElement("PATH$minSampleShading");
    public static final PathElement PATH$pSampleMask = PathElement.groupElement("PATH$pSampleMask");
    public static final PathElement PATH$alphaToCoverageEnable = PathElement.groupElement("PATH$alphaToCoverageEnable");
    public static final PathElement PATH$alphaToOneEnable = PathElement.groupElement("PATH$alphaToOneEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$rasterizationSamples = (OfInt) LAYOUT.select(PATH$rasterizationSamples);
    public static final OfInt LAYOUT$sampleShadingEnable = (OfInt) LAYOUT.select(PATH$sampleShadingEnable);
    public static final OfFloat LAYOUT$minSampleShading = (OfFloat) LAYOUT.select(PATH$minSampleShading);
    public static final AddressLayout LAYOUT$pSampleMask = (AddressLayout) LAYOUT.select(PATH$pSampleMask);
    public static final OfInt LAYOUT$alphaToCoverageEnable = (OfInt) LAYOUT.select(PATH$alphaToCoverageEnable);
    public static final OfInt LAYOUT$alphaToOneEnable = (OfInt) LAYOUT.select(PATH$alphaToOneEnable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$rasterizationSamples = LAYOUT$rasterizationSamples.byteSize();
    public static final long SIZE$sampleShadingEnable = LAYOUT$sampleShadingEnable.byteSize();
    public static final long SIZE$minSampleShading = LAYOUT$minSampleShading.byteSize();
    public static final long SIZE$pSampleMask = LAYOUT$pSampleMask.byteSize();
    public static final long SIZE$alphaToCoverageEnable = LAYOUT$alphaToCoverageEnable.byteSize();
    public static final long SIZE$alphaToOneEnable = LAYOUT$alphaToOneEnable.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$sampleShadingEnable = LAYOUT.byteOffset(PATH$sampleShadingEnable);
    public static final long OFFSET$minSampleShading = LAYOUT.byteOffset(PATH$minSampleShading);
    public static final long OFFSET$pSampleMask = LAYOUT.byteOffset(PATH$pSampleMask);
    public static final long OFFSET$alphaToCoverageEnable = LAYOUT.byteOffset(PATH$alphaToCoverageEnable);
    public static final long OFFSET$alphaToOneEnable = LAYOUT.byteOffset(PATH$alphaToOneEnable);
}
