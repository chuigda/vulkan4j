from __future__ import annotations
from dataclasses import dataclass

from .ident import Identifier


@dataclass
class Type:
    pass


@dataclass
class IdentifierType(Type):
    identifier: Identifier


@dataclass
class ArrayType(Type):
    element: Type
    length: Identifier


@dataclass
class PointerType(Type):
    pointee: Type
    const: bool
