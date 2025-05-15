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

/// Represents a pointer to a {@code VkPhysicalDeviceHostImageCopyProperties} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceHostImageCopyProperties.html">VkPhysicalDeviceHostImageCopyProperties</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceHostImageCopyProperties(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceHostImageCopyProperties {
        sType(VkStructureType.PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES);
    }

    public static VkPhysicalDeviceHostImageCopyProperties allocate(Arena arena) {
        return new VkPhysicalDeviceHostImageCopyProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceHostImageCopyProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceHostImageCopyProperties[] ret = new VkPhysicalDeviceHostImageCopyProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceHostImageCopyProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceHostImageCopyProperties clone(Arena arena, VkPhysicalDeviceHostImageCopyProperties src) {
        VkPhysicalDeviceHostImageCopyProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceHostImageCopyProperties[] clone(Arena arena, VkPhysicalDeviceHostImageCopyProperties[] src) {
        VkPhysicalDeviceHostImageCopyProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("copySrcLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCopySrcLayouts"),
        ValueLayout.JAVA_INT.withName("copyDstLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCopyDstLayouts"),
        ValueLayout.JAVA_BYTE.withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$copySrcLayoutCount = PathElement.groupElement("PATH$copySrcLayoutCount");
    public static final PathElement PATH$pCopySrcLayouts = PathElement.groupElement("PATH$pCopySrcLayouts");
    public static final PathElement PATH$copyDstLayoutCount = PathElement.groupElement("PATH$copyDstLayoutCount");
    public static final PathElement PATH$pCopyDstLayouts = PathElement.groupElement("PATH$pCopyDstLayouts");
    public static final PathElement PATH$optimalTilingLayoutUUID = PathElement.groupElement("PATH$optimalTilingLayoutUUID");
    public static final PathElement PATH$identicalMemoryTypeRequirements = PathElement.groupElement("PATH$identicalMemoryTypeRequirements");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$copySrcLayoutCount = (OfInt) LAYOUT.select(PATH$copySrcLayoutCount);
    public static final AddressLayout LAYOUT$pCopySrcLayouts = (AddressLayout) LAYOUT.select(PATH$pCopySrcLayouts);
    public static final OfInt LAYOUT$copyDstLayoutCount = (OfInt) LAYOUT.select(PATH$copyDstLayoutCount);
    public static final AddressLayout LAYOUT$pCopyDstLayouts = (AddressLayout) LAYOUT.select(PATH$pCopyDstLayouts);
    public static final OfByte LAYOUT$optimalTilingLayoutUUID = (OfByte) LAYOUT.select(PATH$optimalTilingLayoutUUID);
    public static final OfInt LAYOUT$identicalMemoryTypeRequirements = (OfInt) LAYOUT.select(PATH$identicalMemoryTypeRequirements);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$copySrcLayoutCount = LAYOUT$copySrcLayoutCount.byteSize();
    public static final long SIZE$pCopySrcLayouts = LAYOUT$pCopySrcLayouts.byteSize();
    public static final long SIZE$copyDstLayoutCount = LAYOUT$copyDstLayoutCount.byteSize();
    public static final long SIZE$pCopyDstLayouts = LAYOUT$pCopyDstLayouts.byteSize();
    public static final long SIZE$optimalTilingLayoutUUID = LAYOUT$optimalTilingLayoutUUID.byteSize();
    public static final long SIZE$identicalMemoryTypeRequirements = LAYOUT$identicalMemoryTypeRequirements.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$copySrcLayoutCount = LAYOUT.byteOffset(PATH$copySrcLayoutCount);
    public static final long OFFSET$pCopySrcLayouts = LAYOUT.byteOffset(PATH$pCopySrcLayouts);
    public static final long OFFSET$copyDstLayoutCount = LAYOUT.byteOffset(PATH$copyDstLayoutCount);
    public static final long OFFSET$pCopyDstLayouts = LAYOUT.byteOffset(PATH$pCopyDstLayouts);
    public static final long OFFSET$optimalTilingLayoutUUID = LAYOUT.byteOffset(PATH$optimalTilingLayoutUUID);
    public static final long OFFSET$identicalMemoryTypeRequirements = LAYOUT.byteOffset(PATH$identicalMemoryTypeRequirements);

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

    public @unsigned int copySrcLayoutCount() {
        return segment.get(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount);
    }

    public void copySrcLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount, value);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopySrcLayoutsRaw() {
        return segment.get(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts);
    }

    public void pCopySrcLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageLayout.class) IntPtr pCopySrcLayouts() {
        MemorySegment s = pCopySrcLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCopySrcLayouts(@Nullable @enumtype(VkImageLayout.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopySrcLayoutsRaw(s);
    }

    public @unsigned int copyDstLayoutCount() {
        return segment.get(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount);
    }

    public void copyDstLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount, value);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopyDstLayoutsRaw() {
        return segment.get(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts);
    }

    public void pCopyDstLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageLayout.class) IntPtr pCopyDstLayouts() {
        MemorySegment s = pCopyDstLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCopyDstLayouts(@Nullable @enumtype(VkImageLayout.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopyDstLayoutsRaw(s);
    }

    public @unsigned byte optimalTilingLayoutUUID() {
        return segment.get(LAYOUT$optimalTilingLayoutUUID, OFFSET$optimalTilingLayoutUUID);
    }

    public void optimalTilingLayoutUUID(@unsigned byte value) {
        segment.set(LAYOUT$optimalTilingLayoutUUID, OFFSET$optimalTilingLayoutUUID, value);
    }

    public @unsigned int identicalMemoryTypeRequirements() {
        return segment.get(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements);
    }

    public void identicalMemoryTypeRequirements(@unsigned int value) {
        segment.set(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements, value);
    }

}
