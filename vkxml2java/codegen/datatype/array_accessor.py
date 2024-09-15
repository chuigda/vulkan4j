from ..ctype import *
from ...entity import Member


def generate_array_accessor(type_: CArrayType, member: Member) -> str:
    element_type = type_.element
    if isinstance(element_type, CArrayType):
        # try to flatten the array
        new_size = f'{type_.size} * {element_type.size}'
        new_type = CArrayType(element=element_type.element, size=new_size)
        return generate_array_accessor(new_type, member)
    elif isinstance(element_type, CNonRefType):
        return generate_array_nonref_type_accessor(element_type, member)
    elif isinstance(element_type, CStructType) \
            or isinstance(element_type, CUnionType) \
            or isinstance(element_type, CHandleType):
        return generate_array_ref_type_accessor(element_type, member)
    elif isinstance(element_type, CEnumType):
        return generate_array_enum_type_accessor(element_type, member)
    else:
        raise ValueError(f'Unsupported array element type: {element_type} for member {member.name}')


def generate_array_nonref_type_accessor(element_type: CNonRefType, member: Member) -> str:
    return f'''    public MemorySegment {member.name}Raw() {{
        return segment.asSlice(OFFSET${member.name}, LAYOUT${member.name}.byteSize());
    }}
        
    public {element_type.vk4j_array_type()} {member.name}(int index) {{
        return new {element_type.vk4j_array_type_no_sign()}({member.name}Raw(), LAYOUT${member.name}.elementCount());
    }}
    
    public void {member.name}({element_type.vk4j_array_type()} value) {{
        MemorySegment.copy(value.segment(), 0, segment, OFFSET${member.name}, LAYOUT${member.name}.byteSize());
    }}\n\n'''


def generate_array_ref_type_accessor(element_type: CStructType | CUnionType | CHandleType, member: Member) -> str:
    return f'''    public MemorySegment {member.name}Raw() {{
        return segment.asSlice(OFFSET${member.name}, LAYOUT${member.name}.byteSize());
    }}
        
    public {element_type.name}[] {member.name}() {{
        MemorySegment s = {member.name}Raw();
        {element_type.name}[] arr = new {element_type.name}[(int)LAYOUT${member.name}.elementCount()];
        for (int i = 0; i < arr.length; i++) {{
            arr[i] = new {element_type.name}(s.asSlice(i * LAYOUT${member.name}.byteSize(), LAYOUT${member.name}.byteSize()));
        }}
        return arr;
    }}
    
    public void {member.name}({element_type.name}[] value) {{
        MemorySegment s = {member.name}Raw();
        for (int i = 0; i < value.length; i++) {{
            MemorySegment.copy(value[i].segment(), 0, s, i * LAYOUT${member.name}.byteSize(), LAYOUT${member.name}.byteSize());
        }}
    }}

    public {element_type.name} {member.name}At(long index) {{
        MemorySegment s = {member.name}Raw();
        return new {element_type.name}(s.asSlice(index * LAYOUT${member.name}.byteSize(), LAYOUT${member.name}.byteSize()));
    }}
    
    public void {member.name}At(long index, {element_type.name} value) {{
        MemorySegment.copy(value.segment(), 0, {member.name}Raw(), index * LAYOUT${member.name}.byteSize(), LAYOUT${member.name}.byteSize());
    }}\n\n'''


def generate_array_enum_type_accessor(element_type: CEnumType, member: Member) -> str:
    if element_type.bitwidth is None or element_type.bitwidth == 32:
        new_elem_type = CTYPE_INT32
    elif element_type.bitwidth == 64:
        new_elem_type = CTYPE_INT64
    else:
        raise ValueError(f'Unsupported bitwidth for enum type: {element_type.bitwidth}')

    return f'''    public MemorySegment {member.name}Raw() {{
        return segment.asSlice(OFFSET${member.name}, LAYOUT${member.name}.byteSize());
    }}
    
    public {new_elem_type.vk4j_array_type()} {member.name}() {{
        return new {new_elem_type.vk4j_array_type_no_sign()}({member.name}Raw(), LAYOUT${member.name}.elementCount());
    }}
    
    public void {member.name}({new_elem_type.vk4j_array_type()} value) {{
        MemorySegment.copy(value.segment(), 0, segment, OFFSET${member.name}, LAYOUT${member.name}.byteSize());
    }}\n\n'''
