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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassInputAttachmentAspectCreateInfo.html"><code>VkRenderPassInputAttachmentAspectCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassInputAttachmentAspectCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t aspectReferenceCount;
///     VkInputAttachmentAspectReference const* pAspectReferences;
/// } VkRenderPassInputAttachmentAspectCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO`
///
/// The {@link VkRenderPassInputAttachmentAspectCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderPassInputAttachmentAspectCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassInputAttachmentAspectCreateInfo.html"><code>VkRenderPassInputAttachmentAspectCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassInputAttachmentAspectCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassInputAttachmentAspectCreateInfo allocate(Arena arena) {
        VkRenderPassInputAttachmentAspectCreateInfo ret = new VkRenderPassInputAttachmentAspectCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO);
        return ret;
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassInputAttachmentAspectCreateInfo[] ret = new VkRenderPassInputAttachmentAspectCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassInputAttachmentAspectCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO);
        }
        return ret;
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo clone(Arena arena, VkRenderPassInputAttachmentAspectCreateInfo src) {
        VkRenderPassInputAttachmentAspectCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo[] clone(Arena arena, VkRenderPassInputAttachmentAspectCreateInfo[] src) {
        VkRenderPassInputAttachmentAspectCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO);
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

    public @Nullable VkInputAttachmentAspectReference pAspectReferences() {
        MemorySegment s = pAspectReferencesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkInputAttachmentAspectReference(s);
    }

    public void pAspectReferences(@Nullable VkInputAttachmentAspectReference value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAspectReferencesRaw(s);
    }

    @unsafe public @Nullable VkInputAttachmentAspectReference[] pAspectReferences(int assumedCount) {
        MemorySegment s = pAspectReferencesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkInputAttachmentAspectReference.BYTES);
        VkInputAttachmentAspectReference[] ret = new VkInputAttachmentAspectReference[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkInputAttachmentAspectReference(s.asSlice(i * VkInputAttachmentAspectReference.BYTES, VkInputAttachmentAspectReference.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("aspectReferenceCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkInputAttachmentAspectReference.LAYOUT).withName("pAspectReferences")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$aspectReferenceCount = PathElement.groupElement("PATH$aspectReferenceCount");
    public static final PathElement PATH$pAspectReferences = PathElement.groupElement("PATH$pAspectReferences");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$aspectReferenceCount = (OfInt) LAYOUT.select(PATH$aspectReferenceCount);
    public static final AddressLayout LAYOUT$pAspectReferences = (AddressLayout) LAYOUT.select(PATH$pAspectReferences);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$aspectReferenceCount = LAYOUT$aspectReferenceCount.byteSize();
    public static final long SIZE$pAspectReferences = LAYOUT$pAspectReferences.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$aspectReferenceCount = LAYOUT.byteOffset(PATH$aspectReferenceCount);
    public static final long OFFSET$pAspectReferences = LAYOUT.byteOffset(PATH$pAspectReferences);
}
