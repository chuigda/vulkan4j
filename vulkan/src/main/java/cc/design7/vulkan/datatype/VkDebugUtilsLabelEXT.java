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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsLabelEXT.html"><code>VkDebugUtilsLabelEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDebugUtilsLabelEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     char const* pLabelName;
///     float color;
/// } VkDebugUtilsLabelEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT`
///
/// The {@link VkDebugUtilsLabelEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDebugUtilsLabelEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsLabelEXT.html"><code>VkDebugUtilsLabelEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDebugUtilsLabelEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDebugUtilsLabelEXT allocate(Arena arena) {
        VkDebugUtilsLabelEXT ret = new VkDebugUtilsLabelEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEBUG_UTILS_LABEL_EXT);
        return ret;
    }

    public static VkDebugUtilsLabelEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsLabelEXT[] ret = new VkDebugUtilsLabelEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDebugUtilsLabelEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEBUG_UTILS_LABEL_EXT);
        }
        return ret;
    }

    public static VkDebugUtilsLabelEXT clone(Arena arena, VkDebugUtilsLabelEXT src) {
        VkDebugUtilsLabelEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugUtilsLabelEXT[] clone(Arena arena, VkDebugUtilsLabelEXT[] src) {
        VkDebugUtilsLabelEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEBUG_UTILS_LABEL_EXT);
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

    public @pointer(comment="byte*") MemorySegment pLabelNameRaw() {
        return segment.get(LAYOUT$pLabelName, OFFSET$pLabelName);
    }

    public void pLabelNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pLabelName, OFFSET$pLabelName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pLabelName() {
        MemorySegment s = pLabelNameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pLabelName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLabelNameRaw(s);
    }

    public float color() {
        return segment.get(LAYOUT$color, OFFSET$color);
    }

    public void color(float value) {
        segment.set(LAYOUT$color, OFFSET$color, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pLabelName"),
        ValueLayout.JAVA_FLOAT.withName("color")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pLabelName = PathElement.groupElement("PATH$pLabelName");
    public static final PathElement PATH$color = PathElement.groupElement("PATH$color");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pLabelName = (AddressLayout) LAYOUT.select(PATH$pLabelName);
    public static final OfFloat LAYOUT$color = (OfFloat) LAYOUT.select(PATH$color);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pLabelName = LAYOUT$pLabelName.byteSize();
    public static final long SIZE$color = LAYOUT$color.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pLabelName = LAYOUT.byteOffset(PATH$pLabelName);
    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);
}
