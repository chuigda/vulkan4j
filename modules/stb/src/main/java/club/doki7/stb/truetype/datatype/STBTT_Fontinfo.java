package club.doki7.stb.truetype.datatype;

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
import club.doki7.stb.truetype.handle.*;
import static club.doki7.stb.truetype.STBTrueTypeConstants.*;

/// Represents a pointer to a {@code stbtt_fontinfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_fontinfo {
///     void* userdata; // @link substring="userdata" target="#userdata"
///     char* data; // @link substring="data" target="#data"
///     int fontstart; // @link substring="fontstart" target="#fontstart"
///     int numglyphs; // @link substring="numglyphs" target="#numglyphs"
///     int loca; // @link substring="loca" target="#loca"
///     int head; // @link substring="head" target="#head"
///     int glyf; // @link substring="glyf" target="#glyf"
///     int hhea; // @link substring="hhea" target="#hhea"
///     int hmtx; // @link substring="hmtx" target="#hmtx"
///     int kern; // @link substring="kern" target="#kern"
///     int gpos; // @link substring="gpos" target="#gpos"
///     int svg; // @link substring="svg" target="#svg"
///     int indexMap; // @link substring="indexMap" target="#indexMap"
///     int indextolocformat; // @link substring="indextolocformat" target="#indextolocformat"
///     stbtt__buf cff; // @link substring="STBTT_Buf" target="STBTT_Buf" @link substring="cff" target="#cff"
///     stbtt__buf charstrings; // @link substring="STBTT_Buf" target="STBTT_Buf" @link substring="charstrings" target="#charstrings"
///     stbtt__buf gsubrs; // @link substring="STBTT_Buf" target="STBTT_Buf" @link substring="gsubrs" target="#gsubrs"
///     stbtt__buf subrs; // @link substring="STBTT_Buf" target="STBTT_Buf" @link substring="subrs" target="#subrs"
///     stbtt__buf fontdicts; // @link substring="STBTT_Buf" target="STBTT_Buf" @link substring="fontdicts" target="#fontdicts"
///     stbtt__buf fdselect; // @link substring="STBTT_Buf" target="STBTT_Buf" @link substring="fdselect" target="#fdselect"
/// } stbtt_fontinfo;
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
@ValueBasedCandidate
@UnsafeConstructor
public record STBTT_Fontinfo(@NotNull MemorySegment segment) implements ISTBTT_Fontinfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_Fontinfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_Fontinfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_Fontinfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_Fontinfo, Iterable<STBTT_Fontinfo> {
        public long size() {
            return segment.byteSize() / STBTT_Fontinfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_Fontinfo at(long index) {
            return new STBTT_Fontinfo(segment.asSlice(index * STBTT_Fontinfo.BYTES, STBTT_Fontinfo.BYTES));
        }

        public void write(long index, @NotNull STBTT_Fontinfo value) {
            MemorySegment s = segment.asSlice(index * STBTT_Fontinfo.BYTES, STBTT_Fontinfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_Fontinfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_Fontinfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_Fontinfo.BYTES,
                (end - start) * STBTT_Fontinfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_Fontinfo.BYTES));
        }

        public STBTT_Fontinfo[] toArray() {
            STBTT_Fontinfo[] ret = new STBTT_Fontinfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_Fontinfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_Fontinfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_Fontinfo.BYTES;
            }

            @Override
            public STBTT_Fontinfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_Fontinfo ret = new STBTT_Fontinfo(segment.asSlice(0, STBTT_Fontinfo.BYTES));
                segment = segment.asSlice(STBTT_Fontinfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_Fontinfo allocate(Arena arena) {
        return new STBTT_Fontinfo(arena.allocate(LAYOUT));
    }

    public static STBTT_Fontinfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_Fontinfo.Ptr(segment);
    }

    public static STBTT_Fontinfo clone(Arena arena, STBTT_Fontinfo src) {
        STBTT_Fontinfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="void*") MemorySegment userdata() {
        return segment.get(LAYOUT$userdata, OFFSET$userdata);
    }

