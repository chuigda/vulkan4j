from .entity import Registry, Entity, RequireValue, Bitmask, Bitflag, Enum, Variant


def extend_registry(registry: Registry):
    added: set[Entity] = set()

    for version in registry.versions.values():
        for ext in version.require.values:
            extend_bitmask(ext, registry.bitmasks, added)
            extend_enum(ext, registry.enums, added, None)

    for extension in registry.extensions.values():
        for ext in extension.require.values:
            extend_bitmask(ext, registry.bitmasks, added)


def extend_bitmask(ext: RequireValue, bitmasks: dict[str, Bitmask], added: set[Entity]):
    bitmask = bitmasks.get(ext.extends)
    bitpos = ext.bitpos

    if bitmask is not None and bitpos is not None:
        value = 1 << bitpos
        bitflag = Bitflag(ext.name, None, value)
        if bitflag not in added:
            added.add(bitflag)
            bitmask.bitflags.append(bitflag)


def extend_enum(ext: RequireValue, enums: dict[str, Enum], added: set[Entity], extnumber: int | None):
    enum = enums.get(ext.extends)
    value = get_variant_value(ext, extnumber)
    if enum is not None and value is not None:
        variant = Variant(ext.name, None, value)
        if variant not in added:
            added.add(variant)
            enum.variants.append(variant)


def get_variant_value(ext: RequireValue, extnumber: int | None) -> int | None:
    if ext.value is not None:
        return ext.value

    if ext.extnumber is None and extnumber is None:
        return None

    if ext.offset is None:
        return None

    number = ext.extnumber if ext.extnumber is not None else extnumber
    offset = ext.offset
    value = 1_000_000_000 + (1_000 * (number - 1)) + offset

    return value if not ext.negative else -value
