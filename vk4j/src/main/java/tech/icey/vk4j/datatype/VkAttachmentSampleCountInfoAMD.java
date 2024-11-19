package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkAttachmentSampleCountInfoAMD {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t colorAttachmentCount;
///     const VkSampleCountFlagBits* pColorAttachmentSamples;
///     VkSampleCountFlagBits depthStencilAttachmentSamples;
/// } VkAttachmentSampleCountInfoAMD;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAttachmentSampleCountInfoAMD.html">VkAttachmentSampleCountInfoAMD</a>
public record VkAttachmentSampleCountInfoAMD(MemorySegment segment) implements IPointer {
    public VkAttachmentSampleCountInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(target=VkSampleCountFlags.class) MemorySegment pColorAttachmentSamplesRaw() {
        return segment.get(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples);
    }

    public void pColorAttachmentSamplesRaw(@pointer(target=VkSampleCountFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @Nullable @enumtype(VkSampleCountFlags.class) IntBuffer pColorAttachmentSamples() {
        MemorySegment s = pColorAttachmentSamplesRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pColorAttachmentSamples(@Nullable @enumtype(VkSampleCountFlags.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentSamplesRaw(s);
    }

    public @enumtype(VkSampleCountFlags.class) int depthStencilAttachmentSamples() {
        return segment.get(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples);
    }

    public void depthStencilAttachmentSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples, value);
    }

    public static VkAttachmentSampleCountInfoAMD allocate(Arena arena) {
        return new VkAttachmentSampleCountInfoAMD(arena.allocate(LAYOUT));
    }

    public static VkAttachmentSampleCountInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentSampleCountInfoAMD[] ret = new VkAttachmentSampleCountInfoAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAttachmentSampleCountInfoAMD(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilAttachmentSamples")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentSamples = LAYOUT.byteOffset(PATH$pColorAttachmentSamples);
    public static final long OFFSET$depthStencilAttachmentSamples = LAYOUT.byteOffset(PATH$depthStencilAttachmentSamples);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachmentSamples = LAYOUT$pColorAttachmentSamples.byteSize();
    public static final long SIZE$depthStencilAttachmentSamples = LAYOUT$depthStencilAttachmentSamples.byteSize();
}
