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
/// typedef struct VkRenderPassCreateInfo2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPassCreateFlags flags;
///     uint32_t attachmentCount;
///     const VkAttachmentDescription2* pAttachments;
///     uint32_t subpassCount;
///     const VkSubpassDescription2* pSubpasses;
///     uint32_t dependencyCount;
///     const VkSubpassDependency2* pDependencies;
///     uint32_t correlatedViewMaskCount;
///     const uint32_t* pCorrelatedViewMasks;
/// } VkRenderPassCreateInfo2;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassCreateInfo2.html">VkRenderPassCreateInfo2</a>
public record VkRenderPassCreateInfo2(MemorySegment segment) implements IPointer {
    public VkRenderPassCreateInfo2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2);
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

    public @enumtype(VkRenderPassCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkRenderPassCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="VkAttachmentDescription2*") MemorySegment pAttachmentsRaw() {
        return segment.get(LAYOUT$pAttachments, OFFSET$pAttachments);
    }

    public void pAttachmentsRaw(@pointer(comment="VkAttachmentDescription2*") MemorySegment value) {
        segment.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);
    }

    public @nullable VkAttachmentDescription2 pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentDescription2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkAttachmentDescription2[] pAttachments(int assumedCount) {
        MemorySegment s = pAttachmentsRaw().reinterpret(assumedCount * VkAttachmentDescription2.SIZE);
        VkAttachmentDescription2[] arr = new VkAttachmentDescription2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAttachmentDescription2(s.asSlice(i * VkAttachmentDescription2.SIZE, VkAttachmentDescription2.SIZE));
        }
        return arr;
    }

    public void pAttachments(@nullable VkAttachmentDescription2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    public @unsigned int subpassCount() {
        return segment.get(LAYOUT$subpassCount, OFFSET$subpassCount);
    }

    public void subpassCount(@unsigned int value) {
        segment.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);
    }

    public @pointer(comment="VkSubpassDescription2*") MemorySegment pSubpassesRaw() {
        return segment.get(LAYOUT$pSubpasses, OFFSET$pSubpasses);
    }

    public void pSubpassesRaw(@pointer(comment="VkSubpassDescription2*") MemorySegment value) {
        segment.set(LAYOUT$pSubpasses, OFFSET$pSubpasses, value);
    }

    public @nullable VkSubpassDescription2 pSubpasses() {
        MemorySegment s = pSubpassesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubpassDescription2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSubpassDescription2[] pSubpasses(int assumedCount) {
        MemorySegment s = pSubpassesRaw().reinterpret(assumedCount * VkSubpassDescription2.SIZE);
        VkSubpassDescription2[] arr = new VkSubpassDescription2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSubpassDescription2(s.asSlice(i * VkSubpassDescription2.SIZE, VkSubpassDescription2.SIZE));
        }
        return arr;
    }

    public void pSubpasses(@nullable VkSubpassDescription2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubpassesRaw(s);
    }

    public @unsigned int dependencyCount() {
        return segment.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);
    }

    public void dependencyCount(@unsigned int value) {
        segment.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);
    }

    public @pointer(comment="VkSubpassDependency2*") MemorySegment pDependenciesRaw() {
        return segment.get(LAYOUT$pDependencies, OFFSET$pDependencies);
    }

    public void pDependenciesRaw(@pointer(comment="VkSubpassDependency2*") MemorySegment value) {
        segment.set(LAYOUT$pDependencies, OFFSET$pDependencies, value);
    }

    public @nullable VkSubpassDependency2 pDependencies() {
        MemorySegment s = pDependenciesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubpassDependency2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSubpassDependency2[] pDependencies(int assumedCount) {
        MemorySegment s = pDependenciesRaw().reinterpret(assumedCount * VkSubpassDependency2.SIZE);
        VkSubpassDependency2[] arr = new VkSubpassDependency2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSubpassDependency2(s.asSlice(i * VkSubpassDependency2.SIZE, VkSubpassDependency2.SIZE));
        }
        return arr;
    }

    public void pDependencies(@nullable VkSubpassDependency2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDependenciesRaw(s);
    }

    public @unsigned int correlatedViewMaskCount() {
        return segment.get(LAYOUT$correlatedViewMaskCount, OFFSET$correlatedViewMaskCount);
    }

    public void correlatedViewMaskCount(@unsigned int value) {
        segment.set(LAYOUT$correlatedViewMaskCount, OFFSET$correlatedViewMaskCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pCorrelatedViewMasksRaw() {
        return segment.get(LAYOUT$pCorrelatedViewMasks, OFFSET$pCorrelatedViewMasks);
    }

    public void pCorrelatedViewMasksRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pCorrelatedViewMasks, OFFSET$pCorrelatedViewMasks, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pCorrelatedViewMasks() {
        MemorySegment s = pCorrelatedViewMasksRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pCorrelatedViewMasks(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCorrelatedViewMasksRaw(s);
    }

    public static VkRenderPassCreateInfo2 allocate(Arena arena) {
        return new VkRenderPassCreateInfo2(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassCreateInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreateInfo2[] ret = new VkRenderPassCreateInfo2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassCreateInfo2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentDescription2.LAYOUT).withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSubpassDescription2.LAYOUT).withName("pSubpasses"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSubpassDependency2.LAYOUT).withName("pDependencies"),
        ValueLayout.JAVA_INT.withName("correlatedViewMaskCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCorrelatedViewMasks")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("attachmentCount");
    public static final PathElement PATH$pAttachments = PathElement.groupElement("pAttachments");
    public static final PathElement PATH$subpassCount = PathElement.groupElement("subpassCount");
    public static final PathElement PATH$pSubpasses = PathElement.groupElement("pSubpasses");
    public static final PathElement PATH$dependencyCount = PathElement.groupElement("dependencyCount");
    public static final PathElement PATH$pDependencies = PathElement.groupElement("pDependencies");
    public static final PathElement PATH$correlatedViewMaskCount = PathElement.groupElement("correlatedViewMaskCount");
    public static final PathElement PATH$pCorrelatedViewMasks = PathElement.groupElement("pCorrelatedViewMasks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pAttachments = (AddressLayout) LAYOUT.select(PATH$pAttachments);
    public static final OfInt LAYOUT$subpassCount = (OfInt) LAYOUT.select(PATH$subpassCount);
    public static final AddressLayout LAYOUT$pSubpasses = (AddressLayout) LAYOUT.select(PATH$pSubpasses);
    public static final OfInt LAYOUT$dependencyCount = (OfInt) LAYOUT.select(PATH$dependencyCount);
    public static final AddressLayout LAYOUT$pDependencies = (AddressLayout) LAYOUT.select(PATH$pDependencies);
    public static final OfInt LAYOUT$correlatedViewMaskCount = (OfInt) LAYOUT.select(PATH$correlatedViewMaskCount);
    public static final AddressLayout LAYOUT$pCorrelatedViewMasks = (AddressLayout) LAYOUT.select(PATH$pCorrelatedViewMasks);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$subpassCount = LAYOUT.byteOffset(PATH$subpassCount);
    public static final long OFFSET$pSubpasses = LAYOUT.byteOffset(PATH$pSubpasses);
    public static final long OFFSET$dependencyCount = LAYOUT.byteOffset(PATH$dependencyCount);
    public static final long OFFSET$pDependencies = LAYOUT.byteOffset(PATH$pDependencies);
    public static final long OFFSET$correlatedViewMaskCount = LAYOUT.byteOffset(PATH$correlatedViewMaskCount);
    public static final long OFFSET$pCorrelatedViewMasks = LAYOUT.byteOffset(PATH$pCorrelatedViewMasks);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pAttachments = LAYOUT$pAttachments.byteSize();
    public static final long SIZE$subpassCount = LAYOUT$subpassCount.byteSize();
    public static final long SIZE$pSubpasses = LAYOUT$pSubpasses.byteSize();
    public static final long SIZE$dependencyCount = LAYOUT$dependencyCount.byteSize();
    public static final long SIZE$pDependencies = LAYOUT$pDependencies.byteSize();
    public static final long SIZE$correlatedViewMaskCount = LAYOUT$correlatedViewMaskCount.byteSize();
    public static final long SIZE$pCorrelatedViewMasks = LAYOUT$pCorrelatedViewMasks.byteSize();
}
