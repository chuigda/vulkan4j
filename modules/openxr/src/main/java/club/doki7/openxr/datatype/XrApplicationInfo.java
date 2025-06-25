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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApplicationInfo.html"><code>XrApplicationInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrApplicationInfo {
///     char[XR_MAX_APPLICATION_NAME_SIZE] applicationName; // @link substring="applicationName" target="#applicationName"
///     uint32_t applicationVersion; // @link substring="applicationVersion" target="#applicationVersion"
///     char[XR_MAX_ENGINE_NAME_SIZE] engineName; // @link substring="engineName" target="#engineName"
///     uint32_t engineVersion; // @link substring="engineVersion" target="#engineVersion"
///     XrVersion apiVersion; // @link substring="apiVersion" target="#apiVersion"
/// } XrApplicationInfo;
/// }
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApplicationInfo.html"><code>XrApplicationInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrApplicationInfo(@NotNull MemorySegment segment) implements IXrApplicationInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApplicationInfo.html"><code>XrApplicationInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrApplicationInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrApplicationInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrApplicationInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrApplicationInfo, Iterable<XrApplicationInfo> {
        public long size() {
            return segment.byteSize() / XrApplicationInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrApplicationInfo at(long index) {
            return new XrApplicationInfo(segment.asSlice(index * XrApplicationInfo.BYTES, XrApplicationInfo.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrApplicationInfo> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrApplicationInfo value) {
            MemorySegment s = segment.asSlice(index * XrApplicationInfo.BYTES, XrApplicationInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrApplicationInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrApplicationInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrApplicationInfo.BYTES,
                (end - start) * XrApplicationInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrApplicationInfo.BYTES));
        }

        public XrApplicationInfo[] toArray() {
            XrApplicationInfo[] ret = new XrApplicationInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrApplicationInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrApplicationInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrApplicationInfo.BYTES;
            }

            @Override
            public XrApplicationInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrApplicationInfo ret = new XrApplicationInfo(segment.asSlice(0, XrApplicationInfo.BYTES));
                segment = segment.asSlice(XrApplicationInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrApplicationInfo allocate(Arena arena) {
        return new XrApplicationInfo(arena.allocate(LAYOUT));
    }

    public static XrApplicationInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrApplicationInfo.Ptr(segment);
    }

    public static XrApplicationInfo clone(Arena arena, XrApplicationInfo src) {
        XrApplicationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public BytePtr applicationName() {
        return new BytePtr(applicationNameRaw());
    }

    public XrApplicationInfo applicationName(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = applicationName();
        consumer.accept(ptr);
        return this;
    }

    public XrApplicationInfo applicationName(BytePtr value) {
        MemorySegment s = applicationNameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment applicationNameRaw() {
        return segment.asSlice(OFFSET$applicationName, SIZE$applicationName);
    }

    public @Unsigned int applicationVersion() {
        return segment.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);
    }

    public XrApplicationInfo applicationVersion(@Unsigned int value) {
        segment.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);
        return this;
    }

    public BytePtr engineName() {
        return new BytePtr(engineNameRaw());
    }

    public XrApplicationInfo engineName(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = engineName();
        consumer.accept(ptr);
        return this;
    }

    public XrApplicationInfo engineName(BytePtr value) {
        MemorySegment s = engineNameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment engineNameRaw() {
        return segment.asSlice(OFFSET$engineName, SIZE$engineName);
    }

    public @Unsigned int engineVersion() {
        return segment.get(LAYOUT$engineVersion, OFFSET$engineVersion);
    }

    public XrApplicationInfo engineVersion(@Unsigned int value) {
        segment.set(LAYOUT$engineVersion, OFFSET$engineVersion, value);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long apiVersion() {
        return segment.get(LAYOUT$apiVersion, OFFSET$apiVersion);
    }

    public XrApplicationInfo apiVersion(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(MAX_APPLICATION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("applicationName"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        MemoryLayout.sequenceLayout(MAX_ENGINE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("engineName"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_LONG.withName("apiVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$applicationName = PathElement.groupElement("applicationName");
    public static final PathElement PATH$applicationVersion = PathElement.groupElement("applicationVersion");
    public static final PathElement PATH$engineName = PathElement.groupElement("engineName");
    public static final PathElement PATH$engineVersion = PathElement.groupElement("engineVersion");
    public static final PathElement PATH$apiVersion = PathElement.groupElement("apiVersion");

    public static final SequenceLayout LAYOUT$applicationName = (SequenceLayout) LAYOUT.select(PATH$applicationName);
    public static final OfInt LAYOUT$applicationVersion = (OfInt) LAYOUT.select(PATH$applicationVersion);
    public static final SequenceLayout LAYOUT$engineName = (SequenceLayout) LAYOUT.select(PATH$engineName);
    public static final OfInt LAYOUT$engineVersion = (OfInt) LAYOUT.select(PATH$engineVersion);
    public static final OfLong LAYOUT$apiVersion = (OfLong) LAYOUT.select(PATH$apiVersion);

    public static final long SIZE$applicationName = LAYOUT$applicationName.byteSize();
    public static final long SIZE$applicationVersion = LAYOUT$applicationVersion.byteSize();
    public static final long SIZE$engineName = LAYOUT$engineName.byteSize();
    public static final long SIZE$engineVersion = LAYOUT$engineVersion.byteSize();
    public static final long SIZE$apiVersion = LAYOUT$apiVersion.byteSize();

    public static final long OFFSET$applicationName = LAYOUT.byteOffset(PATH$applicationName);
    public static final long OFFSET$applicationVersion = LAYOUT.byteOffset(PATH$applicationVersion);
    public static final long OFFSET$engineName = LAYOUT.byteOffset(PATH$engineName);
    public static final long OFFSET$engineVersion = LAYOUT.byteOffset(PATH$engineVersion);
    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);
}
