from ..ctype import *
from ...entity import Member


def generate_pointer_accessor(type_: CPointerType, member: Member) -> str:
    pointee_type = type_.pointee
    if pointee_type == CTYPE_VOID:
        return generate_pvoid_accessor(type_, member)
    elif isinstance(pointee_type, CPointerType):
        return generate_pp_accessor(member)
    elif isinstance(pointee_type, CNonRefType):
        return generate_p_nonref_type_accessor(pointee_type, member)
    elif isinstance(pointee_type, CEnumType):
        return generate_p_enum_type_accessor(pointee_type, member)
    elif isinstance(pointee_type, CStructType) or isinstance(pointee_type, CUnionType):
        return generate_p_ref_type_accessor(pointee_type, member)
    elif isinstance(pointee_type, CHandleType):
        return generate_p_handle_type_accessor(pointee_type, member)
    else:
        return generic_generic_ptr_accessor(type_, member)


def generate_pvoid_accessor(type_: CPointerType, member: Member) -> str:
    comment = type_.comment if type_.comment is not None else 'void*'

    return f'''    public @pointer(comment="{comment}") MemorySegment {member.name}() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}(@pointer(comment="{comment}") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}

    public void {member.name}(@Nullable IPointer pointer) {{
        {member.name}(pointer == null ? MemorySegment.NULL : pointer.segment());
    }}\n\n'''


def generate_pp_accessor(member: Member) -> str:
    return f'''    public @pointer(comment="void**") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="void**") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}

    /// Note: the returned {{@link PointerBuffer}} does not have correct {{@link PointerBuffer#size}} property. It's up
    /// to user to track the size of the buffer, and use {{@link PointerBuffer#reinterpret}} to set the
    /// size before actually {{@link PointerBuffer#read}}ing or {{@link PointerBuffer#write}}ing the buffer.
    ///
    /// @see PointerBuffer
    public @Nullable PointerBuffer {member.name}() {{
        var s = {member.name}Raw();
        if (s.address() == 0) {{
            return null;
        }}
        return new PointerBuffer({member.name}Raw());
    }}

    public void {member.name}(@Nullable PointerBuffer value) {{
        {member.name}Raw(value == null ? MemorySegment.NULL : value.segment());
    }}\n\n'''


def generate_p_nonref_type_accessor(pointee_type: CNonRefType, member: Member) -> str:
    return f'''    public @pointer(comment="{pointee_type.c_type()}*") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="{pointee_type.c_type()}*") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}

    /// Note: the returned {{@link {pointee_type.vk4j_ptr_type_no_sign()}}} does not have correct
    /// {{@link {pointee_type.vk4j_ptr_type_no_sign()}#size}} property. It's up to user to track the size of the buffer,
    /// and use {{@link {pointee_type.vk4j_ptr_type_no_sign()}#reinterpret}} to set the size before actually
    /// {{@link {pointee_type.vk4j_ptr_type_no_sign()}#read}}ing or
    /// {{@link {pointee_type.vk4j_ptr_type_no_sign()}#write}}ing the buffer.
    public @Nullable {pointee_type.vk4j_ptr_type()} {member.name}() {{
        MemorySegment s = {member.name}Raw();
        return s.address() == 0 ? null : new {pointee_type.vk4j_ptr_type_no_sign()}(s);
    }}

    public void {member.name}(@Nullable {pointee_type.vk4j_ptr_type()} value) {{
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        {member.name}Raw(s);
    }}\n\n'''


