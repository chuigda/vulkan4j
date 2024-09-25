package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRenderPassInputAttachmentAspectCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("aspectReferenceCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkInputAttachmentAspectReference.LAYOUT).withName("pAspectReferences")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$aspectReferenceCount = PathElement.groupElement("aspectReferenceCount");
    public static final PathElement PATH$pAspectReferences = PathElement.groupElement("pAspectReferences");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$aspectReferenceCount = (OfInt) LAYOUT.select(PATH$aspectReferenceCount);
    public static final AddressLayout LAYOUT$pAspectReferences = (AddressLayout) LAYOUT.select(PATH$pAspectReferences);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$aspectReferenceCount = LAYOUT.byteOffset(PATH$aspectReferenceCount);
    public static final long OFFSET$pAspectReferences = LAYOUT.byteOffset(PATH$pAspectReferences);

    public VkRenderPassInputAttachmentAspectCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO);
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

    public @unsigned int aspectReferenceCount() {
        return segment.get(LAYOUT$aspectReferenceCount, OFFSET$aspectReferenceCount);
    }

    public void aspectReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$aspectReferenceCount, OFFSET$aspectReferenceCount, value);
    }

    public @pointer(comment="VkInputAttachmentAspectReference*") MemorySegment pAspectReferencesRaw() {
        return segment.get(LAYOUT$pAspectReferences, OFFSET$pAspectReferences);
    }

    public void pAspectReferencesRaw(@pointer(comment="VkInputAttachmentAspectReference*") MemorySegment value) {
        segment.set(LAYOUT$pAspectReferences, OFFSET$pAspectReferences, value);
    }
    
    public @nullable VkInputAttachmentAspectReference pAspectReferences() {
        MemorySegment s = pAspectReferencesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkInputAttachmentAspectReference(s);
    }

    public void pAspectReferences(@nullable VkInputAttachmentAspectReference value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAspectReferencesRaw(s);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo allocate(Arena arena) {
        return new VkRenderPassInputAttachmentAspectCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassInputAttachmentAspectCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassInputAttachmentAspectCreateInfo[] ret = new VkRenderPassInputAttachmentAspectCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassInputAttachmentAspectCreateInfo(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
