package club.doki7.openxr.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDebugUtilsMessengerCallbackDataEXT.html"><code>XrDebugUtilsMessengerCallbackDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrDebugUtilsMessengerCallbackDataEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     char const* messageId; // optional // @link substring="messageId" target="#messageId"
///     char const* functionName; // optional // @link substring="functionName" target="#functionName"
///     char const* message; // @link substring="message" target="#message"
///     uint32_t objectCount; // optional // @link substring="objectCount" target="#objectCount"
///     XrDebugUtilsObjectNameInfoEXT* objects; // optional // @link substring="XrDebugUtilsObjectNameInfoEXT" target="XrDebugUtilsObjectNameInfoEXT" @link substring="objects" target="#objects"
///     uint32_t sessionLabelCount; // optional // @link substring="sessionLabelCount" target="#sessionLabelCount"
///     XrDebugUtilsLabelEXT* sessionLabels; // optional // @link substring="XrDebugUtilsLabelEXT" target="XrDebugUtilsLabelEXT" @link substring="sessionLabels" target="#sessionLabels"
/// } XrDebugUtilsMessengerCallbackDataEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT`
///
/// The {@code allocate} ({@link XrDebugUtilsMessengerCallbackDataEXT#allocate(Arena)}, {@link XrDebugUtilsMessengerCallbackDataEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrDebugUtilsMessengerCallbackDataEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDebugUtilsMessengerCallbackDataEXT.html"><code>XrDebugUtilsMessengerCallbackDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrDebugUtilsMessengerCallbackDataEXT(@NotNull MemorySegment segment) implements IXrDebugUtilsMessengerCallbackDataEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDebugUtilsMessengerCallbackDataEXT.html"><code>XrDebugUtilsMessengerCallbackDataEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrDebugUtilsMessengerCallbackDataEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrDebugUtilsMessengerCallbackDataEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrDebugUtilsMessengerCallbackDataEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrDebugUtilsMessengerCallbackDataEXT, Iterable<XrDebugUtilsMessengerCallbackDataEXT> {
        public long size() {
            return segment.byteSize() / XrDebugUtilsMessengerCallbackDataEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrDebugUtilsMessengerCallbackDataEXT at(long index) {
            return new XrDebugUtilsMessengerCallbackDataEXT(segment.asSlice(index * XrDebugUtilsMessengerCallbackDataEXT.BYTES, XrDebugUtilsMessengerCallbackDataEXT.BYTES));
        }

        public XrDebugUtilsMessengerCallbackDataEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrDebugUtilsMessengerCallbackDataEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrDebugUtilsMessengerCallbackDataEXT value) {
            MemorySegment s = segment.asSlice(index * XrDebugUtilsMessengerCallbackDataEXT.BYTES, XrDebugUtilsMessengerCallbackDataEXT.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * XrDebugUtilsMessengerCallbackDataEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrDebugUtilsMessengerCallbackDataEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrDebugUtilsMessengerCallbackDataEXT.BYTES,
                (end - start) * XrDebugUtilsMessengerCallbackDataEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrDebugUtilsMessengerCallbackDataEXT.BYTES));
        }

        public XrDebugUtilsMessengerCallbackDataEXT[] toArray() {
            XrDebugUtilsMessengerCallbackDataEXT[] ret = new XrDebugUtilsMessengerCallbackDataEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrDebugUtilsMessengerCallbackDataEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrDebugUtilsMessengerCallbackDataEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrDebugUtilsMessengerCallbackDataEXT.BYTES;
            }

            @Override
            public XrDebugUtilsMessengerCallbackDataEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrDebugUtilsMessengerCallbackDataEXT ret = new XrDebugUtilsMessengerCallbackDataEXT(segment.asSlice(0, XrDebugUtilsMessengerCallbackDataEXT.BYTES));
                segment = segment.asSlice(XrDebugUtilsMessengerCallbackDataEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrDebugUtilsMessengerCallbackDataEXT allocate(Arena arena) {
        XrDebugUtilsMessengerCallbackDataEXT ret = new XrDebugUtilsMessengerCallbackDataEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
        return ret;
    }

    public static XrDebugUtilsMessengerCallbackDataEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrDebugUtilsMessengerCallbackDataEXT.Ptr ret = new XrDebugUtilsMessengerCallbackDataEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
        }
        return ret;
    }

    public static XrDebugUtilsMessengerCallbackDataEXT clone(Arena arena, XrDebugUtilsMessengerCallbackDataEXT src) {
        XrDebugUtilsMessengerCallbackDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrDebugUtilsMessengerCallbackDataEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrDebugUtilsMessengerCallbackDataEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrDebugUtilsMessengerCallbackDataEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr messageId() {
        MemorySegment s = messageIdRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public XrDebugUtilsMessengerCallbackDataEXT messageId(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        messageIdRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment messageIdRaw() {
        return segment.get(LAYOUT$messageId, OFFSET$messageId);
    }

    public void messageIdRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$messageId, OFFSET$messageId, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr functionName() {
        MemorySegment s = functionNameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public XrDebugUtilsMessengerCallbackDataEXT functionName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        functionNameRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment functionNameRaw() {
        return segment.get(LAYOUT$functionName, OFFSET$functionName);
    }

    public void functionNameRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$functionName, OFFSET$functionName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr message() {
        MemorySegment s = messageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public XrDebugUtilsMessengerCallbackDataEXT message(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        messageRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") @NotNull MemorySegment messageRaw() {
        return segment.get(LAYOUT$message, OFFSET$message);
    }

    public void messageRaw(@Pointer(comment="int8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$message, OFFSET$message, value);
    }

    public @Unsigned int objectCount() {
        return segment.get(LAYOUT$objectCount, OFFSET$objectCount);
    }

    public XrDebugUtilsMessengerCallbackDataEXT objectCount(@Unsigned int value) {
        segment.set(LAYOUT$objectCount, OFFSET$objectCount, value);
        return this;
    }

    public XrDebugUtilsMessengerCallbackDataEXT objects(@Nullable IXrDebugUtilsObjectNameInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        objectsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrDebugUtilsObjectNameInfoEXT.Ptr objects(int assumedCount) {
        MemorySegment s = objectsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrDebugUtilsObjectNameInfoEXT.BYTES);
        return new XrDebugUtilsObjectNameInfoEXT.Ptr(s);
    }

    public @Nullable XrDebugUtilsObjectNameInfoEXT objects() {
        MemorySegment s = objectsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrDebugUtilsObjectNameInfoEXT(s);
    }

    public @Pointer(target=XrDebugUtilsObjectNameInfoEXT.class) @NotNull MemorySegment objectsRaw() {
        return segment.get(LAYOUT$objects, OFFSET$objects);
    }

    public void objectsRaw(@Pointer(target=XrDebugUtilsObjectNameInfoEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$objects, OFFSET$objects, value);
    }

    public @Unsigned int sessionLabelCount() {
        return segment.get(LAYOUT$sessionLabelCount, OFFSET$sessionLabelCount);
    }

    public XrDebugUtilsMessengerCallbackDataEXT sessionLabelCount(@Unsigned int value) {
        segment.set(LAYOUT$sessionLabelCount, OFFSET$sessionLabelCount, value);
        return this;
    }

    public XrDebugUtilsMessengerCallbackDataEXT sessionLabels(@Nullable IXrDebugUtilsLabelEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        sessionLabelsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrDebugUtilsLabelEXT.Ptr sessionLabels(int assumedCount) {
        MemorySegment s = sessionLabelsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrDebugUtilsLabelEXT.BYTES);
        return new XrDebugUtilsLabelEXT.Ptr(s);
    }

    public @Nullable XrDebugUtilsLabelEXT sessionLabels() {
        MemorySegment s = sessionLabelsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrDebugUtilsLabelEXT(s);
    }

    public @Pointer(target=XrDebugUtilsLabelEXT.class) @NotNull MemorySegment sessionLabelsRaw() {
        return segment.get(LAYOUT$sessionLabels, OFFSET$sessionLabels);
    }

    public void sessionLabelsRaw(@Pointer(target=XrDebugUtilsLabelEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$sessionLabels, OFFSET$sessionLabels, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("messageId"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("functionName"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("message"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsObjectNameInfoEXT.LAYOUT).withName("objects"),
        ValueLayout.JAVA_INT.withName("sessionLabelCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsLabelEXT.LAYOUT).withName("sessionLabels")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$messageId = PathElement.groupElement("messageId");
    public static final PathElement PATH$functionName = PathElement.groupElement("functionName");
    public static final PathElement PATH$message = PathElement.groupElement("message");
    public static final PathElement PATH$objectCount = PathElement.groupElement("objectCount");
    public static final PathElement PATH$objects = PathElement.groupElement("objects");
    public static final PathElement PATH$sessionLabelCount = PathElement.groupElement("sessionLabelCount");
    public static final PathElement PATH$sessionLabels = PathElement.groupElement("sessionLabels");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$messageId = (AddressLayout) LAYOUT.select(PATH$messageId);
    public static final AddressLayout LAYOUT$functionName = (AddressLayout) LAYOUT.select(PATH$functionName);
    public static final AddressLayout LAYOUT$message = (AddressLayout) LAYOUT.select(PATH$message);
    public static final OfInt LAYOUT$objectCount = (OfInt) LAYOUT.select(PATH$objectCount);
    public static final AddressLayout LAYOUT$objects = (AddressLayout) LAYOUT.select(PATH$objects);
    public static final OfInt LAYOUT$sessionLabelCount = (OfInt) LAYOUT.select(PATH$sessionLabelCount);
    public static final AddressLayout LAYOUT$sessionLabels = (AddressLayout) LAYOUT.select(PATH$sessionLabels);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$messageId = LAYOUT$messageId.byteSize();
    public static final long SIZE$functionName = LAYOUT$functionName.byteSize();
    public static final long SIZE$message = LAYOUT$message.byteSize();
    public static final long SIZE$objectCount = LAYOUT$objectCount.byteSize();
    public static final long SIZE$objects = LAYOUT$objects.byteSize();
    public static final long SIZE$sessionLabelCount = LAYOUT$sessionLabelCount.byteSize();
    public static final long SIZE$sessionLabels = LAYOUT$sessionLabels.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$messageId = LAYOUT.byteOffset(PATH$messageId);
    public static final long OFFSET$functionName = LAYOUT.byteOffset(PATH$functionName);
    public static final long OFFSET$message = LAYOUT.byteOffset(PATH$message);
    public static final long OFFSET$objectCount = LAYOUT.byteOffset(PATH$objectCount);
    public static final long OFFSET$objects = LAYOUT.byteOffset(PATH$objects);
    public static final long OFFSET$sessionLabelCount = LAYOUT.byteOffset(PATH$sessionLabelCount);
    public static final long OFFSET$sessionLabels = LAYOUT.byteOffset(PATH$sessionLabels);
}
