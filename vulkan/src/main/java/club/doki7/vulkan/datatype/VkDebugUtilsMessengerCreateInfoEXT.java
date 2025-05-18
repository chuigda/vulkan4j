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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsMessengerCreateInfoEXT.html"><code>VkDebugUtilsMessengerCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDebugUtilsMessengerCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDebugUtilsMessengerCreateFlagsEXT flags; // optional // @link substring="VkDebugUtilsMessengerCreateFlagsEXT" target="VkDebugUtilsMessengerCreateFlagsEXT" @link substring="flags" target="#flags"
///     VkDebugUtilsMessageSeverityFlagsEXT messageSeverity; // @link substring="VkDebugUtilsMessageSeverityFlagsEXT" target="VkDebugUtilsMessageSeverityFlagsEXT" @link substring="messageSeverity" target="#messageSeverity"
///     VkDebugUtilsMessageTypeFlagsEXT messageType; // @link substring="VkDebugUtilsMessageTypeFlagsEXT" target="VkDebugUtilsMessageTypeFlagsEXT" @link substring="messageType" target="#messageType"
///     PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback; // @link substring="pfnUserCallback" target="#pfnUserCallback"
///     void* pUserData; // optional // @link substring="pUserData" target="#pUserData"
/// } VkDebugUtilsMessengerCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT`
///
/// The {@link VkDebugUtilsMessengerCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDebugUtilsMessengerCreateInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsMessengerCreateInfoEXT.html"><code>VkDebugUtilsMessengerCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDebugUtilsMessengerCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDebugUtilsMessengerCreateInfoEXT allocate(Arena arena) {
        VkDebugUtilsMessengerCreateInfoEXT ret = new VkDebugUtilsMessengerCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
        return ret;
    }

    public static VkDebugUtilsMessengerCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsMessengerCreateInfoEXT[] ret = new VkDebugUtilsMessengerCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDebugUtilsMessengerCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkDebugUtilsMessengerCreateInfoEXT clone(Arena arena, VkDebugUtilsMessengerCreateInfoEXT src) {
        VkDebugUtilsMessengerCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugUtilsMessengerCreateInfoEXT[] clone(Arena arena, VkDebugUtilsMessengerCreateInfoEXT[] src) {
        VkDebugUtilsMessengerCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
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

    public @enumtype(VkDebugUtilsMessengerCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDebugUtilsMessengerCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity() {
        return segment.get(LAYOUT$messageSeverity, OFFSET$messageSeverity);
    }

    public void messageSeverity(@enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int value) {
        segment.set(LAYOUT$messageSeverity, OFFSET$messageSeverity, value);
    }

    public @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType() {
        return segment.get(LAYOUT$messageType, OFFSET$messageType);
    }

    public void messageType(@enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int value) {
        segment.set(LAYOUT$messageType, OFFSET$messageType, value);
    }

    public @pointer(comment="PFN_vkDebugUtilsMessengerCallbackEXT") MemorySegment pfnUserCallback() {
        return segment.get(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback);
    }

    public void pfnUserCallback(@pointer(comment="PFN_vkDebugUtilsMessengerCallbackEXT") MemorySegment value) {
        segment.set(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback, value);
    }

    public void pfnUserCallback(@Nullable IPointer pointer) {
        pfnUserCallback(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(@Nullable IPointer pointer) {
        pUserData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("messageSeverity"),
        ValueLayout.JAVA_INT.withName("messageType"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$messageSeverity = PathElement.groupElement("PATH$messageSeverity");
    public static final PathElement PATH$messageType = PathElement.groupElement("PATH$messageType");
    public static final PathElement PATH$pfnUserCallback = PathElement.groupElement("PATH$pfnUserCallback");
    public static final PathElement PATH$pUserData = PathElement.groupElement("PATH$pUserData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$messageSeverity = (OfInt) LAYOUT.select(PATH$messageSeverity);
    public static final OfInt LAYOUT$messageType = (OfInt) LAYOUT.select(PATH$messageType);
    public static final AddressLayout LAYOUT$pfnUserCallback = (AddressLayout) LAYOUT.select(PATH$pfnUserCallback);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$messageSeverity = LAYOUT$messageSeverity.byteSize();
    public static final long SIZE$messageType = LAYOUT$messageType.byteSize();
    public static final long SIZE$pfnUserCallback = LAYOUT$pfnUserCallback.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$messageSeverity = LAYOUT.byteOffset(PATH$messageSeverity);
    public static final long OFFSET$messageType = LAYOUT.byteOffset(PATH$messageType);
    public static final long OFFSET$pfnUserCallback = LAYOUT.byteOffset(PATH$pfnUserCallback);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
}
