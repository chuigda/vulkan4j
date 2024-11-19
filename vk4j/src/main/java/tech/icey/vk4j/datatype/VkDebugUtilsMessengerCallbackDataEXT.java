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
/// typedef struct VkDebugUtilsMessengerCallbackDataEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDebugUtilsMessengerCallbackDataFlagsEXT flags;
///     const char* pMessageIdName;
///     int32_t messageIdNumber;
///     const char* pMessage;
///     uint32_t queueLabelCount;
///     const VkDebugUtilsLabelEXT* pQueueLabels;
///     uint32_t cmdBufLabelCount;
///     const VkDebugUtilsLabelEXT* pCmdBufLabels;
///     uint32_t objectCount;
///     const VkDebugUtilsObjectNameInfoEXT* pObjects;
/// } VkDebugUtilsMessengerCallbackDataEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDebugUtilsMessengerCallbackDataEXT.html">VkDebugUtilsMessengerCallbackDataEXT</a>
public record VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment) implements IPointer {
    public VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkDebugUtilsMessengerCallbackDataFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDebugUtilsMessengerCallbackDataFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="int8_t*") MemorySegment pMessageIdNameRaw() {
        return segment.get(LAYOUT$pMessageIdName, OFFSET$pMessageIdName);
    }

    public void pMessageIdNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pMessageIdName, OFFSET$pMessageIdName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable ByteBuffer pMessageIdName() {
        MemorySegment s = pMessageIdNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pMessageIdName(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMessageIdNameRaw(s);
    }

    public int messageIdNumber() {
        return segment.get(LAYOUT$messageIdNumber, OFFSET$messageIdNumber);
    }

    public void messageIdNumber(int value) {
        segment.set(LAYOUT$messageIdNumber, OFFSET$messageIdNumber, value);
    }

    public @pointer(comment="int8_t*") MemorySegment pMessageRaw() {
        return segment.get(LAYOUT$pMessage, OFFSET$pMessage);
    }

    public void pMessageRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pMessage, OFFSET$pMessage, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable ByteBuffer pMessage() {
        MemorySegment s = pMessageRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pMessage(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMessageRaw(s);
    }

    public @unsigned int queueLabelCount() {
        return segment.get(LAYOUT$queueLabelCount, OFFSET$queueLabelCount);
    }

    public void queueLabelCount(@unsigned int value) {
        segment.set(LAYOUT$queueLabelCount, OFFSET$queueLabelCount, value);
    }

    public @pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment pQueueLabelsRaw() {
        return segment.get(LAYOUT$pQueueLabels, OFFSET$pQueueLabels);
    }

    public void pQueueLabelsRaw(@pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment value) {
        segment.set(LAYOUT$pQueueLabels, OFFSET$pQueueLabels, value);
    }

    public @Nullable VkDebugUtilsLabelEXT pQueueLabels() {
        MemorySegment s = pQueueLabelsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDebugUtilsLabelEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDebugUtilsLabelEXT[] pQueueLabels(int assumedCount) {
        MemorySegment s = pQueueLabelsRaw().reinterpret(assumedCount * VkDebugUtilsLabelEXT.SIZE);
        VkDebugUtilsLabelEXT[] arr = new VkDebugUtilsLabelEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDebugUtilsLabelEXT(s.asSlice(i * VkDebugUtilsLabelEXT.SIZE, VkDebugUtilsLabelEXT.SIZE));
        }
        return arr;
    }

    public void pQueueLabels(@Nullable VkDebugUtilsLabelEXT value) {
        pQueueLabelsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int cmdBufLabelCount() {
        return segment.get(LAYOUT$cmdBufLabelCount, OFFSET$cmdBufLabelCount);
    }

    public void cmdBufLabelCount(@unsigned int value) {
        segment.set(LAYOUT$cmdBufLabelCount, OFFSET$cmdBufLabelCount, value);
    }

    public @pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment pCmdBufLabelsRaw() {
        return segment.get(LAYOUT$pCmdBufLabels, OFFSET$pCmdBufLabels);
    }

    public void pCmdBufLabelsRaw(@pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment value) {
        segment.set(LAYOUT$pCmdBufLabels, OFFSET$pCmdBufLabels, value);
    }

    public @Nullable VkDebugUtilsLabelEXT pCmdBufLabels() {
        MemorySegment s = pCmdBufLabelsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDebugUtilsLabelEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDebugUtilsLabelEXT[] pCmdBufLabels(int assumedCount) {
        MemorySegment s = pCmdBufLabelsRaw().reinterpret(assumedCount * VkDebugUtilsLabelEXT.SIZE);
        VkDebugUtilsLabelEXT[] arr = new VkDebugUtilsLabelEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDebugUtilsLabelEXT(s.asSlice(i * VkDebugUtilsLabelEXT.SIZE, VkDebugUtilsLabelEXT.SIZE));
        }
        return arr;
    }

    public void pCmdBufLabels(@Nullable VkDebugUtilsLabelEXT value) {
        pCmdBufLabelsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int objectCount() {
        return segment.get(LAYOUT$objectCount, OFFSET$objectCount);
    }

    public void objectCount(@unsigned int value) {
        segment.set(LAYOUT$objectCount, OFFSET$objectCount, value);
    }

    public @pointer(comment="VkDebugUtilsObjectNameInfoEXT*") MemorySegment pObjectsRaw() {
        return segment.get(LAYOUT$pObjects, OFFSET$pObjects);
    }

    public void pObjectsRaw(@pointer(comment="VkDebugUtilsObjectNameInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pObjects, OFFSET$pObjects, value);
    }

    public @Nullable VkDebugUtilsObjectNameInfoEXT pObjects() {
        MemorySegment s = pObjectsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDebugUtilsObjectNameInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDebugUtilsObjectNameInfoEXT[] pObjects(int assumedCount) {
        MemorySegment s = pObjectsRaw().reinterpret(assumedCount * VkDebugUtilsObjectNameInfoEXT.SIZE);
        VkDebugUtilsObjectNameInfoEXT[] arr = new VkDebugUtilsObjectNameInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDebugUtilsObjectNameInfoEXT(s.asSlice(i * VkDebugUtilsObjectNameInfoEXT.SIZE, VkDebugUtilsObjectNameInfoEXT.SIZE));
        }
        return arr;
    }

    public void pObjects(@Nullable VkDebugUtilsObjectNameInfoEXT value) {
        pObjectsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkDebugUtilsMessengerCallbackDataEXT allocate(Arena arena) {
        return new VkDebugUtilsMessengerCallbackDataEXT(arena.allocate(LAYOUT));
    }

    public static VkDebugUtilsMessengerCallbackDataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsMessengerCallbackDataEXT[] ret = new VkDebugUtilsMessengerCallbackDataEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDebugUtilsMessengerCallbackDataEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDebugUtilsMessengerCallbackDataEXT clone(Arena arena, VkDebugUtilsMessengerCallbackDataEXT src) {
        VkDebugUtilsMessengerCallbackDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugUtilsMessengerCallbackDataEXT[] clone(Arena arena, VkDebugUtilsMessengerCallbackDataEXT[] src) {
        VkDebugUtilsMessengerCallbackDataEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pMessageIdName"),
        ValueLayout.JAVA_INT.withName("messageIdNumber"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pMessage"),
        ValueLayout.JAVA_INT.withName("queueLabelCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT).withName("pQueueLabels"),
        ValueLayout.JAVA_INT.withName("cmdBufLabelCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT).withName("pCmdBufLabels"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsObjectNameInfoEXT.LAYOUT).withName("pObjects")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pMessageIdName = PathElement.groupElement("pMessageIdName");
    public static final PathElement PATH$messageIdNumber = PathElement.groupElement("messageIdNumber");
    public static final PathElement PATH$pMessage = PathElement.groupElement("pMessage");
    public static final PathElement PATH$queueLabelCount = PathElement.groupElement("queueLabelCount");
    public static final PathElement PATH$pQueueLabels = PathElement.groupElement("pQueueLabels");
    public static final PathElement PATH$cmdBufLabelCount = PathElement.groupElement("cmdBufLabelCount");
    public static final PathElement PATH$pCmdBufLabels = PathElement.groupElement("pCmdBufLabels");
    public static final PathElement PATH$objectCount = PathElement.groupElement("objectCount");
    public static final PathElement PATH$pObjects = PathElement.groupElement("pObjects");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pMessageIdName = (AddressLayout) LAYOUT.select(PATH$pMessageIdName);
    public static final OfInt LAYOUT$messageIdNumber = (OfInt) LAYOUT.select(PATH$messageIdNumber);
    public static final AddressLayout LAYOUT$pMessage = (AddressLayout) LAYOUT.select(PATH$pMessage);
    public static final OfInt LAYOUT$queueLabelCount = (OfInt) LAYOUT.select(PATH$queueLabelCount);
    public static final AddressLayout LAYOUT$pQueueLabels = (AddressLayout) LAYOUT.select(PATH$pQueueLabels);
    public static final OfInt LAYOUT$cmdBufLabelCount = (OfInt) LAYOUT.select(PATH$cmdBufLabelCount);
    public static final AddressLayout LAYOUT$pCmdBufLabels = (AddressLayout) LAYOUT.select(PATH$pCmdBufLabels);
    public static final OfInt LAYOUT$objectCount = (OfInt) LAYOUT.select(PATH$objectCount);
    public static final AddressLayout LAYOUT$pObjects = (AddressLayout) LAYOUT.select(PATH$pObjects);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pMessageIdName = LAYOUT.byteOffset(PATH$pMessageIdName);
    public static final long OFFSET$messageIdNumber = LAYOUT.byteOffset(PATH$messageIdNumber);
    public static final long OFFSET$pMessage = LAYOUT.byteOffset(PATH$pMessage);
    public static final long OFFSET$queueLabelCount = LAYOUT.byteOffset(PATH$queueLabelCount);
    public static final long OFFSET$pQueueLabels = LAYOUT.byteOffset(PATH$pQueueLabels);
    public static final long OFFSET$cmdBufLabelCount = LAYOUT.byteOffset(PATH$cmdBufLabelCount);
    public static final long OFFSET$pCmdBufLabels = LAYOUT.byteOffset(PATH$pCmdBufLabels);
    public static final long OFFSET$objectCount = LAYOUT.byteOffset(PATH$objectCount);
    public static final long OFFSET$pObjects = LAYOUT.byteOffset(PATH$pObjects);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pMessageIdName = LAYOUT$pMessageIdName.byteSize();
    public static final long SIZE$messageIdNumber = LAYOUT$messageIdNumber.byteSize();
    public static final long SIZE$pMessage = LAYOUT$pMessage.byteSize();
    public static final long SIZE$queueLabelCount = LAYOUT$queueLabelCount.byteSize();
    public static final long SIZE$pQueueLabels = LAYOUT$pQueueLabels.byteSize();
    public static final long SIZE$cmdBufLabelCount = LAYOUT$cmdBufLabelCount.byteSize();
    public static final long SIZE$pCmdBufLabels = LAYOUT$pCmdBufLabels.byteSize();
    public static final long SIZE$objectCount = LAYOUT$objectCount.byteSize();
    public static final long SIZE$pObjects = LAYOUT$pObjects.byteSize();
}
