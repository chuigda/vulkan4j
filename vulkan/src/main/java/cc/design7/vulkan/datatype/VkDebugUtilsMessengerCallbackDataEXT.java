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

/// Represents a pointer to a {@code VkDebugUtilsMessengerCallbackDataEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsMessengerCallbackDataEXT.html">VkDebugUtilsMessengerCallbackDataEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDebugUtilsMessengerCallbackDataEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkDebugUtilsMessengerCallbackDataEXT {
        sType(VkStructureType.DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
    }

    public static VkDebugUtilsMessengerCallbackDataEXT allocate(Arena arena) {
        return new VkDebugUtilsMessengerCallbackDataEXT(arena.allocate(LAYOUT));
    }

    public static VkDebugUtilsMessengerCallbackDataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsMessengerCallbackDataEXT[] ret = new VkDebugUtilsMessengerCallbackDataEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDebugUtilsMessengerCallbackDataEXT(segment.asSlice(i * BYTES, BYTES));
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pMessageIdName = PathElement.groupElement("PATH$pMessageIdName");
    public static final PathElement PATH$messageIdNumber = PathElement.groupElement("PATH$messageIdNumber");
    public static final PathElement PATH$pMessage = PathElement.groupElement("PATH$pMessage");
    public static final PathElement PATH$queueLabelCount = PathElement.groupElement("PATH$queueLabelCount");
    public static final PathElement PATH$pQueueLabels = PathElement.groupElement("PATH$pQueueLabels");
    public static final PathElement PATH$cmdBufLabelCount = PathElement.groupElement("PATH$cmdBufLabelCount");
    public static final PathElement PATH$pCmdBufLabels = PathElement.groupElement("PATH$pCmdBufLabels");
    public static final PathElement PATH$objectCount = PathElement.groupElement("PATH$objectCount");
    public static final PathElement PATH$pObjects = PathElement.groupElement("PATH$pObjects");

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

    public @enumtype(VkDebugUtilsMessengerCallbackDataFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDebugUtilsMessengerCallbackDataFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="byte*") MemorySegment pMessageIdNameRaw() {
        return segment.get(LAYOUT$pMessageIdName, OFFSET$pMessageIdName);
    }

    public void pMessageIdNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pMessageIdName, OFFSET$pMessageIdName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pMessageIdName() {
        MemorySegment s = pMessageIdNameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pMessageIdName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMessageIdNameRaw(s);
    }

    public int messageIdNumber() {
        return segment.get(LAYOUT$messageIdNumber, OFFSET$messageIdNumber);
    }

    public void messageIdNumber(int value) {
        segment.set(LAYOUT$messageIdNumber, OFFSET$messageIdNumber, value);
    }

    public @pointer(comment="byte*") MemorySegment pMessageRaw() {
        return segment.get(LAYOUT$pMessage, OFFSET$pMessage);
    }

    public void pMessageRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pMessage, OFFSET$pMessage, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pMessage() {
        MemorySegment s = pMessageRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pMessage(@Nullable BytePtr value) {
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

    public void pQueueLabels(@Nullable VkDebugUtilsLabelEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueueLabelsRaw(s);
    }

    @unsafe public @Nullable VkDebugUtilsLabelEXT[] pQueueLabels(int assumedCount) {
        MemorySegment s = pQueueLabelsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDebugUtilsLabelEXT.SIZE);
        VkDebugUtilsLabelEXT[] ret = new VkDebugUtilsLabelEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDebugUtilsLabelEXT(s.asSlice(i * VkDebugUtilsLabelEXT.SIZE, VkDebugUtilsLabelEXT.SIZE));
        }
        return ret;
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

    public void pCmdBufLabels(@Nullable VkDebugUtilsLabelEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCmdBufLabelsRaw(s);
    }

    @unsafe public @Nullable VkDebugUtilsLabelEXT[] pCmdBufLabels(int assumedCount) {
        MemorySegment s = pCmdBufLabelsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDebugUtilsLabelEXT.SIZE);
        VkDebugUtilsLabelEXT[] ret = new VkDebugUtilsLabelEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDebugUtilsLabelEXT(s.asSlice(i * VkDebugUtilsLabelEXT.SIZE, VkDebugUtilsLabelEXT.SIZE));
        }
        return ret;
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

    public void pObjects(@Nullable VkDebugUtilsObjectNameInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pObjectsRaw(s);
    }

    @unsafe public @Nullable VkDebugUtilsObjectNameInfoEXT[] pObjects(int assumedCount) {
        MemorySegment s = pObjectsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDebugUtilsObjectNameInfoEXT.SIZE);
        VkDebugUtilsObjectNameInfoEXT[] ret = new VkDebugUtilsObjectNameInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDebugUtilsObjectNameInfoEXT(s.asSlice(i * VkDebugUtilsObjectNameInfoEXT.SIZE, VkDebugUtilsObjectNameInfoEXT.SIZE));
        }
        return ret;
    }

}
