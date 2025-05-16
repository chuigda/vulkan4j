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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreationFeedbackCreateInfoEXT.html"><code>VkRenderPassCreationFeedbackCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassCreationFeedbackCreateInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkRenderPassCreationFeedbackInfoEXT* pRenderPassFeedback;
/// } VkRenderPassCreationFeedbackCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT`
///
/// The {@link VkRenderPassCreationFeedbackCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderPassCreationFeedbackCreateInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreationFeedbackCreateInfoEXT.html"><code>VkRenderPassCreationFeedbackCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassCreationFeedbackCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassCreationFeedbackCreateInfoEXT allocate(Arena arena) {
        VkRenderPassCreationFeedbackCreateInfoEXT ret = new VkRenderPassCreationFeedbackCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT);
        return ret;
    }

    public static VkRenderPassCreationFeedbackCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreationFeedbackCreateInfoEXT[] ret = new VkRenderPassCreationFeedbackCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassCreationFeedbackCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkRenderPassCreationFeedbackCreateInfoEXT clone(Arena arena, VkRenderPassCreationFeedbackCreateInfoEXT src) {
        VkRenderPassCreationFeedbackCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassCreationFeedbackCreateInfoEXT[] clone(Arena arena, VkRenderPassCreationFeedbackCreateInfoEXT[] src) {
        VkRenderPassCreationFeedbackCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT);
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

    public @pointer(comment="VkRenderPassCreationFeedbackInfoEXT*") MemorySegment pRenderPassFeedbackRaw() {
        return segment.get(LAYOUT$pRenderPassFeedback, OFFSET$pRenderPassFeedback);
    }

    public void pRenderPassFeedbackRaw(@pointer(comment="VkRenderPassCreationFeedbackInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pRenderPassFeedback, OFFSET$pRenderPassFeedback, value);
    }

    public @Nullable VkRenderPassCreationFeedbackInfoEXT pRenderPassFeedback() {
        MemorySegment s = pRenderPassFeedbackRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRenderPassCreationFeedbackInfoEXT(s);
    }

    public void pRenderPassFeedback(@Nullable VkRenderPassCreationFeedbackInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRenderPassFeedbackRaw(s);
    }

    @unsafe public @Nullable VkRenderPassCreationFeedbackInfoEXT[] pRenderPassFeedback(int assumedCount) {
        MemorySegment s = pRenderPassFeedbackRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRenderPassCreationFeedbackInfoEXT.BYTES);
        VkRenderPassCreationFeedbackInfoEXT[] ret = new VkRenderPassCreationFeedbackInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRenderPassCreationFeedbackInfoEXT(s.asSlice(i * VkRenderPassCreationFeedbackInfoEXT.BYTES, VkRenderPassCreationFeedbackInfoEXT.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderPassCreationFeedbackInfoEXT.LAYOUT).withName("pRenderPassFeedback")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pRenderPassFeedback = PathElement.groupElement("PATH$pRenderPassFeedback");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pRenderPassFeedback = (AddressLayout) LAYOUT.select(PATH$pRenderPassFeedback);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pRenderPassFeedback = LAYOUT$pRenderPassFeedback.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pRenderPassFeedback = LAYOUT.byteOffset(PATH$pRenderPassFeedback);
}
