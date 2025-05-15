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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugReportCallbackCreateInfoEXT.html"><code>VkDebugReportCallbackCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDebugReportCallbackCreateInfoEXT {
///     VkStructureType sType;
///     void const* pNext;
///     VkDebugReportFlagsEXT flags;
///     PFN_vkDebugReportCallbackEXT pfnCallback;
///     void* pUserData;
/// } VkDebugReportCallbackCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT`
///
/// The {@link VkDebugReportCallbackCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDebugReportCallbackCreateInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugReportCallbackCreateInfoEXT.html"><code>VkDebugReportCallbackCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDebugReportCallbackCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDebugReportCallbackCreateInfoEXT allocate(Arena arena) {
        VkDebugReportCallbackCreateInfoEXT ret = new VkDebugReportCallbackCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT);
        return ret;
    }

    public static VkDebugReportCallbackCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugReportCallbackCreateInfoEXT[] ret = new VkDebugReportCallbackCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDebugReportCallbackCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkDebugReportCallbackCreateInfoEXT clone(Arena arena, VkDebugReportCallbackCreateInfoEXT src) {
        VkDebugReportCallbackCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugReportCallbackCreateInfoEXT[] clone(Arena arena, VkDebugReportCallbackCreateInfoEXT[] src) {
        VkDebugReportCallbackCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT);
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

    public @enumtype(VkDebugReportFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDebugReportFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="PFN_vkDebugReportCallbackEXT") MemorySegment pfnCallback() {
        return segment.get(LAYOUT$pfnCallback, OFFSET$pfnCallback);
    }

    public void pfnCallback(@pointer(comment="PFN_vkDebugReportCallbackEXT") MemorySegment value) {
        segment.set(LAYOUT$pfnCallback, OFFSET$pfnCallback, value);
    }

    public void pfnCallback(IPointer pointer) {
        pfnCallback(pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(IPointer pointer) {
        pUserData(pointer.segment());
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pfnCallback = PathElement.groupElement("PATH$pfnCallback");
    public static final PathElement PATH$pUserData = PathElement.groupElement("PATH$pUserData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pfnCallback = (AddressLayout) LAYOUT.select(PATH$pfnCallback);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pfnCallback = LAYOUT$pfnCallback.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pfnCallback = LAYOUT.byteOffset(PATH$pfnCallback);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
}