    public void userdata(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$userdata, OFFSET$userdata, value);
    }

    public STBTT_Fontinfo userdata(@Nullable IPointer pointer) {
        userdata(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr data() {
        MemorySegment s = dataRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public STBTT_Fontinfo data(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        dataRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment dataRaw() {
        return segment.get(LAYOUT$data, OFFSET$data);
    }

    public void dataRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$data, OFFSET$data, value);
    }

    public int fontstart() {
        return segment.get(LAYOUT$fontstart, OFFSET$fontstart);
    }

    public STBTT_Fontinfo fontstart(int value) {
        segment.set(LAYOUT$fontstart, OFFSET$fontstart, value);
        return this;
    }

    public int numglyphs() {
        return segment.get(LAYOUT$numglyphs, OFFSET$numglyphs);
    }

    public STBTT_Fontinfo numglyphs(int value) {
        segment.set(LAYOUT$numglyphs, OFFSET$numglyphs, value);
        return this;
    }

    public int loca() {
        return segment.get(LAYOUT$loca, OFFSET$loca);
    }

    public STBTT_Fontinfo loca(int value) {
        segment.set(LAYOUT$loca, OFFSET$loca, value);
        return this;
    }

    public int head() {
        return segment.get(LAYOUT$head, OFFSET$head);
    }

    public STBTT_Fontinfo head(int value) {
        segment.set(LAYOUT$head, OFFSET$head, value);
        return this;
    }

    public int glyf() {
        return segment.get(LAYOUT$glyf, OFFSET$glyf);
    }

    public STBTT_Fontinfo glyf(int value) {
        segment.set(LAYOUT$glyf, OFFSET$glyf, value);
        return this;
    }

    public int hhea() {
        return segment.get(LAYOUT$hhea, OFFSET$hhea);
    }

    public STBTT_Fontinfo hhea(int value) {
        segment.set(LAYOUT$hhea, OFFSET$hhea, value);
        return this;
    }

    public int hmtx() {
        return segment.get(LAYOUT$hmtx, OFFSET$hmtx);
    }

    public STBTT_Fontinfo hmtx(int value) {
        segment.set(LAYOUT$hmtx, OFFSET$hmtx, value);
        return this;
    }

    public int kern() {
        return segment.get(LAYOUT$kern, OFFSET$kern);
    }

    public STBTT_Fontinfo kern(int value) {
        segment.set(LAYOUT$kern, OFFSET$kern, value);
        return this;
    }

    public int gpos() {
        return segment.get(LAYOUT$gpos, OFFSET$gpos);
    }

    public STBTT_Fontinfo gpos(int value) {
        segment.set(LAYOUT$gpos, OFFSET$gpos, value);
        return this;
    }

    public int svg() {
        return segment.get(LAYOUT$svg, OFFSET$svg);
    }

    public STBTT_Fontinfo svg(int value) {
        segment.set(LAYOUT$svg, OFFSET$svg, value);
        return this;
    }

    public int indexMap() {
        return segment.get(LAYOUT$indexMap, OFFSET$indexMap);
    }

    public STBTT_Fontinfo indexMap(int value) {
        segment.set(LAYOUT$indexMap, OFFSET$indexMap, value);
        return this;
    }

    public int indextolocformat() {
        return segment.get(LAYOUT$indextolocformat, OFFSET$indextolocformat);
    }

    public STBTT_Fontinfo indextolocformat(int value) {
        segment.set(LAYOUT$indextolocformat, OFFSET$indextolocformat, value);
        return this;
    }

    public @NotNull STBTT_Buf cff() {
        return new STBTT_Buf(segment.asSlice(OFFSET$cff, LAYOUT$cff));
    }

    public STBTT_Fontinfo cff(@NotNull STBTT_Buf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$cff, SIZE$cff);
        return this;
    }

    public STBTT_Fontinfo cff(Consumer<@NotNull STBTT_Buf> consumer) {
        consumer.accept(cff());
        return this;
    }

    public @NotNull STBTT_Buf charstrings() {
        return new STBTT_Buf(segment.asSlice(OFFSET$charstrings, LAYOUT$charstrings));
    }

    public STBTT_Fontinfo charstrings(@NotNull STBTT_Buf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$charstrings, SIZE$charstrings);
        return this;
    }

    public STBTT_Fontinfo charstrings(Consumer<@NotNull STBTT_Buf> consumer) {
        consumer.accept(charstrings());
        return this;
    }

    public @NotNull STBTT_Buf gsubrs() {
        return new STBTT_Buf(segment.asSlice(OFFSET$gsubrs, LAYOUT$gsubrs));
    }

    public STBTT_Fontinfo gsubrs(@NotNull STBTT_Buf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$gsubrs, SIZE$gsubrs);
        return this;
    }

    public STBTT_Fontinfo gsubrs(Consumer<@NotNull STBTT_Buf> consumer) {
        consumer.accept(gsubrs());
        return this;
    }

    public @NotNull STBTT_Buf subrs() {
        return new STBTT_Buf(segment.asSlice(OFFSET$subrs, LAYOUT$subrs));
    }

    public STBTT_Fontinfo subrs(@NotNull STBTT_Buf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subrs, SIZE$subrs);
        return this;
    }

    public STBTT_Fontinfo subrs(Consumer<@NotNull STBTT_Buf> consumer) {
        consumer.accept(subrs());
        return this;
    }

    public @NotNull STBTT_Buf fontdicts() {
        return new STBTT_Buf(segment.asSlice(OFFSET$fontdicts, LAYOUT$fontdicts));
    }

    public STBTT_Fontinfo fontdicts(@NotNull STBTT_Buf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fontdicts, SIZE$fontdicts);
        return this;
    }

    public STBTT_Fontinfo fontdicts(Consumer<@NotNull STBTT_Buf> consumer) {
        consumer.accept(fontdicts());
        return this;
    }

    public @NotNull STBTT_Buf fdselect() {
        return new STBTT_Buf(segment.asSlice(OFFSET$fdselect, LAYOUT$fdselect));
    }

    public STBTT_Fontinfo fdselect(@NotNull STBTT_Buf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fdselect, SIZE$fdselect);
        return this;
    }

    public STBTT_Fontinfo fdselect(Consumer<@NotNull STBTT_Buf> consumer) {
        consumer.accept(fdselect());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("userdata"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("data"),
        ValueLayout.JAVA_INT.withName("fontstart"),
        ValueLayout.JAVA_INT.withName("numglyphs"),
        ValueLayout.JAVA_INT.withName("loca"),
        ValueLayout.JAVA_INT.withName("head"),
        ValueLayout.JAVA_INT.withName("glyf"),
        ValueLayout.JAVA_INT.withName("hhea"),
        ValueLayout.JAVA_INT.withName("hmtx"),
        ValueLayout.JAVA_INT.withName("kern"),
        ValueLayout.JAVA_INT.withName("gpos"),
        ValueLayout.JAVA_INT.withName("svg"),
        ValueLayout.JAVA_INT.withName("indexMap"),
        ValueLayout.JAVA_INT.withName("indextolocformat"),
        STBTT_Buf.LAYOUT.withName("cff"),
        STBTT_Buf.LAYOUT.withName("charstrings"),
        STBTT_Buf.LAYOUT.withName("gsubrs"),
        STBTT_Buf.LAYOUT.withName("subrs"),
        STBTT_Buf.LAYOUT.withName("fontdicts"),
        STBTT_Buf.LAYOUT.withName("fdselect")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$userdata = PathElement.groupElement("userdata");
    public static final PathElement PATH$data = PathElement.groupElement("data");
    public static final PathElement PATH$fontstart = PathElement.groupElement("fontstart");
    public static final PathElement PATH$numglyphs = PathElement.groupElement("numglyphs");
    public static final PathElement PATH$loca = PathElement.groupElement("loca");
    public static final PathElement PATH$head = PathElement.groupElement("head");
    public static final PathElement PATH$glyf = PathElement.groupElement("glyf");
    public static final PathElement PATH$hhea = PathElement.groupElement("hhea");
    public static final PathElement PATH$hmtx = PathElement.groupElement("hmtx");
    public static final PathElement PATH$kern = PathElement.groupElement("kern");
    public static final PathElement PATH$gpos = PathElement.groupElement("gpos");
    public static final PathElement PATH$svg = PathElement.groupElement("svg");
    public static final PathElement PATH$indexMap = PathElement.groupElement("indexMap");
    public static final PathElement PATH$indextolocformat = PathElement.groupElement("indextolocformat");
    public static final PathElement PATH$cff = PathElement.groupElement("cff");
    public static final PathElement PATH$charstrings = PathElement.groupElement("charstrings");
    public static final PathElement PATH$gsubrs = PathElement.groupElement("gsubrs");
    public static final PathElement PATH$subrs = PathElement.groupElement("subrs");
    public static final PathElement PATH$fontdicts = PathElement.groupElement("fontdicts");
    public static final PathElement PATH$fdselect = PathElement.groupElement("fdselect");

    public static final AddressLayout LAYOUT$userdata = (AddressLayout) LAYOUT.select(PATH$userdata);
    public static final AddressLayout LAYOUT$data = (AddressLayout) LAYOUT.select(PATH$data);
    public static final OfInt LAYOUT$fontstart = (OfInt) LAYOUT.select(PATH$fontstart);
    public static final OfInt LAYOUT$numglyphs = (OfInt) LAYOUT.select(PATH$numglyphs);
    public static final OfInt LAYOUT$loca = (OfInt) LAYOUT.select(PATH$loca);
    public static final OfInt LAYOUT$head = (OfInt) LAYOUT.select(PATH$head);
    public static final OfInt LAYOUT$glyf = (OfInt) LAYOUT.select(PATH$glyf);
    public static final OfInt LAYOUT$hhea = (OfInt) LAYOUT.select(PATH$hhea);
    public static final OfInt LAYOUT$hmtx = (OfInt) LAYOUT.select(PATH$hmtx);
    public static final OfInt LAYOUT$kern = (OfInt) LAYOUT.select(PATH$kern);
    public static final OfInt LAYOUT$gpos = (OfInt) LAYOUT.select(PATH$gpos);
    public static final OfInt LAYOUT$svg = (OfInt) LAYOUT.select(PATH$svg);
    public static final OfInt LAYOUT$indexMap = (OfInt) LAYOUT.select(PATH$indexMap);
    public static final OfInt LAYOUT$indextolocformat = (OfInt) LAYOUT.select(PATH$indextolocformat);
    public static final StructLayout LAYOUT$cff = (StructLayout) LAYOUT.select(PATH$cff);
    public static final StructLayout LAYOUT$charstrings = (StructLayout) LAYOUT.select(PATH$charstrings);
    public static final StructLayout LAYOUT$gsubrs = (StructLayout) LAYOUT.select(PATH$gsubrs);
    public static final StructLayout LAYOUT$subrs = (StructLayout) LAYOUT.select(PATH$subrs);
    public static final StructLayout LAYOUT$fontdicts = (StructLayout) LAYOUT.select(PATH$fontdicts);
    public static final StructLayout LAYOUT$fdselect = (StructLayout) LAYOUT.select(PATH$fdselect);

    public static final long SIZE$userdata = LAYOUT$userdata.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();
    public static final long SIZE$fontstart = LAYOUT$fontstart.byteSize();
    public static final long SIZE$numglyphs = LAYOUT$numglyphs.byteSize();
    public static final long SIZE$loca = LAYOUT$loca.byteSize();
    public static final long SIZE$head = LAYOUT$head.byteSize();
    public static final long SIZE$glyf = LAYOUT$glyf.byteSize();
    public static final long SIZE$hhea = LAYOUT$hhea.byteSize();
    public static final long SIZE$hmtx = LAYOUT$hmtx.byteSize();
    public static final long SIZE$kern = LAYOUT$kern.byteSize();
    public static final long SIZE$gpos = LAYOUT$gpos.byteSize();
    public static final long SIZE$svg = LAYOUT$svg.byteSize();
    public static final long SIZE$indexMap = LAYOUT$indexMap.byteSize();
    public static final long SIZE$indextolocformat = LAYOUT$indextolocformat.byteSize();
    public static final long SIZE$cff = LAYOUT$cff.byteSize();
    public static final long SIZE$charstrings = LAYOUT$charstrings.byteSize();
    public static final long SIZE$gsubrs = LAYOUT$gsubrs.byteSize();
    public static final long SIZE$subrs = LAYOUT$subrs.byteSize();
    public static final long SIZE$fontdicts = LAYOUT$fontdicts.byteSize();
    public static final long SIZE$fdselect = LAYOUT$fdselect.byteSize();

    public static final long OFFSET$userdata = LAYOUT.byteOffset(PATH$userdata);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
    public static final long OFFSET$fontstart = LAYOUT.byteOffset(PATH$fontstart);
    public static final long OFFSET$numglyphs = LAYOUT.byteOffset(PATH$numglyphs);
    public static final long OFFSET$loca = LAYOUT.byteOffset(PATH$loca);
    public static final long OFFSET$head = LAYOUT.byteOffset(PATH$head);
    public static final long OFFSET$glyf = LAYOUT.byteOffset(PATH$glyf);
    public static final long OFFSET$hhea = LAYOUT.byteOffset(PATH$hhea);
    public static final long OFFSET$hmtx = LAYOUT.byteOffset(PATH$hmtx);
    public static final long OFFSET$kern = LAYOUT.byteOffset(PATH$kern);
    public static final long OFFSET$gpos = LAYOUT.byteOffset(PATH$gpos);
    public static final long OFFSET$svg = LAYOUT.byteOffset(PATH$svg);
    public static final long OFFSET$indexMap = LAYOUT.byteOffset(PATH$indexMap);
    public static final long OFFSET$indextolocformat = LAYOUT.byteOffset(PATH$indextolocformat);
    public static final long OFFSET$cff = LAYOUT.byteOffset(PATH$cff);
    public static final long OFFSET$charstrings = LAYOUT.byteOffset(PATH$charstrings);
    public static final long OFFSET$gsubrs = LAYOUT.byteOffset(PATH$gsubrs);
    public static final long OFFSET$subrs = LAYOUT.byteOffset(PATH$subrs);
    public static final long OFFSET$fontdicts = LAYOUT.byteOffset(PATH$fontdicts);
    public static final long OFFSET$fdselect = LAYOUT.byteOffset(PATH$fdselect);
}
