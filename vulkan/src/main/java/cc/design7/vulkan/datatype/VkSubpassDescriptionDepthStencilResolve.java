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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDescriptionDepthStencilResolve.html"><code>VkSubpassDescriptionDepthStencilResolve</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubpassDescriptionDepthStencilResolve {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkResolveModeFlags depthResolveMode;
///     VkResolveModeFlags stencilResolveMode;
///     VkAttachmentReference2 const* pDepthStencilResolveAttachment; // optional
/// } VkSubpassDescriptionDepthStencilResolve;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE`
///
/// The {@link VkSubpassDescriptionDepthStencilResolve#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSubpassDescriptionDepthStencilResolve#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDescriptionDepthStencilResolve.html"><code>VkSubpassDescriptionDepthStencilResolve</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubpassDescriptionDepthStencilResolve(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubpassDescriptionDepthStencilResolve allocate(Arena arena) {
        VkSubpassDescriptionDepthStencilResolve ret = new VkSubpassDescriptionDepthStencilResolve(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE);
        return ret;
    }

    public static VkSubpassDescriptionDepthStencilResolve[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDescriptionDepthStencilResolve[] ret = new VkSubpassDescriptionDepthStencilResolve[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubpassDescriptionDepthStencilResolve(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE);
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

    public void autoInit() {
        sType(VkStructureType.SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE);
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.BYTES);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.BYTES, VkAttachmentReference2.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthResolveMode"),
        ValueLayout.JAVA_INT.withName("stencilResolveMode"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pDepthStencilResolveAttachment")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$depthResolveMode = PathElement.groupElement("PATH$depthResolveMode");
    public static final PathElement PATH$stencilResolveMode = PathElement.groupElement("PATH$stencilResolveMode");
    public static final PathElement PATH$pDepthStencilResolveAttachment = PathElement.groupElement("PATH$pDepthStencilResolveAttachment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthResolveMode = (OfInt) LAYOUT.select(PATH$depthResolveMode);
    public static final OfInt LAYOUT$stencilResolveMode = (OfInt) LAYOUT.select(PATH$stencilResolveMode);
    public static final AddressLayout LAYOUT$pDepthStencilResolveAttachment = (AddressLayout) LAYOUT.select(PATH$pDepthStencilResolveAttachment);

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
}
