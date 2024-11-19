package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkExtensionProperties {
///     char extensionName[VK_MAX_EXTENSION_NAME_SIZE];
///     uint32_t specVersion;
/// } VkExtensionProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkExtensionProperties.html">VkExtensionProperties</a>
public record VkExtensionProperties(MemorySegment segment) implements IPointer {
    public VkExtensionProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment extensionNameRaw() {
        return segment.asSlice(OFFSET$extensionName, SIZE$extensionName);
    }

    public ByteBuffer extensionName() {
        return new ByteBuffer(extensionNameRaw());
    }

    public void extensionName(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extensionName, SIZE$extensionName);
    }

    public @unsigned int specVersion() {
        return segment.get(LAYOUT$specVersion, OFFSET$specVersion);
    }

    public void specVersion(@unsigned int value) {
        segment.set(LAYOUT$specVersion, OFFSET$specVersion, value);
    }

    public static VkExtensionProperties allocate(Arena arena) {
        return new VkExtensionProperties(arena.allocate(LAYOUT));
    }

    public static VkExtensionProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExtensionProperties[] ret = new VkExtensionProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkExtensionProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExtensionProperties clone(Arena arena, VkExtensionProperties src) {
        VkExtensionProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExtensionProperties[] clone(Arena arena, VkExtensionProperties[] src) {
        VkExtensionProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$extensionName = PathElement.groupElement("extensionName");
    public static final PathElement PATH$specVersion = PathElement.groupElement("specVersion");

    public static final SequenceLayout LAYOUT$extensionName = (SequenceLayout) LAYOUT.select(PATH$extensionName);
    public static final OfInt LAYOUT$specVersion = (OfInt) LAYOUT.select(PATH$specVersion);

    public static final long OFFSET$extensionName = LAYOUT.byteOffset(PATH$extensionName);
    public static final long OFFSET$specVersion = LAYOUT.byteOffset(PATH$specVersion);

    public static final long SIZE$extensionName = LAYOUT$extensionName.byteSize();
    public static final long SIZE$specVersion = LAYOUT$specVersion.byteSize();
}
