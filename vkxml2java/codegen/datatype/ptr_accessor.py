from ..ctype import *
from ...entity import Member


def generate_pointer_accessor(type_: CPointerType, member: Member) -> str:
    pointee_type = type_.pointee
    if pointee_type == CTYPE_VOID:
        return generate_pvoid_accessor(member)
    elif isinstance(pointee_type, CPointerType):
        return generate_pp_accessor(member)
    elif isinstance(pointee_type, CNonRefType):
        return generate_p_nonref_type_accessor(pointee_type, member)
    elif isinstance(pointee_type, CEnumType):
        return generate_p_enum_type_accessor(pointee_type, member)
    elif isinstance(pointee_type, CStructType) or isinstance(pointee_type, CUnionType) or isinstance(pointee_type, CHandleType):
        return generate_p_ref_type_accessor(pointee_type, member)
    else:
        return generic_generic_ptr_accessor(type_, member)


def generate_pvoid_accessor(member: Member) -> str:
    return f'''    public @pointer(comment="void*") MemorySegment {member.name}() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}(@pointer(comment="void*") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}\n\n'''


def generate_pp_accessor(member: Member) -> str:
    return f'''    public @pointer(comment="void**") MemorySegment {member.name}() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}(@pointer(comment="void**") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}\n\n'''


def generate_p_nonref_type_accessor(pointee_type: CNonRefType, member: Member) -> str:
    return f'''    public @pointer(comment="{pointee_type.c_type()}*") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="{pointee_type.c_type()}*") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}
    
    public {pointee_type.vk4j_ptr_type()} {member.name}() {{
        return new {pointee_type.vk4j_ptr_type_no_sign()}({member.name}Raw());
    }}

    public void {member.name}({pointee_type.vk4j_ptr_type()} value) {{
        {member.name}Raw(value.segment());
    }}\n\n'''


def generate_p_enum_type_accessor(pointee_type: CEnumType, member: Member) -> str:
    if pointee_type.bitwidth is None or pointee_type.bitwidth == 32:
        int_type = CTYPE_INT32
    elif pointee_type.bitwidth == 64:
        int_type = CTYPE_INT64
    else:
        raise ValueError(f'Unsupported bitwidth for enum type: {pointee_type.bitwidth}')



    return f'''    public @pointer(target={pointee_type.name}.class) MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}
    
    public void {member.name}Raw(@pointer(target={pointee_type.name}.class) MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}
    
    public {int_type.vk4j_ptr_type()} {member.name}() {{
        return new {int_type.vk4j_ptr_type_no_sign()}({member.name}Raw());
    }}
    
    public void {member.name}({int_type.vk4j_ptr_type()} value) {{
        {member.name}Raw(value.segment());
    }}\n\n'''


def generate_p_ref_type_accessor(pointee_type: CStructType | CUnionType | CHandleType, member: Member) -> str:
    return f'''    public @pointer(comment="{pointee_type.name}*") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="{pointee_type.name}*") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}
    
    public {pointee_type.java_type()} {member.name}() {{
        MemorySegment s = {member.name}Raw();
        if (s.address() == 0) {{
            return null;
        }}
        return new {pointee_type.java_type()}(s);
    }}

    public void {member.name}({pointee_type.java_type()} value) {{
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        {member.name}Raw(s);
    }}\n\n'''


def generic_generic_ptr_accessor(pointer_type: CPointerType, member: Member) -> str:
    return f'''    public @pointer(comment="{pointer_type.c_type()}") MemorySegment {member.name}Raw() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}Raw(@pointer(comment="{pointer_type.c_type()}") MemorySegment value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}\n\n'''
