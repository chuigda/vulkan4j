package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkRenderingAreaInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkFormat* pColorAttachmentFormats;
///     VkFormat depthAttachmentFormat;
///     VkFormat stencilAttachmentFormat;
/// } VkRenderingAreaInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderingAreaInfoKHR.html">VkRenderingAreaInfoKHR</a>
public record VkRenderingAreaInfoKHR(MemorySegment segment) implements IPointer {
    public VkRenderingAreaInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int viewMask() {
        return segment.get(LAYOUT$viewMask, OFFSET$viewMask);
    }

    public void viewMask(@unsigned int value) {
        segment.set(LAYOUT$viewMask, OFFSET$viewMask, value);
    }

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(target=VkFormat.class) MemorySegment pColorAttachmentFormatsRaw() {
        return segment.get(LAYOUT$pColorAttachmentFormats, OFFSET$pColorAttachmentFormats);
    }

    public void pColorAttachmentFormatsRaw(@pointer(target=VkFormat.class) MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentFormats, OFFSET$pColorAttachmentFormats, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkFormat.class) IntBuffer pColorAttachmentFormats() {
        MemorySegment s = pColorAttachmentFormatsRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }

    public void pColorAttachmentFormats(@nullable @enumtype(VkFormat.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentFormatsRaw(s);
    }

    public @enumtype(VkFormat.class) int depthAttachmentFormat() {
        return segment.get(LAYOUT$depthAttachmentFormat, OFFSET$depthAttachmentFormat);
    }

    public void depthAttachmentFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$depthAttachmentFormat, OFFSET$depthAttachmentFormat, value);
    }

    public @enumtype(VkFormat.class) int stencilAttachmentFormat() {
        return segment.get(LAYOUT$stencilAttachmentFormat, OFFSET$stencilAttachmentFormat);
    }

    public void stencilAttachmentFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$stencilAttachmentFormat, OFFSET$stencilAttachmentFormat, value);
    }

    public static VkRenderingAreaInfoKHR allocate(Arena arena) {
        return new VkRenderingAreaInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkRenderingAreaInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderingAreaInfoKHR[] ret = new VkRenderingAreaInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderingAreaInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentFormats"),
        ValueLayout.JAVA_INT.withName("depthAttachmentFormat"),
        ValueLayout.JAVA_INT.withName("stencilAttachmentFormat")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$viewMask = PathElement.groupElement("viewMask");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentFormats = PathElement.groupElement("pColorAttachmentFormats");
    public static final PathElement PATH$depthAttachmentFormat = PathElement.groupElement("depthAttachmentFormat");
    public static final PathElement PATH$stencilAttachmentFormat = PathElement.groupElement("stencilAttachmentFormat");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewMask = (OfInt) LAYOUT.select(PATH$viewMask);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentFormats = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentFormats);
    public static final OfInt LAYOUT$depthAttachmentFormat = (OfInt) LAYOUT.select(PATH$depthAttachmentFormat);
    public static final OfInt LAYOUT$stencilAttachmentFormat = (OfInt) LAYOUT.select(PATH$stencilAttachmentFormat);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewMask = LAYOUT.byteOffset(PATH$viewMask);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentFormats = LAYOUT.byteOffset(PATH$pColorAttachmentFormats);
    public static final long OFFSET$depthAttachmentFormat = LAYOUT.byteOffset(PATH$depthAttachmentFormat);
    public static final long OFFSET$stencilAttachmentFormat = LAYOUT.byteOffset(PATH$stencilAttachmentFormat);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewMask = LAYOUT$viewMask.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachmentFormats = LAYOUT$pColorAttachmentFormats.byteSize();
    public static final long SIZE$depthAttachmentFormat = LAYOUT$depthAttachmentFormat.byteSize();
    public static final long SIZE$stencilAttachmentFormat = LAYOUT$stencilAttachmentFormat.byteSize();

}
