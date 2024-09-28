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

public record VkSubpassDescriptionDepthStencilResolve(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthResolveMode"),
        ValueLayout.JAVA_INT.withName("stencilResolveMode"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pDepthStencilResolveAttachment")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$depthResolveMode = PathElement.groupElement("depthResolveMode");
    public static final PathElement PATH$stencilResolveMode = PathElement.groupElement("stencilResolveMode");
    public static final PathElement PATH$pDepthStencilResolveAttachment = PathElement.groupElement("pDepthStencilResolveAttachment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthResolveMode = (OfInt) LAYOUT.select(PATH$depthResolveMode);
    public static final OfInt LAYOUT$stencilResolveMode = (OfInt) LAYOUT.select(PATH$stencilResolveMode);
    public static final AddressLayout LAYOUT$pDepthStencilResolveAttachment = (AddressLayout) LAYOUT.select(PATH$pDepthStencilResolveAttachment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthResolveMode = LAYOUT.byteOffset(PATH$depthResolveMode);
    public static final long OFFSET$stencilResolveMode = LAYOUT.byteOffset(PATH$stencilResolveMode);
    public static final long OFFSET$pDepthStencilResolveAttachment = LAYOUT.byteOffset(PATH$pDepthStencilResolveAttachment);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthResolveMode = LAYOUT$depthResolveMode.byteSize();
    public static final long SIZE$stencilResolveMode = LAYOUT$stencilResolveMode.byteSize();
    public static final long SIZE$pDepthStencilResolveAttachment = LAYOUT$pDepthStencilResolveAttachment.byteSize();

    public VkSubpassDescriptionDepthStencilResolve(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE);
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

    public @enumtype(VkResolveModeFlags.class) int depthResolveMode() {
        return segment.get(LAYOUT$depthResolveMode, OFFSET$depthResolveMode);
    }

    public void depthResolveMode(@enumtype(VkResolveModeFlags.class) int value) {
        segment.set(LAYOUT$depthResolveMode, OFFSET$depthResolveMode, value);
    }

    public @enumtype(VkResolveModeFlags.class) int stencilResolveMode() {
        return segment.get(LAYOUT$stencilResolveMode, OFFSET$stencilResolveMode);
    }

    public void stencilResolveMode(@enumtype(VkResolveModeFlags.class) int value) {
        segment.set(LAYOUT$stencilResolveMode, OFFSET$stencilResolveMode, value);
    }

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pDepthStencilResolveAttachmentRaw() {
        return segment.get(LAYOUT$pDepthStencilResolveAttachment, OFFSET$pDepthStencilResolveAttachment);
    }

    public void pDepthStencilResolveAttachmentRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pDepthStencilResolveAttachment, OFFSET$pDepthStencilResolveAttachment, value);
    }
    
    public @nullable VkAttachmentReference2 pDepthStencilResolveAttachment() {
        MemorySegment s = pDepthStencilResolveAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    @unsafe
    public @nullable VkAttachmentReference2[] pDepthStencilResolveAttachment(int assumedCount) {
        MemorySegment s = pDepthStencilResolveAttachmentRaw().reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] arr = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return arr;
    }

    public void pDepthStencilResolveAttachment(@nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthStencilResolveAttachmentRaw(s);
    }

    public static VkSubpassDescriptionDepthStencilResolve allocate(Arena arena) {
        return new VkSubpassDescriptionDepthStencilResolve(arena.allocate(LAYOUT));
    }
    
    public static VkSubpassDescriptionDepthStencilResolve[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDescriptionDepthStencilResolve[] ret = new VkSubpassDescriptionDepthStencilResolve[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSubpassDescriptionDepthStencilResolve(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
