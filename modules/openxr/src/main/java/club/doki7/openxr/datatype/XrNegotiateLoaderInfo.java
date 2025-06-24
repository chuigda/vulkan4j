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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateLoaderInfo.html"><code>XrNegotiateLoaderInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrNegotiateLoaderInfo {
///     XrLoaderInterfaceStructs structType; // @link substring="XrLoaderInterfaceStructs" target="XrLoaderInterfaceStructs" @link substring="structType" target="#structType"
///     uint32_t structVersion; // @link substring="structVersion" target="#structVersion"
///     size_t structSize; // @link substring="structSize" target="#structSize"
///     uint32_t minInterfaceVersion; // @link substring="minInterfaceVersion" target="#minInterfaceVersion"
///     uint32_t maxInterfaceVersion; // @link substring="maxInterfaceVersion" target="#maxInterfaceVersion"
///     XrVersion minApiVersion; // @link substring="minApiVersion" target="#minApiVersion"
///     XrVersion maxApiVersion; // @link substring="maxApiVersion" target="#maxApiVersion"
/// } XrNegotiateLoaderInfo;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateLoaderInfo.html"><code>XrNegotiateLoaderInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrNegotiateLoaderInfo(@NotNull MemorySegment segment) implements IXrNegotiateLoaderInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateLoaderInfo.html"><code>XrNegotiateLoaderInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrNegotiateLoaderInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrNegotiateLoaderInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrNegotiateLoaderInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrNegotiateLoaderInfo, Iterable<XrNegotiateLoaderInfo> {
        public long size() {
            return segment.byteSize() / XrNegotiateLoaderInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrNegotiateLoaderInfo at(long index) {
            return new XrNegotiateLoaderInfo(segment.asSlice(index * XrNegotiateLoaderInfo.BYTES, XrNegotiateLoaderInfo.BYTES));
        }

        public void write(long index, @NotNull XrNegotiateLoaderInfo value) {
            MemorySegment s = segment.asSlice(index * XrNegotiateLoaderInfo.BYTES, XrNegotiateLoaderInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrNegotiateLoaderInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrNegotiateLoaderInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrNegotiateLoaderInfo.BYTES,
                (end - start) * XrNegotiateLoaderInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrNegotiateLoaderInfo.BYTES));
        }

        public XrNegotiateLoaderInfo[] toArray() {
            XrNegotiateLoaderInfo[] ret = new XrNegotiateLoaderInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrNegotiateLoaderInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrNegotiateLoaderInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrNegotiateLoaderInfo.BYTES;
            }

            @Override
            public XrNegotiateLoaderInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrNegotiateLoaderInfo ret = new XrNegotiateLoaderInfo(segment.asSlice(0, XrNegotiateLoaderInfo.BYTES));
                segment = segment.asSlice(XrNegotiateLoaderInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrNegotiateLoaderInfo allocate(Arena arena) {
        return new XrNegotiateLoaderInfo(arena.allocate(LAYOUT));
    }

    public static XrNegotiateLoaderInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrNegotiateLoaderInfo.Ptr(segment);
    }

    public static XrNegotiateLoaderInfo clone(Arena arena, XrNegotiateLoaderInfo src) {
        XrNegotiateLoaderInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrLoaderInterfaceStructs.class) int structType() {
        return segment.get(LAYOUT$structType, OFFSET$structType);
    }

    public XrNegotiateLoaderInfo structType(@EnumType(XrLoaderInterfaceStructs.class) int value) {
        segment.set(LAYOUT$structType, OFFSET$structType, value);
        return this;
    }

    public @Unsigned int structVersion() {
        return segment.get(LAYOUT$structVersion, OFFSET$structVersion);
    }

    public XrNegotiateLoaderInfo structVersion(@Unsigned int value) {
        segment.set(LAYOUT$structVersion, OFFSET$structVersion, value);
        return this;
    }

    public @Unsigned long structSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$structSize);
    }

    public XrNegotiateLoaderInfo structSize(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$structSize, value);
        return this;
    }

    public @Unsigned int minInterfaceVersion() {
        return segment.get(LAYOUT$minInterfaceVersion, OFFSET$minInterfaceVersion);
    }

    public XrNegotiateLoaderInfo minInterfaceVersion(@Unsigned int value) {
        segment.set(LAYOUT$minInterfaceVersion, OFFSET$minInterfaceVersion, value);
        return this;
    }

    public @Unsigned int maxInterfaceVersion() {
        return segment.get(LAYOUT$maxInterfaceVersion, OFFSET$maxInterfaceVersion);
    }

    public XrNegotiateLoaderInfo maxInterfaceVersion(@Unsigned int value) {
        segment.set(LAYOUT$maxInterfaceVersion, OFFSET$maxInterfaceVersion, value);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long minApiVersion() {
        return segment.get(LAYOUT$minApiVersion, OFFSET$minApiVersion);
    }

    public XrNegotiateLoaderInfo minApiVersion(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$minApiVersion, OFFSET$minApiVersion, value);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long maxApiVersion() {
        return segment.get(LAYOUT$maxApiVersion, OFFSET$maxApiVersion);
    }

    public XrNegotiateLoaderInfo maxApiVersion(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$maxApiVersion, OFFSET$maxApiVersion, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("structType"),
        ValueLayout.JAVA_INT.withName("structVersion"),
        NativeLayout.C_SIZE_T.withName("structSize"),
        ValueLayout.JAVA_INT.withName("minInterfaceVersion"),
        ValueLayout.JAVA_INT.withName("maxInterfaceVersion"),
        ValueLayout.JAVA_LONG.withName("minApiVersion"),
        ValueLayout.JAVA_LONG.withName("maxApiVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$structType = PathElement.groupElement("structType");
    public static final PathElement PATH$structVersion = PathElement.groupElement("structVersion");
    public static final PathElement PATH$structSize = PathElement.groupElement("structSize");
    public static final PathElement PATH$minInterfaceVersion = PathElement.groupElement("minInterfaceVersion");
    public static final PathElement PATH$maxInterfaceVersion = PathElement.groupElement("maxInterfaceVersion");
    public static final PathElement PATH$minApiVersion = PathElement.groupElement("minApiVersion");
    public static final PathElement PATH$maxApiVersion = PathElement.groupElement("maxApiVersion");

    public static final OfInt LAYOUT$structType = (OfInt) LAYOUT.select(PATH$structType);
    public static final OfInt LAYOUT$structVersion = (OfInt) LAYOUT.select(PATH$structVersion);
    public static final OfInt LAYOUT$minInterfaceVersion = (OfInt) LAYOUT.select(PATH$minInterfaceVersion);
    public static final OfInt LAYOUT$maxInterfaceVersion = (OfInt) LAYOUT.select(PATH$maxInterfaceVersion);
    public static final OfLong LAYOUT$minApiVersion = (OfLong) LAYOUT.select(PATH$minApiVersion);
    public static final OfLong LAYOUT$maxApiVersion = (OfLong) LAYOUT.select(PATH$maxApiVersion);

    public static final long SIZE$structType = LAYOUT$structType.byteSize();
    public static final long SIZE$structVersion = LAYOUT$structVersion.byteSize();
    public static final long SIZE$structSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$minInterfaceVersion = LAYOUT$minInterfaceVersion.byteSize();
    public static final long SIZE$maxInterfaceVersion = LAYOUT$maxInterfaceVersion.byteSize();
    public static final long SIZE$minApiVersion = LAYOUT$minApiVersion.byteSize();
    public static final long SIZE$maxApiVersion = LAYOUT$maxApiVersion.byteSize();

    public static final long OFFSET$structType = LAYOUT.byteOffset(PATH$structType);
    public static final long OFFSET$structVersion = LAYOUT.byteOffset(PATH$structVersion);
    public static final long OFFSET$structSize = LAYOUT.byteOffset(PATH$structSize);
    public static final long OFFSET$minInterfaceVersion = LAYOUT.byteOffset(PATH$minInterfaceVersion);
    public static final long OFFSET$maxInterfaceVersion = LAYOUT.byteOffset(PATH$maxInterfaceVersion);
    public static final long OFFSET$minApiVersion = LAYOUT.byteOffset(PATH$minApiVersion);
    public static final long OFFSET$maxApiVersion = LAYOUT.byteOffset(PATH$maxApiVersion);
}
