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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceHostImageCopyProperties.html"><code>VkPhysicalDeviceHostImageCopyProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceHostImageCopyProperties {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t copySrcLayoutCount; // optional // @link substring="copySrcLayoutCount" target="#copySrcLayoutCount"
///     VkImageLayout* pCopySrcLayouts; // optional // @link substring="VkImageLayout" target="VkImageLayout" @link substring="pCopySrcLayouts" target="#pCopySrcLayouts"
///     uint32_t copyDstLayoutCount; // optional // @link substring="copyDstLayoutCount" target="#copyDstLayoutCount"
///     VkImageLayout* pCopyDstLayouts; // optional // @link substring="VkImageLayout" target="VkImageLayout" @link substring="pCopyDstLayouts" target="#pCopyDstLayouts"
///     uint8_t optimalTilingLayoutUUID; // optional // @link substring="optimalTilingLayoutUUID" target="#optimalTilingLayoutUUID"
///     VkBool32 identicalMemoryTypeRequirements; // @link substring="identicalMemoryTypeRequirements" target="#identicalMemoryTypeRequirements"
/// } VkPhysicalDeviceHostImageCopyProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES`
///
/// The {@code allocate} ({@link VkPhysicalDeviceHostImageCopyProperties#allocate(Arena)}, {@link VkPhysicalDeviceHostImageCopyProperties#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceHostImageCopyProperties#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceHostImageCopyProperties.html"><code>VkPhysicalDeviceHostImageCopyProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceHostImageCopyProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceHostImageCopyProperties allocate(Arena arena) {
        VkPhysicalDeviceHostImageCopyProperties ret = new VkPhysicalDeviceHostImageCopyProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceHostImageCopyProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceHostImageCopyProperties[] ret = new VkPhysicalDeviceHostImageCopyProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceHostImageCopyProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES);
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

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES);
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

    public @unsigned int copySrcLayoutCount() {
        return segment.get(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount);
    }

    public void copySrcLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageLayout.class) IntPtr pCopySrcLayouts() {
        MemorySegment s = pCopySrcLayoutsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCopySrcLayouts(@Nullable @enumtype(VkImageLayout.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopySrcLayoutsRaw(s);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopySrcLayoutsRaw() {
        return segment.get(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts);
    }

    public void pCopySrcLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts, value);
    }

    public @unsigned int copyDstLayoutCount() {
        return segment.get(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount);
    }

    public void copyDstLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageLayout.class) IntPtr pCopyDstLayouts() {
        MemorySegment s = pCopyDstLayoutsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCopyDstLayouts(@Nullable @enumtype(VkImageLayout.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopyDstLayoutsRaw(s);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopyDstLayoutsRaw() {
        return segment.get(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts);
    }

    public void pCopyDstLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts, value);
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$copySrcLayoutCount = PathElement.groupElement("copySrcLayoutCount");
    public static final PathElement PATH$pCopySrcLayouts = PathElement.groupElement("pCopySrcLayouts");
    public static final PathElement PATH$copyDstLayoutCount = PathElement.groupElement("copyDstLayoutCount");
    public static final PathElement PATH$pCopyDstLayouts = PathElement.groupElement("pCopyDstLayouts");
    public static final PathElement PATH$optimalTilingLayoutUUID = PathElement.groupElement("optimalTilingLayoutUUID");
    public static final PathElement PATH$identicalMemoryTypeRequirements = PathElement.groupElement("identicalMemoryTypeRequirements");

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
}
