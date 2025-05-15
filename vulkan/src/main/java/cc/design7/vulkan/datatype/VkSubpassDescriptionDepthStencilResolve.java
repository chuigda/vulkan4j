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
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDescriptionDepthStencilResolve.html">VkSubpassDescriptionDepthStencilResolve</a>
@ValueBasedCandidate
public record VkSubpassDescriptionDepthStencilResolve(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$depthResolveMode = ValueLayout.JAVA_INT.withName("depthResolveMode");
    public static final OfInt LAYOUT$stencilResolveMode = ValueLayout.JAVA_INT.withName("stencilResolveMode");
    public static final AddressLayout LAYOUT$pDepthStencilResolveAttachment = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pDepthStencilResolveAttachment");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$depthResolveMode, LAYOUT$stencilResolveMode, LAYOUT$pDepthStencilResolveAttachment);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSubpassDescriptionDepthStencilResolve allocate(Arena arena) {
        return new VkSubpassDescriptionDepthStencilResolve(arena.allocate(LAYOUT));
    }

    public static VkSubpassDescriptionDepthStencilResolve[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDescriptionDepthStencilResolve[] ret = new VkSubpassDescriptionDepthStencilResolve[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubpassDescriptionDepthStencilResolve(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSubpassDescriptionDepthStencilResolve clone(Arena arena, VkSubpassDescriptionDepthStencilResolve src) {
        VkSubpassDescriptionDepthStencilResolve ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubpassDescriptionDepthStencilResolve[] clone(Arena arena, VkSubpassDescriptionDepthStencilResolve[] src) {
        VkSubpassDescriptionDepthStencilResolve[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$depthResolveMode = PathElement.groupElement("PATH$depthResolveMode");
    public static final PathElement PATH$stencilResolveMode = PathElement.groupElement("PATH$stencilResolveMode");
    public static final PathElement PATH$pDepthStencilResolveAttachment = PathElement.groupElement("PATH$pDepthStencilResolveAttachment");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthResolveMode = LAYOUT$depthResolveMode.byteSize();
    public static final long SIZE$stencilResolveMode = LAYOUT$stencilResolveMode.byteSize();
    public static final long SIZE$pDepthStencilResolveAttachment = LAYOUT$pDepthStencilResolveAttachment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthResolveMode = LAYOUT.byteOffset(PATH$depthResolveMode);
    public static final long OFFSET$stencilResolveMode = LAYOUT.byteOffset(PATH$stencilResolveMode);
    public static final long OFFSET$pDepthStencilResolveAttachment = LAYOUT.byteOffset(PATH$pDepthStencilResolveAttachment);

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

    public @Nullable VkAttachmentReference2 pDepthStencilResolveAttachment() {
        MemorySegment s = pDepthStencilResolveAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pDepthStencilResolveAttachment(@Nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthStencilResolveAttachmentRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference2[] pDepthStencilResolveAttachment(int assumedCount) {
        MemorySegment s = pDepthStencilResolveAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return ret;
    }

}