def generate_p_enum_type_accessor(pointee_type: CEnumType, member: Member) -> str:
    if pointee_type.bitwidth is None or pointee_type.bitwidth == 32:
        int_type = CTYPE_INT32
    elif pointee_type.bitwidth == 64:
        int_type = CTYPE_INT64
    else:
        raise ValueError(f'Unsupported bitwidth for enum type: {pointee_type.bitwidth}')

    return f'''    public @pointer(target={pointee_type.non_flagbits_type_name()}.class) MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(target={pointee_type.non_flagbits_type_name()}.class) MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}

    /// Note: the returned {{@link {int_type.vk4j_ptr_type_no_sign()}}} does not have correct
    /// {{@link {int_type.vk4j_ptr_type_no_sign()}#size}} property. It's up to user to track the size of the buffer,
    /// and use {{@link {int_type.vk4j_ptr_type_no_sign()}#reinterpret}} to set the size before actually
    /// {{@link {int_type.vk4j_ptr_type_no_sign()}#read}}ing or {{@link {int_type.vk4j_ptr_type_no_sign()}#write}}ing
    /// the buffer.
    public @Nullable @enumtype({pointee_type.non_flagbits_type_name()}.class) {int_type.vk4j_ptr_type()} {member.name}() {{
        MemorySegment s = {member.name}Raw();
        if (s.address() == 0) {{
            return null;
        }}

        return new {int_type.vk4j_ptr_type_no_sign()}(s);
    }}

    public void {member.name}(@Nullable @enumtype({pointee_type.non_flagbits_type_name()}.class) {int_type.vk4j_ptr_type()} value) {{
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        {member.name}Raw(s);
    }}\n\n'''


def generate_p_ref_type_accessor(pointee_type: CStructType | CUnionType | CHandleType, member: Member) -> str:
    return f'''    public @pointer(comment="{pointee_type.name}*") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="{pointee_type.name}*") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}

    public @Nullable {pointee_type.java_type()} {member.name}() {{
        MemorySegment s = {member.name}Raw();
        if (s.address() == 0) {{
            return null;
        }}
        return new {pointee_type.java_type()}(s);
    }}

    /// Note: this function is {{@link unsafe}} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable {pointee_type.java_type()}[] {member.name}(int assumedCount) {{
        MemorySegment s = {member.name}Raw().reinterpret(assumedCount * {pointee_type.java_type()}.SIZE);
        {pointee_type.java_type()}[] arr = new {pointee_type.java_type()}[assumedCount];
        for (int i = 0; i < assumedCount; i++) {{
            arr[i] = new {pointee_type.java_type()}(s.asSlice(i * {pointee_type.java_type()}.SIZE, {pointee_type.java_type()}.SIZE));
        }}
        return arr;
    }}

    public void {member.name}(@Nullable {pointee_type.java_type()} value) {{
        {member.name}Raw(value == null ? MemorySegment.NULL : value.segment());
    }}\n\n'''


def generate_p_handle_type_accessor(pointee_type: CHandleType, member: Member) -> str:
    return f'''    public @pointer(comment="{pointee_type.name}") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="{pointee_type.name}") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}

    /// Note: the returned {{@link {pointee_type.java_type()}.Buffer}} does not have correct
    /// {{@link {pointee_type.java_type()}.Buffer#size}} property. It's up to user to track the size of the buffer,
    /// and use {{@link {pointee_type.java_type()}.Buffer#reinterpret}} to set the size before actually
    /// {{@link {pointee_type.java_type()}.Buffer#read}}ing or {{@link {pointee_type.java_type()}.Buffer#write}}ing
    /// the buffer.
    public @Nullable {pointee_type.java_type()}.Buffer {member.name}() {{
        MemorySegment s = {member.name}Raw();
        if (s.address() == 0) {{
            return null;
        }}
        return new {pointee_type.java_type()}.Buffer(s);
    }}

    public void {member.name}(@Nullable {pointee_type.java_type()}.Buffer value) {{
        {member.name}Raw(value == null ? MemorySegment.NULL : value.segment());
    }}\n\n'''


def generic_generic_ptr_accessor(pointer_type: CPointerType, member: Member) -> str:
    return f'''    public @pointer(comment="{pointer_type.c_type()}") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="{pointer_type.c_type()}") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}\n\n'''
