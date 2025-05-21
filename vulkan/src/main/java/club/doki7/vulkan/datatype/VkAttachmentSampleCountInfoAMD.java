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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentSampleCountInfoAMD.html"><code>VkAttachmentSampleCountInfoAMD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAttachmentSampleCountInfoAMD {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t colorAttachmentCount; // optional // @link substring="colorAttachmentCount" target="#colorAttachmentCount"
///     VkSampleCountFlags const* pColorAttachmentSamples; // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="pColorAttachmentSamples" target="#pColorAttachmentSamples"
///     VkSampleCountFlags depthStencilAttachmentSamples; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="depthStencilAttachmentSamples" target="#depthStencilAttachmentSamples"
/// } VkAttachmentSampleCountInfoAMD;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD`
///
/// The {@code allocate} ({@link VkAttachmentSampleCountInfoAMD#allocate(Arena)}, {@link VkAttachmentSampleCountInfoAMD#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkAttachmentSampleCountInfoAMD#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentSampleCountInfoAMD.html"><code>VkAttachmentSampleCountInfoAMD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAttachmentSampleCountInfoAMD(@NotNull MemorySegment segment) implements IPointer {
    public static VkAttachmentSampleCountInfoAMD allocate(Arena arena) {
        VkAttachmentSampleCountInfoAMD ret = new VkAttachmentSampleCountInfoAMD(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ATTACHMENT_SAMPLE_COUNT_INFO_AMD);
        return ret;
    }

    public static VkAttachmentSampleCountInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentSampleCountInfoAMD[] ret = new VkAttachmentSampleCountInfoAMD[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAttachmentSampleCountInfoAMD(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ATTACHMENT_SAMPLE_COUNT_INFO_AMD);
        }
        return ret;
    }

    public static VkAttachmentSampleCountInfoAMD clone(Arena arena, VkAttachmentSampleCountInfoAMD src) {
        VkAttachmentSampleCountInfoAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentSampleCountInfoAMD[] clone(Arena arena, VkAttachmentSampleCountInfoAMD[] src) {
        VkAttachmentSampleCountInfoAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ATTACHMENT_SAMPLE_COUNT_INFO_AMD);
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

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkSampleCountFlags.class) IntPtr pColorAttachmentSamples() {
        MemorySegment s = pColorAttachmentSamplesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pColorAttachmentSamples(@Nullable @enumtype(VkSampleCountFlags.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentSamplesRaw(s);
    }

    public @pointer(target=VkSampleCountFlags.class) MemorySegment pColorAttachmentSamplesRaw() {
        return segment.get(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples);
    }

    public void pColorAttachmentSamplesRaw(@pointer(target=VkSampleCountFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int depthStencilAttachmentSamples() {
        return segment.get(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples);
    }

    public void depthStencilAttachmentSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilAttachmentSamples")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentSamples = PathElement.groupElement("pColorAttachmentSamples");
    public static final PathElement PATH$depthStencilAttachmentSamples = PathElement.groupElement("depthStencilAttachmentSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentSamples = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentSamples);
    public static final OfInt LAYOUT$depthStencilAttachmentSamples = (OfInt) LAYOUT.select(PATH$depthStencilAttachmentSamples);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachmentSamples = LAYOUT$pColorAttachmentSamples.byteSize();
    public static final long SIZE$depthStencilAttachmentSamples = LAYOUT$depthStencilAttachmentSamples.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentSamples = LAYOUT.byteOffset(PATH$pColorAttachmentSamples);
    public static final long OFFSET$depthStencilAttachmentSamples = LAYOUT.byteOffset(PATH$depthStencilAttachmentSamples);
}
