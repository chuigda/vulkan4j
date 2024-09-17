from __future__ import annotations
from dataclasses import dataclass


@dataclass
class Type:
    pass


@dataclass
class IdentifierType(Type):
    ident: str


@dataclass
class ArrayType(Type):
    element: Type
    length: str


@dataclass
class PointerType(Type):
    pointee: Type
    const: bool
